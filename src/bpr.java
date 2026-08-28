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

public class bpr {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xi d = wu.c("optimizeWorld.stage.upgrading.poi");
   static final xi e = wu.c("optimizeWorld.stage.finished.poi");
   static final xi f = wu.c("optimizeWorld.stage.upgrading.entities");
   static final xi g = wu.c("optimizeWorld.stage.finished.entities");
   static final xi h = wu.c("optimizeWorld.stage.upgrading.chunks");
   static final xi i = wu.c("optimizeWorld.stage.finished.chunks");
   final jw<dwa> j;
   final Set<akj<dcd>> k;
   final boolean l;
   final boolean m;
   final eqc.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akj<dcd>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wu y = wu.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final epw A;

   public bpr(eqc.c $$0, DataFixer $$1, jx $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lr.ba);
      this.k = this.j.g().stream().map(lr::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new epw(this.n.a(dcd.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wu.c("optimizeWorld.stage.failed");
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
      new bpr.d().a();
      a.info("Upgrading POIs");
      new bpr.f().a();
      a.info("Upgrading blocks");
      new bpr.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akj<dcd>> c() {
      return this.k;
   }

   public float a(akj<dcd> $$0) {
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

   public wu h() {
      return this.y;
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
      protected final azl b;

      a(final azl $$0, final String $$1, final String $$2, final xi $$3, final xi $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bpr.this.u = 0;
         bpr.this.t = 0;
         bpr.this.v = 0;
         bpr.this.w = 0;
         List<bpr.c<T>> $$0 = this.b();
         if (bpr.this.t != 0) {
            float $$1 = (float)bpr.this.u;
            bpr.this.y = this.d;

            while (bpr.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bpr.c<T> $$4 : $$0) {
                  akj<dcd> $$5 = $$4.a;
                  ListIterator<bpr.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bpr.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbk $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bpr.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bpr.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bpr.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bpr.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bpr.this.y = this.e;

            for (bpr.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bpr.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bpr.c<T>> b() {
         List<bpr.c<T>> $$0 = Lists.newArrayList();

         for (akj<dcd> $$1 : bpr.this.k) {
            dvt $$2 = new dvt(bpr.this.n.f(), $$1, this.f);
            Path $$3 = bpr.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bpr.e> $$5 = this.b($$2, $$3);
            $$0.add(new bpr.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvt var1, Path var2);

      private ListIterator<bpr.e> b(dvt $$0, Path $$1) {
         List<bpr.e> $$2 = c($$0, $$1);
         bpr.this.u = bpr.this.u + $$2.size();
         bpr.this.t = bpr.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bpr.e> c(dvt $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bpr.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bpr.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbk> $$8 = Lists.newArrayList();

                  try (dvq $$9 = new dvq($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbk $$12 = new dbk($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bpr.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bpr.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akj<dcd> $$0, T $$1, dbk $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bpr.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bpr.this.v++;
         } else {
            bpr.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbk var2, akj<dcd> var3);

      private void a(dvq $$0) {
         if (bpr.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bpr.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bpr.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bpr.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bpr.a<dvk> {
      b() {
         super(azl.c, "chunk", "region", bpr.h, bpr.i);
      }

      protected boolean a(dvk $$0, dbk $$1, akj<dcd> $$2) {
         tx $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvk.a($$3);
            due $$5 = bpr.this.j.f(lr.b($$2)).b();
            tx $$6 = $$0.a($$2, () -> bpr.this.A, $$3, $$5.c());
            dbk $$7 = new dbk($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bpr.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bpr.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ud $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tx $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bpr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dvk b(dvt $$0, Path $$1) {
         return (dvk)(bpr.this.m ? new dvn($$0.a("source"), $$1, $$0.a("target"), bpr.a($$1), bpr.this.p, true) : new dvk($$0, $$1, bpr.this.p, true));
      }
   }

   static record c<T>(akj<dcd> a, T b, ListIterator<bpr.e> c) {
   }

   class d extends bpr.g {
      d() {
         super(azl.s, "entities", bpr.f, bpr.g);
      }

      @Override
      protected tx a(dvv $$0, tx $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvq a, List<dbk> b) {
   }

   class f extends bpr.g {
      f() {
         super(azl.q, "poi", bpr.d, bpr.e);
      }

      @Override
      protected tx a(dvv $$0, tx $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bpr.a<dvv> {
      g(final azl $$0, final String $$1, final xi $$2, final xi $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dvv b(dvt $$0, Path $$1) {
         return (dvv)(bpr.this.m
            ? new dvo($$0.a("source"), $$1, $$0.a("target"), bpr.a($$1), bpr.this.p, true, this.b)
            : new dvv($$0, $$1, bpr.this.p, true, this.b));
      }

      protected boolean a(dvv $$0, dbk $$1, akj<dcd> $$2) {
         tx $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvk.a($$3);
            tx $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bpr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tx a(dvv var1, tx var2);
   }
}
