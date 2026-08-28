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

public class brw implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wo d = wo.c("optimizeWorld.stage.upgrading.poi");
   static final wo e = wo.c("optimizeWorld.stage.finished.poi");
   static final wo f = wo.c("optimizeWorld.stage.upgrading.entities");
   static final wo g = wo.c("optimizeWorld.stage.finished.entities");
   static final wo h = wo.c("optimizeWorld.stage.upgrading.chunks");
   static final wo i = wo.c("optimizeWorld.stage.finished.chunks");
   final ke<ear> j;
   final Set<akt<dgg>> k;
   final boolean l;
   final boolean m;
   final evd.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akt<dgg>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wo y = wo.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eux A;

   public brw(evd.c $$0, DataFixer $$1, kf $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mc.bf);
      this.k = this.j.j().stream().map(mc::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eux(this.n.a(dgg.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wo.c("optimizeWorld.stage.failed");
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
      new brw.d().a();
      a.info("Upgrading POIs");
      new brw.f().a();
      a.info("Upgrading blocks");
      new brw.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akt<dgg>> c() {
      return this.k;
   }

   public float a(akt<dgg> $$0) {
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

   public wo h() {
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
      private final wo d;
      private final wo e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bam b;

      a(final bam $$0, final String $$1, final String $$2, final wo $$3, final wo $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         brw.this.u = 0;
         brw.this.t = 0;
         brw.this.v = 0;
         brw.this.w = 0;
         List<brw.c<T>> $$0 = this.b();
         if (brw.this.t != 0) {
            float $$1 = (float)brw.this.u;
            brw.this.y = this.d;

            while (brw.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (brw.c<T> $$4 : $$0) {
                  akt<dgg> $$5 = $$4.a;
                  ListIterator<brw.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     brw.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dfm $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (brw.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           brw.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  brw.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               brw.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            brw.this.y = this.e;

            for (brw.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  brw.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<brw.c<T>> b() {
         List<brw.c<T>> $$0 = Lists.newArrayList();

         for (akt<dgg> $$1 : brw.this.k) {
            eaj $$2 = new eaj(brw.this.n.f(), $$1, this.f);
            Path $$3 = brw.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<brw.e> $$5 = this.b($$2, $$3);
            $$0.add(new brw.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eaj var1, Path var2);

      private ListIterator<brw.e> b(eaj $$0, Path $$1) {
         List<brw.e> $$2 = c($$0, $$1);
         brw.this.u = brw.this.u + $$2.size();
         brw.this.t = brw.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<brw.e> c(eaj $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<brw.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = brw.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dfm> $$8 = Lists.newArrayList();

                  try (eag $$9 = new eag($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dfm $$12 = new dfm($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new brw.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     brw.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akt<dgg> $$0, T $$1, dfm $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            brw.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            brw.this.v++;
         } else {
            brw.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dfm var2, akt<dgg> var3);

      private void a(eag $$0) {
         if (brw.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = brw.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  brw.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               brw.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends brw.a<eaa> {
      b() {
         super(bam.c, "chunk", "region", brw.h, brw.i);
      }

      protected boolean a(eaa $$0, dfm $$1, akt<dgg> $$2) {
         tq $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eaa.a($$3);
            dyr $$5 = brw.this.j.g(mc.b($$2)).b();
            tq $$6 = $$0.a($$2, () -> brw.this.A, $$3, $$5.c());
            dfm $$7 = new dfm($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               brw.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (brw.this.l) {
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

            if ($$8 || brw.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eaa b(eaj $$0, Path $$1) {
         return (eaa)(brw.this.m ? new ead($$0.a("source"), $$1, $$0.a("target"), brw.a($$1), brw.this.p, true) : new eaa($$0, $$1, brw.this.p, true));
      }
   }

   static record c<T>(akt<dgg> a, T b, ListIterator<brw.e> c) {
   }

   class d extends brw.g {
      d() {
         super(bam.s, "entities", brw.f, brw.g);
      }

      @Override
      protected tq a(eam $$0, tq $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eag a, List<dfm> b) {
   }

   class f extends brw.g {
      f() {
         super(bam.q, "poi", brw.d, brw.e);
      }

      @Override
      protected tq a(eam $$0, tq $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends brw.a<eam> {
      g(final bam $$0, final String $$1, final wo $$2, final wo $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eam b(eaj $$0, Path $$1) {
         return (eam)(brw.this.m
            ? new eae($$0.a("source"), $$1, $$0.a("target"), brw.a($$1), brw.this.p, true, this.b)
            : new eam($$0, $$1, brw.this.p, true, this.b));
      }

      protected boolean a(eam $$0, dfm $$1, akt<dgg> $$2) {
         tq $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eaa.a($$3);
            tq $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || brw.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tq a(eam var1, tq var2);
   }
}
