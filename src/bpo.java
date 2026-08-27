import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bpo {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xs d = xe.c("optimizeWorld.stage.upgrading.poi");
   static final xs e = xe.c("optimizeWorld.stage.finished.poi");
   static final xs f = xe.c("optimizeWorld.stage.upgrading.entities");
   static final xs g = xe.c("optimizeWorld.stage.finished.entities");
   static final xs h = xe.c("optimizeWorld.stage.upgrading.chunks");
   static final xs i = xe.c("optimizeWorld.stage.finished.chunks");
   final jn<dwv> j;
   final Set<aks<dca>> k;
   final boolean l;
   final boolean m;
   final erf.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aks<dca>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xe y = xe.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eqz A;

   public bpo(erf.c $$0, DataFixer $$1, jo $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(li.aT);
      this.k = this.j.f().stream().map(li::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eqz(this.n.a(dca.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xe.c("optimizeWorld.stage.failed");
         this.r = true;
      });
      this.o.start();
   }

   public void a() {
      this.q = false;

      try {
         this.o.join();
      } catch (InterruptedException var2) {
      }
   }

   private void i() {
      long $$0 = ad.b();
      a.info("Upgrading entities");
      new bpo.d().a();
      a.info("Upgrading POIs");
      new bpo.f().a();
      a.info("Upgrading blocks");
      new bpo.b().a();
      this.A.a();
      $$0 = ad.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aks<dca>> c() {
      return this.k;
   }

   public float a(aks<dca> $$0) {
      return this.x.getFloat($$0);
   }

   public float d() {
      return this.s;
   }

   public int e() {
      return this.t;
   }

   public int f() {
      return this.v;
   }

   public int g() {
      return this.w;
   }

   public xe h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xs d;
      private final xs e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final azs b;

      a(azs $$0, String $$1, String $$2, xs $$3, xs $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bpo.this.u = 0;
         bpo.this.t = 0;
         bpo.this.v = 0;
         bpo.this.w = 0;
         List<bpo.c<T>> $$0 = this.b();
         if (bpo.this.t != 0) {
            float $$1 = (float)bpo.this.u;
            bpo.this.y = this.d;

            while (bpo.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bpo.c<T> $$4 : $$0) {
                  aks<dca> $$5 = $$4.a;
                  ListIterator<bpo.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bpo.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbh $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bpo.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bpo.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bpo.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bpo.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bpo.this.y = this.e;

            for (bpo.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bpo.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bpo.c<T>> b() {
         List<bpo.c<T>> $$0 = Lists.newArrayList();

         for (aks<dca> $$1 : bpo.this.k) {
            dwo $$2 = new dwo(bpo.this.n.f(), $$1, this.f);
            Path $$3 = bpo.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bpo.e> $$5 = this.b($$2, $$3);
            $$0.add(new bpo.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dwo var1, Path var2);

      private ListIterator<bpo.e> b(dwo $$0, Path $$1) {
         List<bpo.e> $$2 = c($$0, $$1);
         bpo.this.u = bpo.this.u + $$2.size();
         bpo.this.t = bpo.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bpo.e> c(dwo $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bpo.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bpo.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbh> $$8 = Lists.newArrayList();

                  try (dwl $$9 = new dwl($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbh $$12 = new dbh($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bpo.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bpo.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aks<dca> $$0, T $$1, dbh $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bpo.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bpo.this.v++;
         } else {
            bpo.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbh var2, aks<dca> var3);

      private void a(dwl $$0) {
         if (bpo.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bpo.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bpo.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bpo.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bpo.a<dwf> {
      b() {
         super(azs.c, "chunk", "region", bpo.h, bpo.i);
      }

      protected boolean a(dwf $$0, dbh $$1, aks<dca> $$2) {
         uk $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwf.a($$3);
            duz $$5 = bpo.this.j.f(li.b($$2)).b();
            uk $$6 = $$0.a($$2, () -> bpo.this.A, $$3, $$5.b());
            dbh $$7 = new dbh($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bpo.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bpo.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uq $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  uk $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bpo.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dwf b(dwo $$0, Path $$1) {
         return (dwf)(bpo.this.m ? new dwi($$0.a("source"), $$1, $$0.a("target"), bpo.a($$1), bpo.this.p, true) : new dwf($$0, $$1, bpo.this.p, true));
      }
   }

   static record c<T>(aks<dca> a, T b, ListIterator<bpo.e> c) {
   }

   class d extends bpo.g {
      d() {
         super(azs.s, "entities", bpo.f, bpo.g);
      }

      @Override
      protected uk a(dwq $$0, uk $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dwl a, List<dbh> b) {
   }

   class f extends bpo.g {
      f() {
         super(azs.q, "poi", bpo.d, bpo.e);
      }

      @Override
      protected uk a(dwq $$0, uk $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bpo.a<dwq> {
      g(azs $$0, String $$1, xs $$2, xs $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dwq b(dwo $$0, Path $$1) {
         return (dwq)(bpo.this.m
            ? new dwj($$0.a("source"), $$1, $$0.a("target"), bpo.a($$1), bpo.this.p, true, this.b)
            : new dwq($$0, $$1, bpo.this.p, true, this.b));
      }

      protected boolean a(dwq $$0, dbh $$1, aks<dca> $$2) {
         uk $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwf.a($$3);
            uk $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bpo.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract uk a(dwq var1, uk var2);
   }
}
