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

public class bsx implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xv d = xv.c("optimizeWorld.stage.upgrading.poi");
   static final xv e = xv.c("optimizeWorld.stage.finished.poi");
   static final xv f = xv.c("optimizeWorld.stage.upgrading.entities");
   static final xv g = xv.c("optimizeWorld.stage.finished.entities");
   static final xv h = xv.c("optimizeWorld.stage.upgrading.chunks");
   static final xv i = xv.c("optimizeWorld.stage.finished.chunks");
   final kd<ebr> j;
   final Set<aly<dhi>> k;
   final boolean l;
   final boolean m;
   final ewd.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aly<dhi>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xv y = xv.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final evx A;

   public bsx(ewd.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mb.bf);
      this.k = this.j.j().stream().map(mb::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new evx(this.n.a(dhi.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xv.c("optimizeWorld.stage.failed");
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
      new bsx.d().a();
      a.info("Upgrading POIs");
      new bsx.f().a();
      a.info("Upgrading blocks");
      new bsx.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aly<dhi>> c() {
      return this.k;
   }

   public float a(aly<dhi> $$0) {
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

   public xv h() {
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
      private final xv d;
      private final xv e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbs b;

      a(final bbs $$0, final String $$1, final String $$2, final xv $$3, final xv $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bsx.this.u = 0;
         bsx.this.t = 0;
         bsx.this.v = 0;
         bsx.this.w = 0;
         List<bsx.c<T>> $$0 = this.b();
         if (bsx.this.t != 0) {
            float $$1 = (float)bsx.this.u;
            bsx.this.y = this.d;

            while (bsx.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bsx.c<T> $$4 : $$0) {
                  aly<dhi> $$5 = $$4.a;
                  ListIterator<bsx.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bsx.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dgo $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bsx.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bsx.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bsx.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bsx.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bsx.this.y = this.e;

            for (bsx.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bsx.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bsx.c<T>> b() {
         List<bsx.c<T>> $$0 = Lists.newArrayList();

         for (aly<dhi> $$1 : bsx.this.k) {
            ebj $$2 = new ebj(bsx.this.n.f(), $$1, this.f);
            Path $$3 = bsx.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bsx.e> $$5 = this.b($$2, $$3);
            $$0.add(new bsx.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ebj var1, Path var2);

      private ListIterator<bsx.e> b(ebj $$0, Path $$1) {
         List<bsx.e> $$2 = c($$0, $$1);
         bsx.this.u = bsx.this.u + $$2.size();
         bsx.this.t = bsx.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bsx.e> c(ebj $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bsx.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bsx.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dgo> $$8 = Lists.newArrayList();

                  try (ebg $$9 = new ebg($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dgo $$12 = new dgo($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bsx.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bsx.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aly<dhi> $$0, T $$1, dgo $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bsx.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bsx.this.v++;
         } else {
            bsx.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dgo var2, aly<dhi> var3);

      private void a(ebg $$0) {
         if (bsx.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bsx.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bsx.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bsx.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bsx.a<eba> {
      b() {
         super(bbs.c, "chunk", "region", bsx.h, bsx.i);
      }

      protected boolean a(eba $$0, dgo $$1, aly<dhi> $$2) {
         ux $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eba.a($$3);
            dzr $$5 = bsx.this.j.g(mb.b($$2)).b();
            ux $$6 = $$0.a($$2, () -> bsx.this.A, $$3, $$5.c());
            dgo $$7 = new dgo($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bsx.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bsx.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               vd $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ux $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bsx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eba b(ebj $$0, Path $$1) {
         return (eba)(bsx.this.m ? new ebd($$0.a("source"), $$1, $$0.a("target"), bsx.a($$1), bsx.this.p, true) : new eba($$0, $$1, bsx.this.p, true));
      }
   }

   static record c<T>(aly<dhi> a, T b, ListIterator<bsx.e> c) {
   }

   class d extends bsx.g {
      d() {
         super(bbs.s, "entities", bsx.f, bsx.g);
      }

      @Override
      protected ux a(ebm $$0, ux $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(ebg a, List<dgo> b) {
   }

   class f extends bsx.g {
      f() {
         super(bbs.q, "poi", bsx.d, bsx.e);
      }

      @Override
      protected ux a(ebm $$0, ux $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bsx.a<ebm> {
      g(final bbs $$0, final String $$1, final xv $$2, final xv $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ebm b(ebj $$0, Path $$1) {
         return (ebm)(bsx.this.m
            ? new ebe($$0.a("source"), $$1, $$0.a("target"), bsx.a($$1), bsx.this.p, true, this.b)
            : new ebm($$0, $$1, bsx.this.p, true, this.b));
      }

      protected boolean a(ebm $$0, dgo $$1, aly<dhi> $$2) {
         ux $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eba.a($$3);
            ux $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bsx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ux a(ebm var1, ux var2);
   }
}
