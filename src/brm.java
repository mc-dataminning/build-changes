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

public class brm implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xh d = xh.c("optimizeWorld.stage.upgrading.poi");
   static final xh e = xh.c("optimizeWorld.stage.finished.poi");
   static final xh f = xh.c("optimizeWorld.stage.upgrading.entities");
   static final xh g = xh.c("optimizeWorld.stage.finished.entities");
   static final xh h = xh.c("optimizeWorld.stage.upgrading.chunks");
   static final xh i = xh.c("optimizeWorld.stage.finished.chunks");
   final kc<dza> j;
   final Set<alg<dev>> k;
   final boolean l;
   final boolean m;
   final etk.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alg<dev>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xh y = xh.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final ete A;

   public brm(etk.c $$0, DataFixer $$1, kd $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(ly.bc);
      this.k = this.j.j().stream().map(ly::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new ete(this.n.a(dev.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xh.c("optimizeWorld.stage.failed");
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
      new brm.d().a();
      a.info("Upgrading POIs");
      new brm.f().a();
      a.info("Upgrading blocks");
      new brm.b().a();
      this.A.b();
      $$0 = ad.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alg<dev>> c() {
      return this.k;
   }

   public float a(alg<dev> $$0) {
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

   public xh h() {
      return this.y;
   }

   @Override
   public void close() {
      this.A.close();
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xh d;
      private final xh e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bas b;

      a(final bas $$0, final String $$1, final String $$2, final xh $$3, final xh $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brm.this.u = 0;
         brm.this.t = 0;
         brm.this.v = 0;
         brm.this.w = 0;
         List<brm.c<T>> $$0 = this.b();
         if (brm.this.t != 0) {
            float $$1 = (float)brm.this.u;
            brm.this.y = this.d;

            while (brm.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brm.c<T> $$4 : $$0) {
                  alg<dev> $$5 = $$4.a;
                  ListIterator<brm.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brm.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (deb $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brm.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brm.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brm.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brm.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brm.this.y = this.e;

            for (brm.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brm.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brm.c<T>> b() {
         List<brm.c<T>> $$0 = Lists.newArrayList();

         for (alg<dev> $$1 : brm.this.k) {
            dys $$2 = new dys(brm.this.n.f(), $$1, this.f);
            Path $$3 = brm.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brm.e> $$5 = this.b($$2, $$3);
            $$0.add(new brm.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dys var1, Path var2);

      private ListIterator<brm.e> b(dys $$0, Path $$1) {
         List<brm.e> $$2 = c($$0, $$1);
         brm.this.u = brm.this.u + $$2.size();
         brm.this.t = brm.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brm.e> c(dys $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brm.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brm.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<deb> $$8 = Lists.newArrayList();

                  try (dyp $$9 = new dyp($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           deb $$12 = new deb($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brm.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brm.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alg<dev> $$0, T $$1, deb $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brm.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brm.this.v++;
         } else {
            brm.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, deb var2, alg<dev> var3);

      private void a(dyp $$0) {
         if (brm.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brm.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brm.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brm.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brm.a<dyj> {
      b() {
         super(bas.c, "chunk", "region", brm.h, brm.i);
      }

      protected boolean a(dyj $$0, deb $$1, alg<dev> $$2) {
         uj $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyj.a($$3);
            dxa $$5 = brm.this.j.g(ly.b($$2)).b();
            uj $$6 = $$0.a($$2, () -> brm.this.A, $$3, $$5.c());
            deb $$7 = new deb($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brm.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brm.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               up $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  uj $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brm.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected dyj b(dys $$0, Path $$1) {
         return (dyj)(brm.this.m ? new dym($$0.a("source"), $$1, $$0.a("target"), brm.a($$1), brm.this.p, true) : new dyj($$0, $$1, brm.this.p, true));
      }
   }

   static record c<T>(alg<dev> a, T b, ListIterator<brm.e> c) {
   }

   class d extends brm.g {
      d() {
         super(bas.s, "entities", brm.f, brm.g);
      }

      @Override
      protected uj a(dyv $$0, uj $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dyp a, List<deb> b) {
   }

   class f extends brm.g {
      f() {
         super(bas.q, "poi", brm.d, brm.e);
      }

      @Override
      protected uj a(dyv $$0, uj $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brm.a<dyv> {
      g(final bas $$0, final String $$1, final xh $$2, final xh $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dyv b(dys $$0, Path $$1) {
         return (dyv)(brm.this.m
            ? new dyn($$0.a("source"), $$1, $$0.a("target"), brm.a($$1), brm.this.p, true, this.b)
            : new dyv($$0, $$1, brm.this.p, true, this.b));
      }

      protected boolean a(dyv $$0, deb $$1, alg<dev> $$2) {
         uj $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyj.a($$3);
            uj $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brm.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract uj a(dyv var1, uj var2);
   }
}
