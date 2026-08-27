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

public class blz {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wg d = vs.c("optimizeWorld.stage.upgrading.poi");
   static final wg e = vs.c("optimizeWorld.stage.finished.poi");
   static final wg f = vs.c("optimizeWorld.stage.upgrading.entities");
   static final wg g = vs.c("optimizeWorld.stage.finished.entities");
   static final wg h = vs.c("optimizeWorld.stage.upgrading.chunks");
   static final wg i = vs.c("optimizeWorld.stage.finished.chunks");
   final ix<dpr> j;
   final Set<ajb<cwe>> k;
   final boolean l;
   final boolean m;
   final ejo.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ajb<cwe>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile vs y = vs.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eji A;

   public blz(ejo.c $$0, DataFixer $$1, iy $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(ki.aO);
      this.k = this.j.f().stream().map(ki::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eji(this.n.a(cwe.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = vs.c("optimizeWorld.stage.failed");
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
      new blz.d().a();
      a.info("Upgrading POIs");
      new blz.f().a();
      a.info("Upgrading blocks");
      new blz.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ajb<cwe>> c() {
      return this.k;
   }

   public float a(ajb<cwe> $$0) {
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

   public vs h() {
      return this.y;
   }

   abstract class a<T extends AutoCloseable> {
      private final wg d;
      private final wg e;
      private final String f;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final axs b;

      a(axs $$0, String $$1, wg $$2, wg $$3) {
         this.b = $$0;
         this.f = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public void a() {
         blz.this.u = 0;
         blz.this.t = 0;
         blz.this.v = 0;
         blz.this.w = 0;
         List<blz.c<T>> $$0 = this.a(this.f);
         if (blz.this.t != 0) {
            float $$1 = (float)blz.this.u;
            blz.this.y = this.d;

            while (blz.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (blz.c<T> $$4 : $$0) {
                  ajb<cwe> $$5 = $$4.a;
                  ListIterator<blz.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     blz.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (cvl $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (blz.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           blz.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  blz.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               blz.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            blz.this.y = this.e;

            for (blz.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  blz.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<blz.c<T>> a(String $$0) {
         List<blz.c<T>> $$1 = Lists.newArrayList();

         for (ajb<cwe> $$2 : blz.this.k) {
            Path $$3 = blz.this.n.a($$2);
            Path $$4 = $$3.resolve($$0);
            T $$5 = this.a($$0, $$3, $$4);
            ListIterator<blz.e> $$6 = this.a($$0, $$2);
            $$1.add(new blz.c<>($$2, $$5, $$6));
         }

         return $$1;
      }

      protected abstract T a(String var1, Path var2, Path var3);

      private ListIterator<blz.e> a(String $$0, ajb<cwe> $$1) {
         List<blz.e> $$2 = this.a($$1, $$0);
         blz.this.u = blz.this.u + $$2.size();
         blz.this.t = blz.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private List<blz.e> a(ajb<cwe> $$0, String $$1) {
         File $$2 = blz.this.n.a($$0).toFile();
         File $$3 = new File($$2, $$1);
         File[] $$4 = $$3.listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$4 == null) {
            return List.of();
         } else {
            List<blz.e> $$5 = Lists.newArrayList();

            for (File $$6 : $$4) {
               Matcher $$7 = blz.z.matcher($$6.getName());
               if ($$7.matches()) {
                  int $$8 = Integer.parseInt($$7.group(1)) << 5;
                  int $$9 = Integer.parseInt($$7.group(2)) << 5;
                  List<cvl> $$10 = Lists.newArrayList();

                  try (dpi $$11 = new dpi($$6.toPath(), $$3.toPath(), true)) {
                     for (int $$12 = 0; $$12 < 32; $$12++) {
                        for (int $$13 = 0; $$13 < 32; $$13++) {
                           cvl $$14 = new cvl($$12 + $$8, $$13 + $$9);
                           if ($$11.b($$14)) {
                              $$10.add($$14);
                           }
                        }
                     }

                     if (!$$10.isEmpty()) {
                        $$5.add(new blz.e($$11, $$10));
                     }
                  } catch (Throwable var21) {
                     blz.a.error("Failed to read chunks from region file {}", $$6.toPath(), var21);
                  }
               }
            }

            return $$5;
         }
      }

      private boolean a(ajb<cwe> $$0, T $$1, cvl $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            blz.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            blz.this.v++;
         } else {
            blz.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, cvl var2, ajb<cwe> var3);

      private void a(dpi $$0) {
         if (blz.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = $$2.resolveSibling("new_" + $$2.getFileName().toString()).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  blz.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               blz.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends blz.a<dpc> {
      b() {
         super(axs.c, "region", blz.h, blz.i);
      }

      protected boolean a(dpc $$0, cvl $$1, ajb<cwe> $$2) {
         sy $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dpc.a($$3);
            dob $$5 = blz.this.j.e(ki.b($$2)).b();
            sy $$6 = $$0.a($$2, () -> blz.this.A, $$3, $$5.b());
            cvl $$7 = new cvl($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               blz.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (blz.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               te $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  sy $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || blz.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dpc b(String $$0, Path $$1, Path $$2) {
         return (dpc)(blz.this.m ? new dpf($$2, $$1.resolve("new_" + $$0), blz.this.p, true) : new dpc($$2, blz.this.p, true));
      }
   }

   static record c<T>(ajb<cwe> a, T b, ListIterator<blz.e> c) {
   }

   class d extends blz.g {
      d() {
         super(axs.s, "entities", blz.f, blz.g);
      }

      @Override
      protected sy a(dpm $$0, sy $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dpi a, List<cvl> b) {
   }

   class f extends blz.g {
      f() {
         super(axs.q, "poi", blz.d, blz.e);
      }

      @Override
      protected sy a(dpm $$0, sy $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends blz.a<dpm> {
      g(axs $$0, String $$1, wg $$2, wg $$3) {
         super($$0, $$1, $$2, $$3);
      }

      protected dpm b(String $$0, Path $$1, Path $$2) {
         return (dpm)(blz.this.m ? new dpg($$2, $$1.resolve("new_" + $$0), blz.this.p, true, $$0, this.b) : new dpm($$2, blz.this.p, true, $$0, this.b));
      }

      protected boolean a(dpm $$0, cvl $$1, ajb<cwe> $$2) {
         sy $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dpc.a($$3);
            sy $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || blz.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract sy a(dpm var1, sy var2);
   }
}
