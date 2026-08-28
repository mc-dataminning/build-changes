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

public class brz implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wp d = wp.c("optimizeWorld.stage.upgrading.poi");
   static final wp e = wp.c("optimizeWorld.stage.finished.poi");
   static final wp f = wp.c("optimizeWorld.stage.upgrading.entities");
   static final wp g = wp.c("optimizeWorld.stage.finished.entities");
   static final wp h = wp.c("optimizeWorld.stage.upgrading.chunks");
   static final wp i = wp.c("optimizeWorld.stage.finished.chunks");
   final ke<eau> j;
   final Set<aku<dgj>> k;
   final boolean l;
   final boolean m;
   final evg.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aku<dgj>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wp y = wp.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eva A;

   public brz(evg.c $$0, DataFixer $$1, kf $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mc.bf);
      this.k = this.j.j().stream().map(mc::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eva(this.n.a(dgj.i).resolve("data"), $$1, $$2);
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
      new brz.d().a();
      a.info("Upgrading POIs");
      new brz.f().a();
      a.info("Upgrading blocks");
      new brz.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aku<dgj>> c() {
      return this.k;
   }

   public float a(aku<dgj> $$0) {
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
         brz.this.u = 0;
         brz.this.t = 0;
         brz.this.v = 0;
         brz.this.w = 0;
         List<brz.c<T>> $$0 = this.b();
         if (brz.this.t != 0) {
            float $$1 = (float)brz.this.u;
            brz.this.y = this.d;

            while (brz.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brz.c<T> $$4 : $$0) {
                  aku<dgj> $$5 = $$4.a;
                  ListIterator<brz.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brz.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dfp $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brz.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brz.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brz.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brz.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brz.this.y = this.e;

            for (brz.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brz.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brz.c<T>> b() {
         List<brz.c<T>> $$0 = Lists.newArrayList();

         for (aku<dgj> $$1 : brz.this.k) {
            eam $$2 = new eam(brz.this.n.f(), $$1, this.f);
            Path $$3 = brz.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brz.e> $$5 = this.b($$2, $$3);
            $$0.add(new brz.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eam var1, Path var2);

      private ListIterator<brz.e> b(eam $$0, Path $$1) {
         List<brz.e> $$2 = c($$0, $$1);
         brz.this.u = brz.this.u + $$2.size();
         brz.this.t = brz.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brz.e> c(eam $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brz.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brz.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dfp> $$8 = Lists.newArrayList();

                  try (eaj $$9 = new eaj($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dfp $$12 = new dfp($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brz.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brz.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aku<dgj> $$0, T $$1, dfp $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brz.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brz.this.v++;
         } else {
            brz.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dfp var2, aku<dgj> var3);

      private void a(eaj $$0) {
         if (brz.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brz.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brz.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brz.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brz.a<ead> {
      b() {
         super(ban.c, "chunk", "region", brz.h, brz.i);
      }

      protected boolean a(ead $$0, dfp $$1, aku<dgj> $$2) {
         tq $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ead.a($$3);
            dyu $$5 = brz.this.j.g(mc.b($$2)).b();
            tq $$6 = $$0.a($$2, () -> brz.this.A, $$3, $$5.c());
            dfp $$7 = new dfp($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brz.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brz.this.l) {
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

            if ($$8 || brz.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected ead b(eam $$0, Path $$1) {
         return (ead)(brz.this.m ? new eag($$0.a("source"), $$1, $$0.a("target"), brz.a($$1), brz.this.p, true) : new ead($$0, $$1, brz.this.p, true));
      }
   }

   static record c<T>(aku<dgj> a, T b, ListIterator<brz.e> c) {
   }

   class d extends brz.g {
      d() {
         super(ban.s, "entities", brz.f, brz.g);
      }

      @Override
      protected tq a(eap $$0, tq $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eaj a, List<dfp> b) {
   }

   class f extends brz.g {
      f() {
         super(ban.q, "poi", brz.d, brz.e);
      }

      @Override
      protected tq a(eap $$0, tq $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brz.a<eap> {
      g(final ban $$0, final String $$1, final wp $$2, final wp $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eap b(eam $$0, Path $$1) {
         return (eap)(brz.this.m
            ? new eah($$0.a("source"), $$1, $$0.a("target"), brz.a($$1), brz.this.p, true, this.b)
            : new eap($$0, $$1, brz.this.p, true, this.b));
      }

      protected boolean a(eap $$0, dfp $$1, aku<dgj> $$2) {
         tq $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ead.a($$3);
            tq $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brz.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tq a(eap var1, tq var2);
   }
}
