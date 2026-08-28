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

public class bqd {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xz d = xl.c("optimizeWorld.stage.upgrading.poi");
   static final xz e = xl.c("optimizeWorld.stage.finished.poi");
   static final xz f = xl.c("optimizeWorld.stage.upgrading.entities");
   static final xz g = xl.c("optimizeWorld.stage.finished.entities");
   static final xz h = xl.c("optimizeWorld.stage.upgrading.chunks");
   static final xz i = xl.c("optimizeWorld.stage.finished.chunks");
   final jv<dvq> j;
   final Set<ala<dbt>> k;
   final boolean l;
   final boolean m;
   final epr.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ala<dbt>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xl y = xl.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final epl A;

   public bqd(epr.c $$0, DataFixer $$1, jw $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lq.aT);
      this.k = this.j.f().stream().map(lq::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new epl(this.n.a(dbt.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xl.c("optimizeWorld.stage.failed");
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
      long $$0 = ac.c();
      a.info("Upgrading entities");
      new bqd.d().a();
      a.info("Upgrading POIs");
      new bqd.f().a();
      a.info("Upgrading blocks");
      new bqd.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ala<dbt>> c() {
      return this.k;
   }

   public float a(ala<dbt> $$0) {
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

   public xl h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xz d;
      private final xz e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bab b;

      a(final bab $$0, final String $$1, final String $$2, final xz $$3, final xz $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqd.this.u = 0;
         bqd.this.t = 0;
         bqd.this.v = 0;
         bqd.this.w = 0;
         List<bqd.c<T>> $$0 = this.b();
         if (bqd.this.t != 0) {
            float $$1 = (float)bqd.this.u;
            bqd.this.y = this.d;

            while (bqd.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqd.c<T> $$4 : $$0) {
                  ala<dbt> $$5 = $$4.a;
                  ListIterator<bqd.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqd.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dba $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqd.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqd.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqd.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqd.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqd.this.y = this.e;

            for (bqd.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqd.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqd.c<T>> b() {
         List<bqd.c<T>> $$0 = Lists.newArrayList();

         for (ala<dbt> $$1 : bqd.this.k) {
            dvj $$2 = new dvj(bqd.this.n.f(), $$1, this.f);
            Path $$3 = bqd.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqd.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqd.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvj var1, Path var2);

      private ListIterator<bqd.e> b(dvj $$0, Path $$1) {
         List<bqd.e> $$2 = c($$0, $$1);
         bqd.this.u = bqd.this.u + $$2.size();
         bqd.this.t = bqd.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqd.e> c(dvj $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqd.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqd.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dba> $$8 = Lists.newArrayList();

                  try (dvg $$9 = new dvg($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dba $$12 = new dba($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqd.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqd.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ala<dbt> $$0, T $$1, dba $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqd.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqd.this.v++;
         } else {
            bqd.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dba var2, ala<dbt> var3);

      private void a(dvg $$0) {
         if (bqd.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqd.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqd.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqd.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqd.a<dva> {
      b() {
         super(bab.c, "chunk", "region", bqd.h, bqd.i);
      }

      protected boolean a(dva $$0, dba $$1, ala<dbt> $$2) {
         ur $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dva.a($$3);
            dtu $$5 = bqd.this.j.f(lq.b($$2)).b();
            ur $$6 = $$0.a($$2, () -> bqd.this.A, $$3, $$5.b());
            dba $$7 = new dba($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqd.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bqd.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ux $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ur $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bqd.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dva b(dvj $$0, Path $$1) {
         return (dva)(bqd.this.m ? new dvd($$0.a("source"), $$1, $$0.a("target"), bqd.a($$1), bqd.this.p, true) : new dva($$0, $$1, bqd.this.p, true));
      }
   }

   static record c<T>(ala<dbt> a, T b, ListIterator<bqd.e> c) {
   }

   class d extends bqd.g {
      d() {
         super(bab.s, "entities", bqd.f, bqd.g);
      }

      @Override
      protected ur a(dvl $$0, ur $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvg a, List<dba> b) {
   }

   class f extends bqd.g {
      f() {
         super(bab.q, "poi", bqd.d, bqd.e);
      }

      @Override
      protected ur a(dvl $$0, ur $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqd.a<dvl> {
      g(final bab $$0, final String $$1, final xz $$2, final xz $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dvl b(dvj $$0, Path $$1) {
         return (dvl)(bqd.this.m
            ? new dve($$0.a("source"), $$1, $$0.a("target"), bqd.a($$1), bqd.this.p, true, this.b)
            : new dvl($$0, $$1, bqd.this.p, true, this.b));
      }

      protected boolean a(dvl $$0, dba $$1, ala<dbt> $$2) {
         ur $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dva.a($$3);
            ur $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bqd.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ur a(dvl var1, ur var2);
   }
}
