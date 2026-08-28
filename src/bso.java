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

public class bso implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xk d = xk.c("optimizeWorld.stage.upgrading.poi");
   static final xk e = xk.c("optimizeWorld.stage.finished.poi");
   static final xk f = xk.c("optimizeWorld.stage.upgrading.entities");
   static final xk g = xk.c("optimizeWorld.stage.finished.entities");
   static final xk h = xk.c("optimizeWorld.stage.upgrading.chunks");
   static final xk i = xk.c("optimizeWorld.stage.finished.chunks");
   final kd<ebk> j;
   final Set<alo<dgz>> k;
   final boolean l;
   final boolean m;
   final evw.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alo<dgz>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xk y = xk.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final evq A;

   public bso(evw.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mb.bf);
      this.k = this.j.j().stream().map(mb::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new evq(this.n.a(dgz.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xk.c("optimizeWorld.stage.failed");
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
      new bso.d().a();
      a.info("Upgrading POIs");
      new bso.f().a();
      a.info("Upgrading blocks");
      new bso.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alo<dgz>> c() {
      return this.k;
   }

   public float a(alo<dgz> $$0) {
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

   public xk h() {
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
      private final xk d;
      private final xk e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbi b;

      a(final bbi $$0, final String $$1, final String $$2, final xk $$3, final xk $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bso.this.u = 0;
         bso.this.t = 0;
         bso.this.v = 0;
         bso.this.w = 0;
         List<bso.c<T>> $$0 = this.b();
         if (bso.this.t != 0) {
            float $$1 = (float)bso.this.u;
            bso.this.y = this.d;

            while (bso.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bso.c<T> $$4 : $$0) {
                  alo<dgz> $$5 = $$4.a;
                  ListIterator<bso.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bso.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dgf $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bso.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bso.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bso.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bso.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bso.this.y = this.e;

            for (bso.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bso.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bso.c<T>> b() {
         List<bso.c<T>> $$0 = Lists.newArrayList();

         for (alo<dgz> $$1 : bso.this.k) {
            ebc $$2 = new ebc(bso.this.n.f(), $$1, this.f);
            Path $$3 = bso.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bso.e> $$5 = this.b($$2, $$3);
            $$0.add(new bso.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ebc var1, Path var2);

      private ListIterator<bso.e> b(ebc $$0, Path $$1) {
         List<bso.e> $$2 = c($$0, $$1);
         bso.this.u = bso.this.u + $$2.size();
         bso.this.t = bso.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bso.e> c(ebc $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bso.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bso.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dgf> $$8 = Lists.newArrayList();

                  try (eaz $$9 = new eaz($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dgf $$12 = new dgf($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bso.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bso.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alo<dgz> $$0, T $$1, dgf $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bso.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bso.this.v++;
         } else {
            bso.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dgf var2, alo<dgz> var3);

      private void a(eaz $$0) {
         if (bso.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bso.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bso.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bso.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bso.a<eat> {
      b() {
         super(bbi.c, "chunk", "region", bso.h, bso.i);
      }

      protected boolean a(eat $$0, dgf $$1, alo<dgz> $$2) {
         um $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eat.a($$3);
            dzk $$5 = bso.this.j.g(mb.b($$2)).b();
            um $$6 = $$0.a($$2, () -> bso.this.A, $$3, $$5.c());
            dgf $$7 = new dgf($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bso.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bso.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               us $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  um $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bso.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eat b(ebc $$0, Path $$1) {
         return (eat)(bso.this.m ? new eaw($$0.a("source"), $$1, $$0.a("target"), bso.a($$1), bso.this.p, true) : new eat($$0, $$1, bso.this.p, true));
      }
   }

   static record c<T>(alo<dgz> a, T b, ListIterator<bso.e> c) {
   }

   class d extends bso.g {
      d() {
         super(bbi.s, "entities", bso.f, bso.g);
      }

      @Override
      protected um a(ebf $$0, um $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eaz a, List<dgf> b) {
   }

   class f extends bso.g {
      f() {
         super(bbi.q, "poi", bso.d, bso.e);
      }

      @Override
      protected um a(ebf $$0, um $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bso.a<ebf> {
      g(final bbi $$0, final String $$1, final xk $$2, final xk $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ebf b(ebc $$0, Path $$1) {
         return (ebf)(bso.this.m
            ? new eax($$0.a("source"), $$1, $$0.a("target"), bso.a($$1), bso.this.p, true, this.b)
            : new ebf($$0, $$1, bso.this.p, true, this.b));
      }

      protected boolean a(ebf $$0, dgf $$1, alo<dgz> $$2) {
         um $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eat.a($$3);
            um $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bso.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract um a(ebf var1, um var2);
   }
}
