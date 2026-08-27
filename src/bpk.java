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

public class bpk {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xl d = wx.c("optimizeWorld.stage.upgrading.poi");
   static final xl e = wx.c("optimizeWorld.stage.finished.poi");
   static final xl f = wx.c("optimizeWorld.stage.upgrading.entities");
   static final xl g = wx.c("optimizeWorld.stage.finished.entities");
   static final xl h = wx.c("optimizeWorld.stage.upgrading.chunks");
   static final xl i = wx.c("optimizeWorld.stage.finished.chunks");
   final jk<duw> j;
   final Set<akm<daz>> k;
   final boolean l;
   final boolean m;
   final eox.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akm<daz>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wx y = wx.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eor A;

   public bpk(eox.c $$0, DataFixer $$1, jl $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lf.aT);
      this.k = this.j.f().stream().map(lf::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eor(this.n.a(daz.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wx.c("optimizeWorld.stage.failed");
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
      new bpk.d().a();
      a.info("Upgrading POIs");
      new bpk.f().a();
      a.info("Upgrading blocks");
      new bpk.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akm<daz>> c() {
      return this.k;
   }

   public float a(akm<daz> $$0) {
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

   public wx h() {
      return this.y;
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
      protected final azl b;

      a(azl $$0, String $$1, String $$2, xl $$3, xl $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bpk.this.u = 0;
         bpk.this.t = 0;
         bpk.this.v = 0;
         bpk.this.w = 0;
         List<bpk.c<T>> $$0 = this.b();
         if (bpk.this.t != 0) {
            float $$1 = (float)bpk.this.u;
            bpk.this.y = this.d;

            while (bpk.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bpk.c<T> $$4 : $$0) {
                  akm<daz> $$5 = $$4.a;
                  ListIterator<bpk.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bpk.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dag $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bpk.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bpk.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bpk.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bpk.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bpk.this.y = this.e;

            for (bpk.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bpk.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bpk.c<T>> b() {
         List<bpk.c<T>> $$0 = Lists.newArrayList();

         for (akm<daz> $$1 : bpk.this.k) {
            dup $$2 = new dup(bpk.this.n.f(), $$1, this.f);
            Path $$3 = bpk.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bpk.e> $$5 = this.b($$2, $$3);
            $$0.add(new bpk.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dup var1, Path var2);

      private ListIterator<bpk.e> b(dup $$0, Path $$1) {
         List<bpk.e> $$2 = c($$0, $$1);
         bpk.this.u = bpk.this.u + $$2.size();
         bpk.this.t = bpk.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bpk.e> c(dup $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bpk.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bpk.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dag> $$8 = Lists.newArrayList();

                  try (dum $$9 = new dum($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dag $$12 = new dag($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bpk.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bpk.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akm<daz> $$0, T $$1, dag $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bpk.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bpk.this.v++;
         } else {
            bpk.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dag var2, akm<daz> var3);

      private void a(dum $$0) {
         if (bpk.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bpk.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bpk.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bpk.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bpk.a<dug> {
      b() {
         super(azl.c, "chunk", "region", bpk.h, bpk.i);
      }

      protected boolean a(dug $$0, dag $$1, akm<daz> $$2) {
         ud $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dug.a($$3);
            dta $$5 = bpk.this.j.f(lf.b($$2)).b();
            ud $$6 = $$0.a($$2, () -> bpk.this.A, $$3, $$5.b());
            dag $$7 = new dag($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bpk.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bpk.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uj $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ud $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bpk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dug b(dup $$0, Path $$1) {
         return (dug)(bpk.this.m ? new duj($$0.a("source"), $$1, $$0.a("target"), bpk.a($$1), bpk.this.p, true) : new dug($$0, $$1, bpk.this.p, true));
      }
   }

   static record c<T>(akm<daz> a, T b, ListIterator<bpk.e> c) {
   }

   class d extends bpk.g {
      d() {
         super(azl.s, "entities", bpk.f, bpk.g);
      }

      @Override
      protected ud a(dur $$0, ud $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dum a, List<dag> b) {
   }

   class f extends bpk.g {
      f() {
         super(azl.q, "poi", bpk.d, bpk.e);
      }

      @Override
      protected ud a(dur $$0, ud $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bpk.a<dur> {
      g(azl $$0, String $$1, xl $$2, xl $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dur b(dup $$0, Path $$1) {
         return (dur)(bpk.this.m
            ? new duk($$0.a("source"), $$1, $$0.a("target"), bpk.a($$1), bpk.this.p, true, this.b)
            : new dur($$0, $$1, bpk.this.p, true, this.b));
      }

      protected boolean a(dur $$0, dag $$1, akm<daz> $$2) {
         ud $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dug.a($$3);
            ud $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bpk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ud a(dur var1, ud var2);
   }
}
