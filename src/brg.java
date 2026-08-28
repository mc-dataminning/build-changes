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

public class brg implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xe d = xe.c("optimizeWorld.stage.upgrading.poi");
   static final xe e = xe.c("optimizeWorld.stage.finished.poi");
   static final xe f = xe.c("optimizeWorld.stage.upgrading.entities");
   static final xe g = xe.c("optimizeWorld.stage.finished.entities");
   static final xe h = xe.c("optimizeWorld.stage.upgrading.chunks");
   static final xe i = xe.c("optimizeWorld.stage.finished.chunks");
   final kb<dyp> j;
   final Set<ald<dej>> k;
   final boolean l;
   final boolean m;
   final esz.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ald<dej>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xe y = xe.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final est A;

   public brg(esz.c $$0, DataFixer $$1, kc $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(lw.bd);
      this.k = this.j.j().stream().map(lw::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new est(this.n.a(dej.h).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xe.c("optimizeWorld.stage.failed");
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
      new brg.d().a();
      a.info("Upgrading POIs");
      new brg.f().a();
      a.info("Upgrading blocks");
      new brg.b().a();
      this.A.b();
      $$0 = ad.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ald<dej>> c() {
      return this.k;
   }

   public float a(ald<dej> $$0) {
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

   public xe h() {
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
      private final xe d;
      private final xe e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bao b;

      a(final bao $$0, final String $$1, final String $$2, final xe $$3, final xe $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brg.this.u = 0;
         brg.this.t = 0;
         brg.this.v = 0;
         brg.this.w = 0;
         List<brg.c<T>> $$0 = this.b();
         if (brg.this.t != 0) {
            float $$1 = (float)brg.this.u;
            brg.this.y = this.d;

            while (brg.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brg.c<T> $$4 : $$0) {
                  ald<dej> $$5 = $$4.a;
                  ListIterator<brg.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brg.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (ddp $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brg.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brg.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brg.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brg.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brg.this.y = this.e;

            for (brg.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brg.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brg.c<T>> b() {
         List<brg.c<T>> $$0 = Lists.newArrayList();

         for (ald<dej> $$1 : brg.this.k) {
            dyh $$2 = new dyh(brg.this.n.f(), $$1, this.f);
            Path $$3 = brg.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brg.e> $$5 = this.b($$2, $$3);
            $$0.add(new brg.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dyh var1, Path var2);

      private ListIterator<brg.e> b(dyh $$0, Path $$1) {
         List<brg.e> $$2 = c($$0, $$1);
         brg.this.u = brg.this.u + $$2.size();
         brg.this.t = brg.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brg.e> c(dyh $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brg.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brg.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<ddp> $$8 = Lists.newArrayList();

                  try (dye $$9 = new dye($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           ddp $$12 = new ddp($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brg.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brg.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ald<dej> $$0, T $$1, ddp $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brg.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brg.this.v++;
         } else {
            brg.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, ddp var2, ald<dej> var3);

      private void a(dye $$0) {
         if (brg.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brg.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brg.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brg.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brg.a<dxy> {
      b() {
         super(bao.c, "chunk", "region", brg.h, brg.i);
      }

      protected boolean a(dxy $$0, ddp $$1, ald<dej> $$2) {
         ug $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dxy.a($$3);
            dwp $$5 = brg.this.j.g(lw.b($$2)).b();
            ug $$6 = $$0.a($$2, () -> brg.this.A, $$3, $$5.c());
            ddp $$7 = new ddp($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brg.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brg.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               um $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ug $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brg.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected dxy b(dyh $$0, Path $$1) {
         return (dxy)(brg.this.m ? new dyb($$0.a("source"), $$1, $$0.a("target"), brg.a($$1), brg.this.p, true) : new dxy($$0, $$1, brg.this.p, true));
      }
   }

   static record c<T>(ald<dej> a, T b, ListIterator<brg.e> c) {
   }

   class d extends brg.g {
      d() {
         super(bao.s, "entities", brg.f, brg.g);
      }

      @Override
      protected ug a(dyk $$0, ug $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dye a, List<ddp> b) {
   }

   class f extends brg.g {
      f() {
         super(bao.q, "poi", brg.d, brg.e);
      }

      @Override
      protected ug a(dyk $$0, ug $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brg.a<dyk> {
      g(final bao $$0, final String $$1, final xe $$2, final xe $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dyk b(dyh $$0, Path $$1) {
         return (dyk)(brg.this.m
            ? new dyc($$0.a("source"), $$1, $$0.a("target"), brg.a($$1), brg.this.p, true, this.b)
            : new dyk($$0, $$1, brg.this.p, true, this.b));
      }

      protected boolean a(dyk $$0, ddp $$1, ald<dej> $$2) {
         ug $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dxy.a($$3);
            ug $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brg.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ug a(dyk var1, ug var2);
   }
}
