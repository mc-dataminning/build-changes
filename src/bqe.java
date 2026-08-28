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

public class bqe {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xm d = wy.c("optimizeWorld.stage.upgrading.poi");
   static final xm e = wy.c("optimizeWorld.stage.finished.poi");
   static final xm f = wy.c("optimizeWorld.stage.upgrading.entities");
   static final xm g = wy.c("optimizeWorld.stage.finished.entities");
   static final xm h = wy.c("optimizeWorld.stage.upgrading.chunks");
   static final xm i = wy.c("optimizeWorld.stage.finished.chunks");
   final jz<dww> j;
   final Set<akp<dcu>> k;
   final boolean l;
   final boolean m;
   final eqz.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akp<dcu>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wy y = wy.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eqt A;

   public bqe(eqz.c $$0, DataFixer $$1, ka $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lu.bb);
      this.k = this.j.g().stream().map(lu::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eqt(this.n.a(dcu.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wy.c("optimizeWorld.stage.failed");
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
      new bqe.d().a();
      a.info("Upgrading POIs");
      new bqe.f().a();
      a.info("Upgrading blocks");
      new bqe.b().a();
      this.A.a();
      $$0 = ad.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akp<dcu>> c() {
      return this.k;
   }

   public float a(akp<dcu> $$0) {
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

   public wy h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xm d;
      private final xm e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final azv b;

      a(final azv $$0, final String $$1, final String $$2, final xm $$3, final xm $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqe.this.u = 0;
         bqe.this.t = 0;
         bqe.this.v = 0;
         bqe.this.w = 0;
         List<bqe.c<T>> $$0 = this.b();
         if (bqe.this.t != 0) {
            float $$1 = (float)bqe.this.u;
            bqe.this.y = this.d;

            while (bqe.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqe.c<T> $$4 : $$0) {
                  akp<dcu> $$5 = $$4.a;
                  ListIterator<bqe.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqe.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dcb $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqe.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqe.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqe.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqe.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqe.this.y = this.e;

            for (bqe.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqe.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqe.c<T>> b() {
         List<bqe.c<T>> $$0 = Lists.newArrayList();

         for (akp<dcu> $$1 : bqe.this.k) {
            dwp $$2 = new dwp(bqe.this.n.f(), $$1, this.f);
            Path $$3 = bqe.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqe.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqe.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dwp var1, Path var2);

      private ListIterator<bqe.e> b(dwp $$0, Path $$1) {
         List<bqe.e> $$2 = c($$0, $$1);
         bqe.this.u = bqe.this.u + $$2.size();
         bqe.this.t = bqe.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqe.e> c(dwp $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqe.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqe.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dcb> $$8 = Lists.newArrayList();

                  try (dwm $$9 = new dwm($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dcb $$12 = new dcb($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqe.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqe.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akp<dcu> $$0, T $$1, dcb $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqe.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqe.this.v++;
         } else {
            bqe.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dcb var2, akp<dcu> var3);

      private void a(dwm $$0) {
         if (bqe.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqe.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqe.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqe.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqe.a<dwg> {
      b() {
         super(azv.c, "chunk", "region", bqe.h, bqe.i);
      }

      protected boolean a(dwg $$0, dcb $$1, akp<dcu> $$2) {
         ua $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwg.a($$3);
            dux $$5 = bqe.this.j.f(lu.b($$2)).b();
            ua $$6 = $$0.a($$2, () -> bqe.this.A, $$3, $$5.c());
            dcb $$7 = new dcb($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqe.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bqe.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ug $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ua $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bqe.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dwg b(dwp $$0, Path $$1) {
         return (dwg)(bqe.this.m ? new dwj($$0.a("source"), $$1, $$0.a("target"), bqe.a($$1), bqe.this.p, true) : new dwg($$0, $$1, bqe.this.p, true));
      }
   }

   static record c<T>(akp<dcu> a, T b, ListIterator<bqe.e> c) {
   }

   class d extends bqe.g {
      d() {
         super(azv.s, "entities", bqe.f, bqe.g);
      }

      @Override
      protected ua a(dwr $$0, ua $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dwm a, List<dcb> b) {
   }

   class f extends bqe.g {
      f() {
         super(azv.q, "poi", bqe.d, bqe.e);
      }

      @Override
      protected ua a(dwr $$0, ua $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqe.a<dwr> {
      g(final azv $$0, final String $$1, final xm $$2, final xm $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dwr b(dwp $$0, Path $$1) {
         return (dwr)(bqe.this.m
            ? new dwk($$0.a("source"), $$1, $$0.a("target"), bqe.a($$1), bqe.this.p, true, this.b)
            : new dwr($$0, $$1, bqe.this.p, true, this.b));
      }

      protected boolean a(dwr $$0, dcb $$1, akp<dcu> $$2) {
         ua $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dwg.a($$3);
            ua $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bqe.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ua a(dwr var1, ua var2);
   }
}
