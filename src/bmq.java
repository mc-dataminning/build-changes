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

public class bmq {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wi d = vu.c("optimizeWorld.stage.upgrading.poi");
   static final wi e = vu.c("optimizeWorld.stage.finished.poi");
   static final wi f = vu.c("optimizeWorld.stage.upgrading.entities");
   static final wi g = vu.c("optimizeWorld.stage.finished.entities");
   static final wi h = vu.c("optimizeWorld.stage.upgrading.chunks");
   static final wi i = vu.c("optimizeWorld.stage.finished.chunks");
   final iy<dqn> j;
   final Set<ajg<cwz>> k;
   final boolean l;
   final boolean m;
   final ekk.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ajg<cwz>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile vu y = vu.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eke A;

   public bmq(ekk.c $$0, DataFixer $$1, iz $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(kj.aO);
      this.k = this.j.f().stream().map(kj::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eke(this.n.a(cwz.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = vu.c("optimizeWorld.stage.failed");
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
      new bmq.d().a();
      a.info("Upgrading POIs");
      new bmq.f().a();
      a.info("Upgrading blocks");
      new bmq.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ajg<cwz>> c() {
      return this.k;
   }

   public float a(ajg<cwz> $$0) {
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

   public vu h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final wi d;
      private final wi e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final ayc b;

      a(ayc $$0, String $$1, String $$2, wi $$3, wi $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bmq.this.u = 0;
         bmq.this.t = 0;
         bmq.this.v = 0;
         bmq.this.w = 0;
         List<bmq.c<T>> $$0 = this.b();
         if (bmq.this.t != 0) {
            float $$1 = (float)bmq.this.u;
            bmq.this.y = this.d;

            while (bmq.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bmq.c<T> $$4 : $$0) {
                  ajg<cwz> $$5 = $$4.a;
                  ListIterator<bmq.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bmq.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (cwg $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bmq.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bmq.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bmq.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bmq.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bmq.this.y = this.e;

            for (bmq.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bmq.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bmq.c<T>> b() {
         List<bmq.c<T>> $$0 = Lists.newArrayList();

         for (ajg<cwz> $$1 : bmq.this.k) {
            dqg $$2 = new dqg(bmq.this.n.d(), $$1, this.f);
            Path $$3 = bmq.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bmq.e> $$5 = this.b($$2, $$3);
            $$0.add(new bmq.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dqg var1, Path var2);

      private ListIterator<bmq.e> b(dqg $$0, Path $$1) {
         List<bmq.e> $$2 = c($$0, $$1);
         bmq.this.u = bmq.this.u + $$2.size();
         bmq.this.t = bmq.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bmq.e> c(dqg $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bmq.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bmq.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<cwg> $$8 = Lists.newArrayList();

                  try (dqd $$9 = new dqd($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           cwg $$12 = new cwg($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bmq.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bmq.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ajg<cwz> $$0, T $$1, cwg $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bmq.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bmq.this.v++;
         } else {
            bmq.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, cwg var2, ajg<cwz> var3);

      private void a(dqd $$0) {
         if (bmq.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bmq.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bmq.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bmq.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bmq.a<dpx> {
      b() {
         super(ayc.c, "chunk", "region", bmq.h, bmq.i);
      }

      protected boolean a(dpx $$0, cwg $$1, ajg<cwz> $$2) {
         ta $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dpx.a($$3);
            dow $$5 = bmq.this.j.f(kj.b($$2)).b();
            ta $$6 = $$0.a($$2, () -> bmq.this.A, $$3, $$5.b());
            cwg $$7 = new cwg($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bmq.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bmq.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               tg $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ta $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bmq.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dpx b(dqg $$0, Path $$1) {
         return (dpx)(bmq.this.m ? new dqa($$0.a("source"), $$1, $$0.a("target"), bmq.a($$1), bmq.this.p, true) : new dpx($$0, $$1, bmq.this.p, true));
      }
   }

   static record c<T>(ajg<cwz> a, T b, ListIterator<bmq.e> c) {
   }

   class d extends bmq.g {
      d() {
         super(ayc.s, "entities", bmq.f, bmq.g);
      }

      @Override
      protected ta a(dqi $$0, ta $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dqd a, List<cwg> b) {
   }

   class f extends bmq.g {
      f() {
         super(ayc.q, "poi", bmq.d, bmq.e);
      }

      @Override
      protected ta a(dqi $$0, ta $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bmq.a<dqi> {
      g(ayc $$0, String $$1, wi $$2, wi $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dqi b(dqg $$0, Path $$1) {
         return (dqi)(bmq.this.m
            ? new dqb($$0.a("source"), $$1, $$0.a("target"), bmq.a($$1), bmq.this.p, true, this.b)
            : new dqi($$0, $$1, bmq.this.p, true, this.b));
      }

      protected boolean a(dqi $$0, cwg $$1, ajg<cwz> $$2) {
         ta $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dpx.a($$3);
            ta $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bmq.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ta a(dqi var1, ta var2);
   }
}
