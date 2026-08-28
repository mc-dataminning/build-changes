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

public class brr implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xi d = xi.c("optimizeWorld.stage.upgrading.poi");
   static final xi e = xi.c("optimizeWorld.stage.finished.poi");
   static final xi f = xi.c("optimizeWorld.stage.upgrading.entities");
   static final xi g = xi.c("optimizeWorld.stage.finished.entities");
   static final xi h = xi.c("optimizeWorld.stage.upgrading.chunks");
   static final xi i = xi.c("optimizeWorld.stage.finished.chunks");
   final kd<dzg> j;
   final Set<alh<dfb>> k;
   final boolean l;
   final boolean m;
   final etq.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alh<dfb>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xi y = xi.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final etk A;

   public brr(etq.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(lz.bc);
      this.k = this.j.j().stream().map(lz::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new etk(this.n.a(dfb.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xi.c("optimizeWorld.stage.failed");
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
      new brr.d().a();
      a.info("Upgrading POIs");
      new brr.f().a();
      a.info("Upgrading blocks");
      new brr.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alh<dfb>> c() {
      return this.k;
   }

   public float a(alh<dfb> $$0) {
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

   public xi h() {
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
      private final xi d;
      private final xi e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bat b;

      a(final bat $$0, final String $$1, final String $$2, final xi $$3, final xi $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brr.this.u = 0;
         brr.this.t = 0;
         brr.this.v = 0;
         brr.this.w = 0;
         List<brr.c<T>> $$0 = this.b();
         if (brr.this.t != 0) {
            float $$1 = (float)brr.this.u;
            brr.this.y = this.d;

            while (brr.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brr.c<T> $$4 : $$0) {
                  alh<dfb> $$5 = $$4.a;
                  ListIterator<brr.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brr.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (deh $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brr.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brr.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brr.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brr.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brr.this.y = this.e;

            for (brr.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brr.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brr.c<T>> b() {
         List<brr.c<T>> $$0 = Lists.newArrayList();

         for (alh<dfb> $$1 : brr.this.k) {
            dyy $$2 = new dyy(brr.this.n.f(), $$1, this.f);
            Path $$3 = brr.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brr.e> $$5 = this.b($$2, $$3);
            $$0.add(new brr.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dyy var1, Path var2);

      private ListIterator<brr.e> b(dyy $$0, Path $$1) {
         List<brr.e> $$2 = c($$0, $$1);
         brr.this.u = brr.this.u + $$2.size();
         brr.this.t = brr.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brr.e> c(dyy $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brr.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brr.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<deh> $$8 = Lists.newArrayList();

                  try (dyv $$9 = new dyv($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           deh $$12 = new deh($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brr.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brr.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alh<dfb> $$0, T $$1, deh $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brr.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brr.this.v++;
         } else {
            brr.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, deh var2, alh<dfb> var3);

      private void a(dyv $$0) {
         if (brr.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brr.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brr.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brr.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brr.a<dyp> {
      b() {
         super(bat.c, "chunk", "region", brr.h, brr.i);
      }

      protected boolean a(dyp $$0, deh $$1, alh<dfb> $$2) {
         uk $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyp.a($$3);
            dxg $$5 = brr.this.j.g(lz.b($$2)).b();
            uk $$6 = $$0.a($$2, () -> brr.this.A, $$3, $$5.c());
            deh $$7 = new deh($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brr.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brr.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uq $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  uk $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected dyp b(dyy $$0, Path $$1) {
         return (dyp)(brr.this.m ? new dys($$0.a("source"), $$1, $$0.a("target"), brr.a($$1), brr.this.p, true) : new dyp($$0, $$1, brr.this.p, true));
      }
   }

   static record c<T>(alh<dfb> a, T b, ListIterator<brr.e> c) {
   }

   class d extends brr.g {
      d() {
         super(bat.s, "entities", brr.f, brr.g);
      }

      @Override
      protected uk a(dzb $$0, uk $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dyv a, List<deh> b) {
   }

   class f extends brr.g {
      f() {
         super(bat.q, "poi", brr.d, brr.e);
      }

      @Override
      protected uk a(dzb $$0, uk $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brr.a<dzb> {
      g(final bat $$0, final String $$1, final xi $$2, final xi $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dzb b(dyy $$0, Path $$1) {
         return (dzb)(brr.this.m
            ? new dyt($$0.a("source"), $$1, $$0.a("target"), brr.a($$1), brr.this.p, true, this.b)
            : new dzb($$0, $$1, brr.this.p, true, this.b));
      }

      protected boolean a(dzb $$0, deh $$1, alh<dfb> $$2) {
         uk $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyp.a($$3);
            uk $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract uk a(dzb var1, uk var2);
   }
}
