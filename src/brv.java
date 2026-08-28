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

public class brv implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xl d = xl.c("optimizeWorld.stage.upgrading.poi");
   static final xl e = xl.c("optimizeWorld.stage.finished.poi");
   static final xl f = xl.c("optimizeWorld.stage.upgrading.entities");
   static final xl g = xl.c("optimizeWorld.stage.finished.entities");
   static final xl h = xl.c("optimizeWorld.stage.upgrading.chunks");
   static final xl i = xl.c("optimizeWorld.stage.finished.chunks");
   final kd<dzk> j;
   final Set<alk<dff>> k;
   final boolean l;
   final boolean m;
   final etu.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alk<dff>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xl y = xl.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eto A;

   public brv(etu.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(ma.bc);
      this.k = this.j.j().stream().map(ma::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eto(this.n.a(dff.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xl.c("optimizeWorld.stage.failed");
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
      new brv.d().a();
      a.info("Upgrading POIs");
      new brv.f().a();
      a.info("Upgrading blocks");
      new brv.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alk<dff>> c() {
      return this.k;
   }

   public float a(alk<dff> $$0) {
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

   public xl h() {
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
      private final xl d;
      private final xl e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bax b;

      a(final bax $$0, final String $$1, final String $$2, final xl $$3, final xl $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brv.this.u = 0;
         brv.this.t = 0;
         brv.this.v = 0;
         brv.this.w = 0;
         List<brv.c<T>> $$0 = this.b();
         if (brv.this.t != 0) {
            float $$1 = (float)brv.this.u;
            brv.this.y = this.d;

            while (brv.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brv.c<T> $$4 : $$0) {
                  alk<dff> $$5 = $$4.a;
                  ListIterator<brv.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brv.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (del $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brv.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brv.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brv.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brv.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brv.this.y = this.e;

            for (brv.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brv.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brv.c<T>> b() {
         List<brv.c<T>> $$0 = Lists.newArrayList();

         for (alk<dff> $$1 : brv.this.k) {
            dzc $$2 = new dzc(brv.this.n.f(), $$1, this.f);
            Path $$3 = brv.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brv.e> $$5 = this.b($$2, $$3);
            $$0.add(new brv.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dzc var1, Path var2);

      private ListIterator<brv.e> b(dzc $$0, Path $$1) {
         List<brv.e> $$2 = c($$0, $$1);
         brv.this.u = brv.this.u + $$2.size();
         brv.this.t = brv.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brv.e> c(dzc $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brv.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brv.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<del> $$8 = Lists.newArrayList();

                  try (dyz $$9 = new dyz($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           del $$12 = new del($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brv.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brv.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alk<dff> $$0, T $$1, del $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brv.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brv.this.v++;
         } else {
            brv.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, del var2, alk<dff> var3);

      private void a(dyz $$0) {
         if (brv.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brv.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brv.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brv.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brv.a<dyt> {
      b() {
         super(bax.c, "chunk", "region", brv.h, brv.i);
      }

      protected boolean a(dyt $$0, del $$1, alk<dff> $$2) {
         un $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyt.a($$3);
            dxk $$5 = brv.this.j.g(ma.b($$2)).b();
            un $$6 = $$0.a($$2, () -> brv.this.A, $$3, $$5.c());
            del $$7 = new del($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brv.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brv.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ut $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  un $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brv.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected dyt b(dzc $$0, Path $$1) {
         return (dyt)(brv.this.m ? new dyw($$0.a("source"), $$1, $$0.a("target"), brv.a($$1), brv.this.p, true) : new dyt($$0, $$1, brv.this.p, true));
      }
   }

   static record c<T>(alk<dff> a, T b, ListIterator<brv.e> c) {
   }

   class d extends brv.g {
      d() {
         super(bax.s, "entities", brv.f, brv.g);
      }

      @Override
      protected un a(dzf $$0, un $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dyz a, List<del> b) {
   }

   class f extends brv.g {
      f() {
         super(bax.q, "poi", brv.d, brv.e);
      }

      @Override
      protected un a(dzf $$0, un $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brv.a<dzf> {
      g(final bax $$0, final String $$1, final xl $$2, final xl $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dzf b(dzc $$0, Path $$1) {
         return (dzf)(brv.this.m
            ? new dyx($$0.a("source"), $$1, $$0.a("target"), brv.a($$1), brv.this.p, true, this.b)
            : new dzf($$0, $$1, brv.this.p, true, this.b));
      }

      protected boolean a(dzf $$0, del $$1, alk<dff> $$2) {
         un $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dyt.a($$3);
            un $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brv.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract un a(dzf var1, un var2);
   }
}
