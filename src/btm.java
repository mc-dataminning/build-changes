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

public class btm implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final ww d = ww.c("optimizeWorld.stage.upgrading.poi");
   static final ww e = ww.c("optimizeWorld.stage.finished.poi");
   static final ww f = ww.c("optimizeWorld.stage.upgrading.entities");
   static final ww g = ww.c("optimizeWorld.stage.finished.entities");
   static final ww h = ww.c("optimizeWorld.stage.upgrading.chunks");
   static final ww i = ww.c("optimizeWorld.stage.finished.chunks");
   final jr<edm> j;
   final Set<ald<dip>> k;
   final boolean l;
   final boolean m;
   final eyb.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<ald<dip>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile ww y = ww.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final exv A;

   public btm(eyb.c $$0, DataFixer $$1, js $$2, boolean $$3, boolean $$4) {
      this.j = $$2.f(mg.bn);
      this.k = this.j.j().stream().map(mg::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new exv(this.n.a(dip.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = ww.c("optimizeWorld.stage.failed");
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
      long $$0 = af.c();
      a.info("Upgrading entities");
      new btm.d().a();
      a.info("Upgrading POIs");
      new btm.f().a();
      a.info("Upgrading blocks");
      new btm.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<ald<dip>> c() {
      return this.k;
   }

   public float a(ald<dip> $$0) {
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

   public ww h() {
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
      private final ww d;
      private final ww e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final baz b;

      a(final baz $$0, final String $$1, final String $$2, final ww $$3, final ww $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         btm.this.u = 0;
         btm.this.t = 0;
         btm.this.v = 0;
         btm.this.w = 0;
         List<btm.c<T>> $$0 = this.b();
         if (btm.this.t != 0) {
            float $$1 = (float)btm.this.u;
            btm.this.y = this.d;

            while (btm.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (btm.c<T> $$4 : $$0) {
                  ald<dip> $$5 = $$4.a;
                  ListIterator<btm.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     btm.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dhw $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (btm.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           btm.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  btm.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               btm.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            btm.this.y = this.e;

            for (btm.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  btm.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<btm.c<T>> b() {
         List<btm.c<T>> $$0 = Lists.newArrayList();

         for (ald<dip> $$1 : btm.this.k) {
            ede $$2 = new ede(btm.this.n.f(), $$1, this.f);
            Path $$3 = btm.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<btm.e> $$5 = this.b($$2, $$3);
            $$0.add(new btm.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ede var1, Path var2);

      private ListIterator<btm.e> b(ede $$0, Path $$1) {
         List<btm.e> $$2 = c($$0, $$1);
         btm.this.u = btm.this.u + $$2.size();
         btm.this.t = btm.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<btm.e> c(ede $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<btm.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = btm.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dhw> $$8 = Lists.newArrayList();

                  try (edb $$9 = new edb($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dhw $$12 = new dhw($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new btm.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     btm.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(ald<dip> $$0, T $$1, dhw $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            btm.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            btm.this.v++;
         } else {
            btm.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dhw var2, ald<dip> var3);

      private void a(edb $$0) {
         if (btm.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = btm.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  btm.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               btm.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends btm.a<ecv> {
      b() {
         super(baz.c, "chunk", "region", btm.h, btm.i);
      }

      protected boolean a(ecv $$0, dhw $$1, ald<dip> $$2) {
         tx $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ecv.a($$3);
            ebm $$5 = btm.this.j.g(mg.b($$2)).b();
            tx $$6 = $$0.a($$2, () -> btm.this.A, $$3, $$5.c());
            dhw $$7 = new dhw($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               btm.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (btm.this.l) {
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

            if ($$8 || btm.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected ecv b(ede $$0, Path $$1) {
         return (ecv)(btm.this.m ? new ecy($$0.a("source"), $$1, $$0.a("target"), btm.a($$1), btm.this.p, true) : new ecv($$0, $$1, btm.this.p, true));
      }
   }

   static record c<T>(ald<dip> a, T b, ListIterator<btm.e> c) {
   }

   class d extends btm.g {
      d() {
         super(baz.s, "entities", btm.f, btm.g);
      }

      @Override
      protected tx a(edh $$0, tx $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(edb a, List<dhw> b) {
   }

   class f extends btm.g {
      f() {
         super(baz.q, "poi", btm.d, btm.e);
      }

      @Override
      protected tx a(edh $$0, tx $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends btm.a<edh> {
      g(final baz $$0, final String $$1, final ww $$2, final ww $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected edh b(ede $$0, Path $$1) {
         return (edh)(btm.this.m
            ? new ecz($$0.a("source"), $$1, $$0.a("target"), btm.a($$1), btm.this.p, true, this.b)
            : new edh($$0, $$1, btm.this.p, true, this.b));
      }

      protected boolean a(edh $$0, dhw $$1, ald<dip> $$2) {
         tx $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ecv.a($$3);
            tx $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || btm.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tx a(edh var1, tx var2);
   }
}
