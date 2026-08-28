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

public class bqh {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final yc d = xo.c("optimizeWorld.stage.upgrading.poi");
   static final yc e = xo.c("optimizeWorld.stage.finished.poi");
   static final yc f = xo.c("optimizeWorld.stage.upgrading.entities");
   static final yc g = xo.c("optimizeWorld.stage.finished.entities");
   static final yc h = xo.c("optimizeWorld.stage.upgrading.chunks");
   static final yc i = xo.c("optimizeWorld.stage.finished.chunks");
   final jv<dvu> j;
   final Set<ald<dbx>> k;
   final boolean l;
   final boolean m;
   final epv.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ald<dbx>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xo y = xo.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final epp A;

   public bqh(epv.c $$0, DataFixer $$1, jw $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lq.aT);
      this.k = this.j.f().stream().map(lq::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new epp(this.n.a(dbx.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xo.c("optimizeWorld.stage.failed");
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
      new bqh.d().a();
      a.info("Upgrading POIs");
      new bqh.f().a();
      a.info("Upgrading blocks");
      new bqh.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ald<dbx>> c() {
      return this.k;
   }

   public float a(ald<dbx> $$0) {
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

   public xo h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final yc d;
      private final yc e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final baf b;

      a(final baf $$0, final String $$1, final String $$2, final yc $$3, final yc $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqh.this.u = 0;
         bqh.this.t = 0;
         bqh.this.v = 0;
         bqh.this.w = 0;
         List<bqh.c<T>> $$0 = this.b();
         if (bqh.this.t != 0) {
            float $$1 = (float)bqh.this.u;
            bqh.this.y = this.d;

            while (bqh.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqh.c<T> $$4 : $$0) {
                  ald<dbx> $$5 = $$4.a;
                  ListIterator<bqh.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqh.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbe $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqh.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqh.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqh.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqh.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqh.this.y = this.e;

            for (bqh.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqh.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqh.c<T>> b() {
         List<bqh.c<T>> $$0 = Lists.newArrayList();

         for (ald<dbx> $$1 : bqh.this.k) {
            dvn $$2 = new dvn(bqh.this.n.f(), $$1, this.f);
            Path $$3 = bqh.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqh.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqh.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvn var1, Path var2);

      private ListIterator<bqh.e> b(dvn $$0, Path $$1) {
         List<bqh.e> $$2 = c($$0, $$1);
         bqh.this.u = bqh.this.u + $$2.size();
         bqh.this.t = bqh.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqh.e> c(dvn $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqh.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqh.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbe> $$8 = Lists.newArrayList();

                  try (dvk $$9 = new dvk($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbe $$12 = new dbe($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqh.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqh.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ald<dbx> $$0, T $$1, dbe $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqh.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqh.this.v++;
         } else {
            bqh.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbe var2, ald<dbx> var3);

      private void a(dvk $$0) {
         if (bqh.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqh.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqh.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqh.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqh.a<dve> {
      b() {
         super(baf.c, "chunk", "region", bqh.h, bqh.i);
      }

      protected boolean a(dve $$0, dbe $$1, ald<dbx> $$2) {
         ur $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dve.a($$3);
            dty $$5 = bqh.this.j.f(lq.b($$2)).b();
            ur $$6 = $$0.a($$2, () -> bqh.this.A, $$3, $$5.c());
            dbe $$7 = new dbe($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqh.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bqh.this.l) {
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

            if ($$8 || bqh.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dve b(dvn $$0, Path $$1) {
         return (dve)(bqh.this.m ? new dvh($$0.a("source"), $$1, $$0.a("target"), bqh.a($$1), bqh.this.p, true) : new dve($$0, $$1, bqh.this.p, true));
      }
   }

   static record c<T>(ald<dbx> a, T b, ListIterator<bqh.e> c) {
   }

   class d extends bqh.g {
      d() {
         super(baf.s, "entities", bqh.f, bqh.g);
      }

      @Override
      protected ur a(dvp $$0, ur $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvk a, List<dbe> b) {
   }

   class f extends bqh.g {
      f() {
         super(baf.q, "poi", bqh.d, bqh.e);
      }

      @Override
      protected ur a(dvp $$0, ur $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqh.a<dvp> {
      g(final baf $$0, final String $$1, final yc $$2, final yc $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dvp b(dvn $$0, Path $$1) {
         return (dvp)(bqh.this.m
            ? new dvi($$0.a("source"), $$1, $$0.a("target"), bqh.a($$1), bqh.this.p, true, this.b)
            : new dvp($$0, $$1, bqh.this.p, true, this.b));
      }

      protected boolean a(dvp $$0, dbe $$1, ald<dbx> $$2) {
         ur $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dve.a($$3);
            ur $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bqh.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ur a(dvp var1, ur var2);
   }
}
