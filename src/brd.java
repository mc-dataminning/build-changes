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

public class brd implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xd d = xd.c("optimizeWorld.stage.upgrading.poi");
   static final xd e = xd.c("optimizeWorld.stage.finished.poi");
   static final xd f = xd.c("optimizeWorld.stage.upgrading.entities");
   static final xd g = xd.c("optimizeWorld.stage.finished.entities");
   static final xd h = xd.c("optimizeWorld.stage.upgrading.chunks");
   static final xd i = xd.c("optimizeWorld.stage.finished.chunks");
   final ka<dyl> j;
   final Set<alb<deg>> k;
   final boolean l;
   final boolean m;
   final esv.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alb<deg>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xd y = xd.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final esp A;

   public brd(esv.c $$0, DataFixer $$1, kb $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lv.bc);
      this.k = this.j.g().stream().map(lv::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new esp(this.n.a(deg.h).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xd.c("optimizeWorld.stage.failed");
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
      new brd.d().a();
      a.info("Upgrading POIs");
      new brd.f().a();
      a.info("Upgrading blocks");
      new brd.b().a();
      this.A.b();
      $$0 = ad.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alb<deg>> c() {
      return this.k;
   }

   public float a(alb<deg> $$0) {
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

   public xd h() {
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
      private final xd d;
      private final xd e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bam b;

      a(final bam $$0, final String $$1, final String $$2, final xd $$3, final xd $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brd.this.u = 0;
         brd.this.t = 0;
         brd.this.v = 0;
         brd.this.w = 0;
         List<brd.c<T>> $$0 = this.b();
         if (brd.this.t != 0) {
            float $$1 = (float)brd.this.u;
            brd.this.y = this.d;

            while (brd.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brd.c<T> $$4 : $$0) {
                  alb<deg> $$5 = $$4.a;
                  ListIterator<brd.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brd.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (ddm $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brd.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brd.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brd.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brd.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brd.this.y = this.e;

            for (brd.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brd.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brd.c<T>> b() {
         List<brd.c<T>> $$0 = Lists.newArrayList();

         for (alb<deg> $$1 : brd.this.k) {
            dyd $$2 = new dyd(brd.this.n.f(), $$1, this.f);
            Path $$3 = brd.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brd.e> $$5 = this.b($$2, $$3);
            $$0.add(new brd.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dyd var1, Path var2);

      private ListIterator<brd.e> b(dyd $$0, Path $$1) {
         List<brd.e> $$2 = c($$0, $$1);
         brd.this.u = brd.this.u + $$2.size();
         brd.this.t = brd.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brd.e> c(dyd $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brd.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brd.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<ddm> $$8 = Lists.newArrayList();

                  try (dya $$9 = new dya($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           ddm $$12 = new ddm($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brd.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brd.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alb<deg> $$0, T $$1, ddm $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brd.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brd.this.v++;
         } else {
            brd.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, ddm var2, alb<deg> var3);

      private void a(dya $$0) {
         if (brd.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brd.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brd.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brd.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brd.a<dxu> {
      b() {
         super(bam.c, "chunk", "region", brd.h, brd.i);
      }

      protected boolean a(dxu $$0, ddm $$1, alb<deg> $$2) {
         uf $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dxu.a($$3);
            dwl $$5 = brd.this.j.f(lv.b($$2)).b();
            uf $$6 = $$0.a($$2, () -> brd.this.A, $$3, $$5.c());
            ddm $$7 = new ddm($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brd.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brd.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ul $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  uf $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brd.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected dxu b(dyd $$0, Path $$1) {
         return (dxu)(brd.this.m ? new dxx($$0.a("source"), $$1, $$0.a("target"), brd.a($$1), brd.this.p, true) : new dxu($$0, $$1, brd.this.p, true));
      }
   }

   static record c<T>(alb<deg> a, T b, ListIterator<brd.e> c) {
   }

   class d extends brd.g {
      d() {
         super(bam.s, "entities", brd.f, brd.g);
      }

      @Override
      protected uf a(dyg $$0, uf $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dya a, List<ddm> b) {
   }

   class f extends brd.g {
      f() {
         super(bam.q, "poi", brd.d, brd.e);
      }

      @Override
      protected uf a(dyg $$0, uf $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brd.a<dyg> {
      g(final bam $$0, final String $$1, final xd $$2, final xd $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dyg b(dyd $$0, Path $$1) {
         return (dyg)(brd.this.m
            ? new dxy($$0.a("source"), $$1, $$0.a("target"), brd.a($$1), brd.this.p, true, this.b)
            : new dyg($$0, $$1, brd.this.p, true, this.b));
      }

      protected boolean a(dyg $$0, ddm $$1, alb<deg> $$2) {
         uf $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dxu.a($$3);
            uf $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brd.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract uf a(dyg var1, uf var2);
   }
}
