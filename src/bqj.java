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

public class bqj {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final yd d = xp.c("optimizeWorld.stage.upgrading.poi");
   static final yd e = xp.c("optimizeWorld.stage.finished.poi");
   static final yd f = xp.c("optimizeWorld.stage.upgrading.entities");
   static final yd g = xp.c("optimizeWorld.stage.finished.entities");
   static final yd h = xp.c("optimizeWorld.stage.upgrading.chunks");
   static final yd i = xp.c("optimizeWorld.stage.finished.chunks");
   final jv<dvw> j;
   final Set<ale<dbz>> k;
   final boolean l;
   final boolean m;
   final epx.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ale<dbz>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xp y = xp.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final epr A;

   public bqj(epx.c $$0, DataFixer $$1, jw $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lq.aT);
      this.k = this.j.f().stream().map(lq::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new epr(this.n.a(dbz.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xp.c("optimizeWorld.stage.failed");
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
      new bqj.d().a();
      a.info("Upgrading POIs");
      new bqj.f().a();
      a.info("Upgrading blocks");
      new bqj.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ale<dbz>> c() {
      return this.k;
   }

   public float a(ale<dbz> $$0) {
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

   public xp h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final yd d;
      private final yd e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bag b;

      a(final bag $$0, final String $$1, final String $$2, final yd $$3, final yd $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqj.this.u = 0;
         bqj.this.t = 0;
         bqj.this.v = 0;
         bqj.this.w = 0;
         List<bqj.c<T>> $$0 = this.b();
         if (bqj.this.t != 0) {
            float $$1 = (float)bqj.this.u;
            bqj.this.y = this.d;

            while (bqj.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqj.c<T> $$4 : $$0) {
                  ale<dbz> $$5 = $$4.a;
                  ListIterator<bqj.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqj.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbg $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqj.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqj.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqj.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqj.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqj.this.y = this.e;

            for (bqj.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqj.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqj.c<T>> b() {
         List<bqj.c<T>> $$0 = Lists.newArrayList();

         for (ale<dbz> $$1 : bqj.this.k) {
            dvp $$2 = new dvp(bqj.this.n.f(), $$1, this.f);
            Path $$3 = bqj.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqj.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqj.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvp var1, Path var2);

      private ListIterator<bqj.e> b(dvp $$0, Path $$1) {
         List<bqj.e> $$2 = c($$0, $$1);
         bqj.this.u = bqj.this.u + $$2.size();
         bqj.this.t = bqj.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqj.e> c(dvp $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqj.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqj.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbg> $$8 = Lists.newArrayList();

                  try (dvm $$9 = new dvm($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbg $$12 = new dbg($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqj.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqj.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ale<dbz> $$0, T $$1, dbg $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqj.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqj.this.v++;
         } else {
            bqj.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbg var2, ale<dbz> var3);

      private void a(dvm $$0) {
         if (bqj.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqj.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqj.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqj.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqj.a<dvg> {
      b() {
         super(bag.c, "chunk", "region", bqj.h, bqj.i);
      }

      protected boolean a(dvg $$0, dbg $$1, ale<dbz> $$2) {
         us $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvg.a($$3);
            dua $$5 = bqj.this.j.f(lq.b($$2)).b();
            us $$6 = $$0.a($$2, () -> bqj.this.A, $$3, $$5.c());
            dbg $$7 = new dbg($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqj.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bqj.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uy $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  us $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bqj.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dvg b(dvp $$0, Path $$1) {
         return (dvg)(bqj.this.m ? new dvj($$0.a("source"), $$1, $$0.a("target"), bqj.a($$1), bqj.this.p, true) : new dvg($$0, $$1, bqj.this.p, true));
      }
   }

   static record c<T>(ale<dbz> a, T b, ListIterator<bqj.e> c) {
   }

   class d extends bqj.g {
      d() {
         super(bag.s, "entities", bqj.f, bqj.g);
      }

      @Override
      protected us a(dvr $$0, us $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvm a, List<dbg> b) {
   }

   class f extends bqj.g {
      f() {
         super(bag.q, "poi", bqj.d, bqj.e);
      }

      @Override
      protected us a(dvr $$0, us $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqj.a<dvr> {
      g(final bag $$0, final String $$1, final yd $$2, final yd $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dvr b(dvp $$0, Path $$1) {
         return (dvr)(bqj.this.m
            ? new dvk($$0.a("source"), $$1, $$0.a("target"), bqj.a($$1), bqj.this.p, true, this.b)
            : new dvr($$0, $$1, bqj.this.p, true, this.b));
      }

      protected boolean a(dvr $$0, dbg $$1, ale<dbz> $$2) {
         us $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvg.a($$3);
            us $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bqj.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract us a(dvr var1, us var2);
   }
}
