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

public class brx implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wp d = wp.c("optimizeWorld.stage.upgrading.poi");
   static final wp e = wp.c("optimizeWorld.stage.finished.poi");
   static final wp f = wp.c("optimizeWorld.stage.upgrading.entities");
   static final wp g = wp.c("optimizeWorld.stage.finished.entities");
   static final wp h = wp.c("optimizeWorld.stage.upgrading.chunks");
   static final wp i = wp.c("optimizeWorld.stage.finished.chunks");
   final ke<eas> j;
   final Set<aku<dgh>> k;
   final boolean l;
   final boolean m;
   final eve.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aku<dgh>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wp y = wp.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final euy A;

   public brx(eve.c $$0, DataFixer $$1, kf $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mc.bf);
      this.k = this.j.j().stream().map(mc::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new euy(this.n.a(dgh.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wp.c("optimizeWorld.stage.failed");
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
      new brx.d().a();
      a.info("Upgrading POIs");
      new brx.f().a();
      a.info("Upgrading blocks");
      new brx.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aku<dgh>> c() {
      return this.k;
   }

   public float a(aku<dgh> $$0) {
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

   public wp h() {
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
      private final wp d;
      private final wp e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final ban b;

      a(final ban $$0, final String $$1, final String $$2, final wp $$3, final wp $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brx.this.u = 0;
         brx.this.t = 0;
         brx.this.v = 0;
         brx.this.w = 0;
         List<brx.c<T>> $$0 = this.b();
         if (brx.this.t != 0) {
            float $$1 = (float)brx.this.u;
            brx.this.y = this.d;

            while (brx.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brx.c<T> $$4 : $$0) {
                  aku<dgh> $$5 = $$4.a;
                  ListIterator<brx.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brx.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dfn $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brx.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brx.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brx.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brx.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brx.this.y = this.e;

            for (brx.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brx.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brx.c<T>> b() {
         List<brx.c<T>> $$0 = Lists.newArrayList();

         for (aku<dgh> $$1 : brx.this.k) {
            eak $$2 = new eak(brx.this.n.f(), $$1, this.f);
            Path $$3 = brx.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brx.e> $$5 = this.b($$2, $$3);
            $$0.add(new brx.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eak var1, Path var2);

      private ListIterator<brx.e> b(eak $$0, Path $$1) {
         List<brx.e> $$2 = c($$0, $$1);
         brx.this.u = brx.this.u + $$2.size();
         brx.this.t = brx.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brx.e> c(eak $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brx.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brx.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dfn> $$8 = Lists.newArrayList();

                  try (eah $$9 = new eah($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dfn $$12 = new dfn($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brx.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brx.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aku<dgh> $$0, T $$1, dfn $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brx.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brx.this.v++;
         } else {
            brx.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dfn var2, aku<dgh> var3);

      private void a(eah $$0) {
         if (brx.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brx.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brx.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brx.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brx.a<eab> {
      b() {
         super(ban.c, "chunk", "region", brx.h, brx.i);
      }

      protected boolean a(eab $$0, dfn $$1, aku<dgh> $$2) {
         tq $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eab.a($$3);
            dys $$5 = brx.this.j.g(mc.b($$2)).b();
            tq $$6 = $$0.a($$2, () -> brx.this.A, $$3, $$5.c());
            dfn $$7 = new dfn($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brx.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brx.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               tw $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tq $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || brx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eab b(eak $$0, Path $$1) {
         return (eab)(brx.this.m ? new eae($$0.a("source"), $$1, $$0.a("target"), brx.a($$1), brx.this.p, true) : new eab($$0, $$1, brx.this.p, true));
      }
   }

   static record c<T>(aku<dgh> a, T b, ListIterator<brx.e> c) {
   }

   class d extends brx.g {
      d() {
         super(ban.s, "entities", brx.f, brx.g);
      }

      @Override
      protected tq a(ean $$0, tq $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eah a, List<dfn> b) {
   }

   class f extends brx.g {
      f() {
         super(ban.q, "poi", brx.d, brx.e);
      }

      @Override
      protected tq a(ean $$0, tq $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brx.a<ean> {
      g(final ban $$0, final String $$1, final wp $$2, final wp $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ean b(eak $$0, Path $$1) {
         return (ean)(brx.this.m
            ? new eaf($$0.a("source"), $$1, $$0.a("target"), brx.a($$1), brx.this.p, true, this.b)
            : new ean($$0, $$1, brx.this.p, true, this.b));
      }

      protected boolean a(ean $$0, dfn $$1, aku<dgh> $$2) {
         tq $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eab.a($$3);
            tq $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tq a(ean var1, tq var2);
   }
}
