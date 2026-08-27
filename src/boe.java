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

public class boe {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xg d = ws.c("optimizeWorld.stage.upgrading.poi");
   static final xg e = ws.c("optimizeWorld.stage.finished.poi");
   static final xg f = ws.c("optimizeWorld.stage.upgrading.entities");
   static final xg g = ws.c("optimizeWorld.stage.finished.entities");
   static final xg h = ws.c("optimizeWorld.stage.upgrading.chunks");
   static final xg i = ws.c("optimizeWorld.stage.finished.chunks");
   final ji<dtr> j;
   final Set<ake<czu>> k;
   final boolean l;
   final boolean m;
   final enq.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ake<czu>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile ws y = ws.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final enk A;

   public boe(enq.c $$0, DataFixer $$1, jj $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(ld.aS);
      this.k = this.j.f().stream().map(ld::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new enk(this.n.a(czu.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = ws.c("optimizeWorld.stage.failed");
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
      new boe.d().a();
      a.info("Upgrading POIs");
      new boe.f().a();
      a.info("Upgrading blocks");
      new boe.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ake<czu>> c() {
      return this.k;
   }

   public float a(ake<czu> $$0) {
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

   public ws h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xg d;
      private final xg e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final azc b;

      a(azc $$0, String $$1, String $$2, xg $$3, xg $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         boe.this.u = 0;
         boe.this.t = 0;
         boe.this.v = 0;
         boe.this.w = 0;
         List<boe.c<T>> $$0 = this.b();
         if (boe.this.t != 0) {
            float $$1 = (float)boe.this.u;
            boe.this.y = this.d;

            while (boe.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (boe.c<T> $$4 : $$0) {
                  ake<czu> $$5 = $$4.a;
                  ListIterator<boe.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     boe.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (czb $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (boe.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           boe.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  boe.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               boe.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            boe.this.y = this.e;

            for (boe.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  boe.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<boe.c<T>> b() {
         List<boe.c<T>> $$0 = Lists.newArrayList();

         for (ake<czu> $$1 : boe.this.k) {
            dtk $$2 = new dtk(boe.this.n.f(), $$1, this.f);
            Path $$3 = boe.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<boe.e> $$5 = this.b($$2, $$3);
            $$0.add(new boe.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dtk var1, Path var2);

      private ListIterator<boe.e> b(dtk $$0, Path $$1) {
         List<boe.e> $$2 = c($$0, $$1);
         boe.this.u = boe.this.u + $$2.size();
         boe.this.t = boe.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<boe.e> c(dtk $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<boe.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = boe.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<czb> $$8 = Lists.newArrayList();

                  try (dth $$9 = new dth($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           czb $$12 = new czb($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new boe.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     boe.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ake<czu> $$0, T $$1, czb $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            boe.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            boe.this.v++;
         } else {
            boe.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, czb var2, ake<czu> var3);

      private void a(dth $$0) {
         if (boe.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = boe.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  boe.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               boe.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends boe.a<dtb> {
      b() {
         super(azc.c, "chunk", "region", boe.h, boe.i);
      }

      protected boolean a(dtb $$0, czb $$1, ake<czu> $$2) {
         ty $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dtb.a($$3);
            drv $$5 = boe.this.j.f(ld.b($$2)).b();
            ty $$6 = $$0.a($$2, () -> boe.this.A, $$3, $$5.b());
            czb $$7 = new czb($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               boe.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (boe.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ue $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ty $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || boe.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dtb b(dtk $$0, Path $$1) {
         return (dtb)(boe.this.m ? new dte($$0.a("source"), $$1, $$0.a("target"), boe.a($$1), boe.this.p, true) : new dtb($$0, $$1, boe.this.p, true));
      }
   }

   static record c<T>(ake<czu> a, T b, ListIterator<boe.e> c) {
   }

   class d extends boe.g {
      d() {
         super(azc.s, "entities", boe.f, boe.g);
      }

      @Override
      protected ty a(dtm $$0, ty $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dth a, List<czb> b) {
   }

   class f extends boe.g {
      f() {
         super(azc.q, "poi", boe.d, boe.e);
      }

      @Override
      protected ty a(dtm $$0, ty $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends boe.a<dtm> {
      g(azc $$0, String $$1, xg $$2, xg $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dtm b(dtk $$0, Path $$1) {
         return (dtm)(boe.this.m
            ? new dtf($$0.a("source"), $$1, $$0.a("target"), boe.a($$1), boe.this.p, true, this.b)
            : new dtm($$0, $$1, boe.this.p, true, this.b));
      }

      protected boolean a(dtm $$0, czb $$1, ake<czu> $$2) {
         ty $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dtb.a($$3);
            ty $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || boe.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ty a(dtm var1, ty var2);
   }
}
