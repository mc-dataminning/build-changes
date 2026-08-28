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

public class bqf {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xn d = wz.c("optimizeWorld.stage.upgrading.poi");
   static final xn e = wz.c("optimizeWorld.stage.finished.poi");
   static final xn f = wz.c("optimizeWorld.stage.upgrading.entities");
   static final xn g = wz.c("optimizeWorld.stage.finished.entities");
   static final xn h = wz.c("optimizeWorld.stage.upgrading.chunks");
   static final xn i = wz.c("optimizeWorld.stage.finished.chunks");
   final jz<dwz> j;
   final Set<akq<dcw>> k;
   final boolean l;
   final boolean m;
   final erd.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akq<dcw>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wz y = wz.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eqx A;

   public bqf(erd.c $$0, DataFixer $$1, ka $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lu.bb);
      this.k = this.j.g().stream().map(lu::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eqx(this.n.a(dcw.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wz.c("optimizeWorld.stage.failed");
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
      long $$0 = ad.c();
      a.info("Upgrading entities");
      new bqf.d().a();
      a.info("Upgrading POIs");
      new bqf.f().a();
      a.info("Upgrading blocks");
      new bqf.b().a();
      this.A.a();
      $$0 = ad.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akq<dcw>> c() {
      return this.k;
   }

   public float a(akq<dcw> $$0) {
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

   public wz h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xn d;
      private final xn e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final azw b;

      a(final azw $$0, final String $$1, final String $$2, final xn $$3, final xn $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqf.this.u = 0;
         bqf.this.t = 0;
         bqf.this.v = 0;
         bqf.this.w = 0;
         List<bqf.c<T>> $$0 = this.b();
         if (bqf.this.t != 0) {
            float $$1 = (float)bqf.this.u;
            bqf.this.y = this.d;

            while (bqf.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqf.c<T> $$4 : $$0) {
                  akq<dcw> $$5 = $$4.a;
                  ListIterator<bqf.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqf.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dcd $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqf.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqf.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqf.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqf.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqf.this.y = this.e;

            for (bqf.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqf.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqf.c<T>> b() {
         List<bqf.c<T>> $$0 = Lists.newArrayList();

         for (akq<dcw> $$1 : bqf.this.k) {
            dws $$2 = new dws(bqf.this.n.f(), $$1, this.f);
            Path $$3 = bqf.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqf.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqf.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dws var1, Path var2);

      private ListIterator<bqf.e> b(dws $$0, Path $$1) {
         List<bqf.e> $$2 = c($$0, $$1);
         bqf.this.u = bqf.this.u + $$2.size();
         bqf.this.t = bqf.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqf.e> c(dws $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqf.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqf.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dcd> $$8 = Lists.newArrayList();

                  try (dwp $$9 = new dwp($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dcd $$12 = new dcd($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqf.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqf.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akq<dcw> $$0, T $$1, dcd $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqf.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqf.this.v++;
         } else {
            bqf.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dcd var2, akq<dcw> var3);

      private void a(dwp $$0) {
         if (bqf.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqf.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqf.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqf.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqf.a<dwj> {
      b() {
         super(azw.c, "chunk", "region", bqf.h, bqf.i);
      }

      protected boolean a(dwj $$0, dcd $$1, akq<dcw> $$2) {
         ub $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwj.a($$3);
            duz $$5 = bqf.this.j.f(lu.b($$2)).b();
            ub $$6 = $$0.a($$2, () -> bqf.this.A, $$3, $$5.c());
            dcd $$7 = new dcd($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqf.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bqf.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uh $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ub $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bqf.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dwj b(dws $$0, Path $$1) {
         return (dwj)(bqf.this.m ? new dwm($$0.a("source"), $$1, $$0.a("target"), bqf.a($$1), bqf.this.p, true) : new dwj($$0, $$1, bqf.this.p, true));
      }
   }

   static record c<T>(akq<dcw> a, T b, ListIterator<bqf.e> c) {
   }

   class d extends bqf.g {
      d() {
         super(azw.s, "entities", bqf.f, bqf.g);
      }

      @Override
      protected ub a(dwu $$0, ub $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dwp a, List<dcd> b) {
   }

   class f extends bqf.g {
      f() {
         super(azw.q, "poi", bqf.d, bqf.e);
      }

      @Override
      protected ub a(dwu $$0, ub $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqf.a<dwu> {
      g(final azw $$0, final String $$1, final xn $$2, final xn $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dwu b(dws $$0, Path $$1) {
         return (dwu)(bqf.this.m
            ? new dwn($$0.a("source"), $$1, $$0.a("target"), bqf.a($$1), bqf.this.p, true, this.b)
            : new dwu($$0, $$1, bqf.this.p, true, this.b));
      }

      protected boolean a(dwu $$0, dcd $$1, akq<dcw> $$2) {
         ub $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwj.a($$3);
            ub $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bqf.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ub a(dwu var1, ub var2);
   }
}
