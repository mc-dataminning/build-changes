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

public class bno {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wu d = wg.c("optimizeWorld.stage.upgrading.poi");
   static final wu e = wg.c("optimizeWorld.stage.finished.poi");
   static final wu f = wg.c("optimizeWorld.stage.upgrading.entities");
   static final wu g = wg.c("optimizeWorld.stage.finished.entities");
   static final wu h = wg.c("optimizeWorld.stage.upgrading.chunks");
   static final wu i = wg.c("optimizeWorld.stage.finished.chunks");
   final iy<dss> j;
   final Set<ajs<cyx>> k;
   final boolean l;
   final boolean m;
   final emr.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ajs<cyx>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wg y = wg.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eml A;

   public bno(emr.c $$0, DataFixer $$1, iz $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(ks.aP);
      this.k = this.j.f().stream().map(ks::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eml(this.n.a(cyx.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wg.c("optimizeWorld.stage.failed");
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
      long $$0 = ac.b();
      a.info("Upgrading entities");
      new bno.d().a();
      a.info("Upgrading POIs");
      new bno.f().a();
      a.info("Upgrading blocks");
      new bno.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ajs<cyx>> c() {
      return this.k;
   }

   public float a(ajs<cyx> $$0) {
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

   public wg h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final wu d;
      private final wu e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final ayq b;

      a(ayq $$0, String $$1, String $$2, wu $$3, wu $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bno.this.u = 0;
         bno.this.t = 0;
         bno.this.v = 0;
         bno.this.w = 0;
         List<bno.c<T>> $$0 = this.b();
         if (bno.this.t != 0) {
            float $$1 = (float)bno.this.u;
            bno.this.y = this.d;

            while (bno.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bno.c<T> $$4 : $$0) {
                  ajs<cyx> $$5 = $$4.a;
                  ListIterator<bno.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bno.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (cye $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bno.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bno.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bno.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bno.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bno.this.y = this.e;

            for (bno.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bno.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bno.c<T>> b() {
         List<bno.c<T>> $$0 = Lists.newArrayList();

         for (ajs<cyx> $$1 : bno.this.k) {
            dsl $$2 = new dsl(bno.this.n.f(), $$1, this.f);
            Path $$3 = bno.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bno.e> $$5 = this.b($$2, $$3);
            $$0.add(new bno.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dsl var1, Path var2);

      private ListIterator<bno.e> b(dsl $$0, Path $$1) {
         List<bno.e> $$2 = c($$0, $$1);
         bno.this.u = bno.this.u + $$2.size();
         bno.this.t = bno.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bno.e> c(dsl $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bno.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bno.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<cye> $$8 = Lists.newArrayList();

                  try (dsi $$9 = new dsi($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           cye $$12 = new cye($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bno.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bno.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ajs<cyx> $$0, T $$1, cye $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bno.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bno.this.v++;
         } else {
            bno.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, cye var2, ajs<cyx> var3);

      private void a(dsi $$0) {
         if (bno.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bno.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bno.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bno.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bno.a<dsc> {
      b() {
         super(ayq.c, "chunk", "region", bno.h, bno.i);
      }

      protected boolean a(dsc $$0, cye $$1, ajs<cyx> $$2) {
         tm $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dsc.a($$3);
            dqw $$5 = bno.this.j.f(ks.b($$2)).b();
            tm $$6 = $$0.a($$2, () -> bno.this.A, $$3, $$5.b());
            cye $$7 = new cye($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bno.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bno.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ts $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tm $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bno.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dsc b(dsl $$0, Path $$1) {
         return (dsc)(bno.this.m ? new dsf($$0.a("source"), $$1, $$0.a("target"), bno.a($$1), bno.this.p, true) : new dsc($$0, $$1, bno.this.p, true));
      }
   }

   static record c<T>(ajs<cyx> a, T b, ListIterator<bno.e> c) {
   }

   class d extends bno.g {
      d() {
         super(ayq.s, "entities", bno.f, bno.g);
      }

      @Override
      protected tm a(dsn $$0, tm $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dsi a, List<cye> b) {
   }

   class f extends bno.g {
      f() {
         super(ayq.q, "poi", bno.d, bno.e);
      }

      @Override
      protected tm a(dsn $$0, tm $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bno.a<dsn> {
      g(ayq $$0, String $$1, wu $$2, wu $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dsn b(dsl $$0, Path $$1) {
         return (dsn)(bno.this.m
            ? new dsg($$0.a("source"), $$1, $$0.a("target"), bno.a($$1), bno.this.p, true, this.b)
            : new dsn($$0, $$1, bno.this.p, true, this.b));
      }

      protected boolean a(dsn $$0, cye $$1, ajs<cyx> $$2) {
         tm $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dsc.a($$3);
            tm $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bno.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tm a(dsn var1, tm var2);
   }
}
