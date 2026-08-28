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

public class bqk {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final yd d = xp.c("optimizeWorld.stage.upgrading.poi");
   static final yd e = xp.c("optimizeWorld.stage.finished.poi");
   static final yd f = xp.c("optimizeWorld.stage.upgrading.entities");
   static final yd g = xp.c("optimizeWorld.stage.finished.entities");
   static final yd h = xp.c("optimizeWorld.stage.upgrading.chunks");
   static final yd i = xp.c("optimizeWorld.stage.finished.chunks");
   final jv<dvx> j;
   final Set<ale<dca>> k;
   final boolean l;
   final boolean m;
   final epy.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ale<dca>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xp y = xp.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eps A;

   public bqk(epy.c $$0, DataFixer $$1, jw $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lq.aT);
      this.k = this.j.f().stream().map(lq::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eps(this.n.a(dca.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xp.c("optimizeWorld.stage.failed");
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
      new bqk.d().a();
      a.info("Upgrading POIs");
      new bqk.f().a();
      a.info("Upgrading blocks");
      new bqk.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ale<dca>> c() {
      return this.k;
   }

   public float a(ale<dca> $$0) {
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

   public xp h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final yd d;
      private final yd e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bag b;

      a(final bag $$0, final String $$1, final String $$2, final yd $$3, final yd $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bqk.this.u = 0;
         bqk.this.t = 0;
         bqk.this.v = 0;
         bqk.this.w = 0;
         List<bqk.c<T>> $$0 = this.b();
         if (bqk.this.t != 0) {
            float $$1 = (float)bqk.this.u;
            bqk.this.y = this.d;

            while (bqk.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bqk.c<T> $$4 : $$0) {
                  ale<dca> $$5 = $$4.a;
                  ListIterator<bqk.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bqk.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbh $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bqk.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bqk.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bqk.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bqk.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bqk.this.y = this.e;

            for (bqk.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bqk.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bqk.c<T>> b() {
         List<bqk.c<T>> $$0 = Lists.newArrayList();

         for (ale<dca> $$1 : bqk.this.k) {
            dvq $$2 = new dvq(bqk.this.n.f(), $$1, this.f);
            Path $$3 = bqk.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bqk.e> $$5 = this.b($$2, $$3);
            $$0.add(new bqk.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvq var1, Path var2);

      private ListIterator<bqk.e> b(dvq $$0, Path $$1) {
         List<bqk.e> $$2 = c($$0, $$1);
         bqk.this.u = bqk.this.u + $$2.size();
         bqk.this.t = bqk.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bqk.e> c(dvq $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bqk.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bqk.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbh> $$8 = Lists.newArrayList();

                  try (dvn $$9 = new dvn($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbh $$12 = new dbh($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bqk.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bqk.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ale<dca> $$0, T $$1, dbh $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bqk.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bqk.this.v++;
         } else {
            bqk.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbh var2, ale<dca> var3);

      private void a(dvn $$0) {
         if (bqk.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bqk.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bqk.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bqk.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bqk.a<dvh> {
      b() {
         super(bag.c, "chunk", "region", bqk.h, bqk.i);
      }

      protected boolean a(dvh $$0, dbh $$1, ale<dca> $$2) {
         us $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvh.a($$3);
            dub $$5 = bqk.this.j.f(lq.b($$2)).b();
            us $$6 = $$0.a($$2, () -> bqk.this.A, $$3, $$5.c());
            dbh $$7 = new dbh($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bqk.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bqk.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uy $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  us $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bqk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dvh b(dvq $$0, Path $$1) {
         return (dvh)(bqk.this.m ? new dvk($$0.a("source"), $$1, $$0.a("target"), bqk.a($$1), bqk.this.p, true) : new dvh($$0, $$1, bqk.this.p, true));
      }
   }

   static record c<T>(ale<dca> a, T b, ListIterator<bqk.e> c) {
   }

   class d extends bqk.g {
      d() {
         super(bag.s, "entities", bqk.f, bqk.g);
      }

      @Override
      protected us a(dvs $$0, us $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvn a, List<dbh> b) {
   }

   class f extends bqk.g {
      f() {
         super(bag.q, "poi", bqk.d, bqk.e);
      }

      @Override
      protected us a(dvs $$0, us $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bqk.a<dvs> {
      g(final bag $$0, final String $$1, final yd $$2, final yd $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dvs b(dvq $$0, Path $$1) {
         return (dvs)(bqk.this.m
            ? new dvl($$0.a("source"), $$1, $$0.a("target"), bqk.a($$1), bqk.this.p, true, this.b)
            : new dvs($$0, $$1, bqk.this.p, true, this.b));
      }

      protected boolean a(dvs $$0, dbh $$1, ale<dca> $$2) {
         us $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvh.a($$3);
            us $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bqk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract us a(dvs var1, us var2);
   }
}
