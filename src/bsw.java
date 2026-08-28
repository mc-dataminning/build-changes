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

public class bsw implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xv d = xv.c("optimizeWorld.stage.upgrading.poi");
   static final xv e = xv.c("optimizeWorld.stage.finished.poi");
   static final xv f = xv.c("optimizeWorld.stage.upgrading.entities");
   static final xv g = xv.c("optimizeWorld.stage.finished.entities");
   static final xv h = xv.c("optimizeWorld.stage.upgrading.chunks");
   static final xv i = xv.c("optimizeWorld.stage.finished.chunks");
   final kd<ebq> j;
   final Set<aly<dhh>> k;
   final boolean l;
   final boolean m;
   final ewc.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aly<dhh>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xv y = xv.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final evw A;

   public bsw(ewc.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mb.bf);
      this.k = this.j.j().stream().map(mb::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new evw(this.n.a(dhh.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xv.c("optimizeWorld.stage.failed");
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
      long $$0 = ae.c();
      a.info("Upgrading entities");
      new bsw.d().a();
      a.info("Upgrading POIs");
      new bsw.f().a();
      a.info("Upgrading blocks");
      new bsw.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aly<dhh>> c() {
      return this.k;
   }

   public float a(aly<dhh> $$0) {
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

   public xv h() {
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
      private final xv d;
      private final xv e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbs b;

      a(final bbs $$0, final String $$1, final String $$2, final xv $$3, final xv $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bsw.this.u = 0;
         bsw.this.t = 0;
         bsw.this.v = 0;
         bsw.this.w = 0;
         List<bsw.c<T>> $$0 = this.b();
         if (bsw.this.t != 0) {
            float $$1 = (float)bsw.this.u;
            bsw.this.y = this.d;

            while (bsw.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bsw.c<T> $$4 : $$0) {
                  aly<dhh> $$5 = $$4.a;
                  ListIterator<bsw.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bsw.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dgn $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bsw.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bsw.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bsw.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bsw.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bsw.this.y = this.e;

            for (bsw.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bsw.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bsw.c<T>> b() {
         List<bsw.c<T>> $$0 = Lists.newArrayList();

         for (aly<dhh> $$1 : bsw.this.k) {
            ebi $$2 = new ebi(bsw.this.n.f(), $$1, this.f);
            Path $$3 = bsw.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bsw.e> $$5 = this.b($$2, $$3);
            $$0.add(new bsw.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ebi var1, Path var2);

      private ListIterator<bsw.e> b(ebi $$0, Path $$1) {
         List<bsw.e> $$2 = c($$0, $$1);
         bsw.this.u = bsw.this.u + $$2.size();
         bsw.this.t = bsw.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bsw.e> c(ebi $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bsw.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bsw.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dgn> $$8 = Lists.newArrayList();

                  try (ebf $$9 = new ebf($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dgn $$12 = new dgn($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bsw.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bsw.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aly<dhh> $$0, T $$1, dgn $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bsw.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bsw.this.v++;
         } else {
            bsw.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dgn var2, aly<dhh> var3);

      private void a(ebf $$0) {
         if (bsw.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bsw.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bsw.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bsw.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bsw.a<eaz> {
      b() {
         super(bbs.c, "chunk", "region", bsw.h, bsw.i);
      }

      protected boolean a(eaz $$0, dgn $$1, aly<dhh> $$2) {
         ux $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eaz.a($$3);
            dzq $$5 = bsw.this.j.g(mb.b($$2)).b();
            ux $$6 = $$0.a($$2, () -> bsw.this.A, $$3, $$5.c());
            dgn $$7 = new dgn($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bsw.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bsw.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               vd $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ux $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bsw.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eaz b(ebi $$0, Path $$1) {
         return (eaz)(bsw.this.m ? new ebc($$0.a("source"), $$1, $$0.a("target"), bsw.a($$1), bsw.this.p, true) : new eaz($$0, $$1, bsw.this.p, true));
      }
   }

   static record c<T>(aly<dhh> a, T b, ListIterator<bsw.e> c) {
   }

   class d extends bsw.g {
      d() {
         super(bbs.s, "entities", bsw.f, bsw.g);
      }

      @Override
      protected ux a(ebl $$0, ux $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(ebf a, List<dgn> b) {
   }

   class f extends bsw.g {
      f() {
         super(bbs.q, "poi", bsw.d, bsw.e);
      }

      @Override
      protected ux a(ebl $$0, ux $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bsw.a<ebl> {
      g(final bbs $$0, final String $$1, final xv $$2, final xv $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ebl b(ebi $$0, Path $$1) {
         return (ebl)(bsw.this.m
            ? new ebd($$0.a("source"), $$1, $$0.a("target"), bsw.a($$1), bsw.this.p, true, this.b)
            : new ebl($$0, $$1, bsw.this.p, true, this.b));
      }

      protected boolean a(ebl $$0, dgn $$1, aly<dhh> $$2) {
         ux $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eaz.a($$3);
            ux $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bsw.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ux a(ebl var1, ux var2);
   }
}
