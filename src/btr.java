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

public class btr implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wy d = wy.c("optimizeWorld.stage.upgrading.poi");
   static final wy e = wy.c("optimizeWorld.stage.finished.poi");
   static final wy f = wy.c("optimizeWorld.stage.upgrading.entities");
   static final wy g = wy.c("optimizeWorld.stage.finished.entities");
   static final wy h = wy.c("optimizeWorld.stage.upgrading.chunks");
   static final wy i = wy.c("optimizeWorld.stage.finished.chunks");
   final jr<eef> j;
   final Set<alf<dja>> k;
   final boolean l;
   final boolean m;
   final eyv.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alf<dja>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wy y = wy.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eyp A;

   public btr(eyv.c $$0, DataFixer $$1, ezb $$2, js $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mg.bp);
      this.k = this.j.j().stream().map(mg::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      eya.a $$6 = new eya.a(null, $$2.y().c());
      this.A = new eyp($$6, this.n.a(dja.i).resolve("data"), $$1, $$3);
      this.m = $$5;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wy.c("optimizeWorld.stage.failed");
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
      new btr.d().a();
      a.info("Upgrading POIs");
      new btr.f().a();
      a.info("Upgrading blocks");
      new btr.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alf<dja>> c() {
      return this.k;
   }

   public float a(alf<dja> $$0) {
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

   public wy h() {
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
      private final wy d;
      private final wy e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbb b;

      a(final bbb $$0, final String $$1, final String $$2, final wy $$3, final wy $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         btr.this.u = 0;
         btr.this.t = 0;
         btr.this.v = 0;
         btr.this.w = 0;
         List<btr.c<T>> $$0 = this.b();
         if (btr.this.t != 0) {
            float $$1 = (float)btr.this.u;
            btr.this.y = this.d;

            while (btr.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (btr.c<T> $$4 : $$0) {
                  alf<dja> $$5 = $$4.a;
                  ListIterator<btr.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     btr.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dih $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (btr.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           btr.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  btr.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               btr.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            btr.this.y = this.e;

            for (btr.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  btr.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<btr.c<T>> b() {
         List<btr.c<T>> $$0 = Lists.newArrayList();

         for (alf<dja> $$1 : btr.this.k) {
            edx $$2 = new edx(btr.this.n.f(), $$1, this.f);
            Path $$3 = btr.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<btr.e> $$5 = this.b($$2, $$3);
            $$0.add(new btr.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(edx var1, Path var2);

      private ListIterator<btr.e> b(edx $$0, Path $$1) {
         List<btr.e> $$2 = c($$0, $$1);
         btr.this.u = btr.this.u + $$2.size();
         btr.this.t = btr.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<btr.e> c(edx $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<btr.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = btr.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dih> $$8 = Lists.newArrayList();

                  try (edu $$9 = new edu($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dih $$12 = new dih($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new btr.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     btr.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alf<dja> $$0, T $$1, dih $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            btr.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            btr.this.v++;
         } else {
            btr.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dih var2, alf<dja> var3);

      private void a(edu $$0) {
         if (btr.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = btr.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  btr.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               btr.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends btr.a<edo> {
      b() {
         super(bbb.c, "chunk", "region", btr.h, btr.i);
      }

      protected boolean a(edo $$0, dih $$1, alf<dja> $$2) {
         tz $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = edo.a($$3);
            ecf $$5 = btr.this.j.g(mg.b($$2)).b();
            tz $$6 = $$0.a($$2, () -> btr.this.A, $$3, $$5.c());
            dih $$7 = new dih($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               btr.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (btr.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uf $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tz $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || btr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected edo b(edx $$0, Path $$1) {
         return (edo)(btr.this.m ? new edr($$0.a("source"), $$1, $$0.a("target"), btr.a($$1), btr.this.p, true) : new edo($$0, $$1, btr.this.p, true));
      }
   }

   static record c<T>(alf<dja> a, T b, ListIterator<btr.e> c) {
   }

   class d extends btr.g {
      d() {
         super(bbb.s, "entities", btr.f, btr.g);
      }

      @Override
      protected tz a(eea $$0, tz $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(edu a, List<dih> b) {
   }

   class f extends btr.g {
      f() {
         super(bbb.q, "poi", btr.d, btr.e);
      }

      @Override
      protected tz a(eea $$0, tz $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends btr.a<eea> {
      g(final bbb $$0, final String $$1, final wy $$2, final wy $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eea b(edx $$0, Path $$1) {
         return (eea)(btr.this.m
            ? new eds($$0.a("source"), $$1, $$0.a("target"), btr.a($$1), btr.this.p, true, this.b)
            : new eea($$0, $$1, btr.this.p, true, this.b));
      }

      protected boolean a(eea $$0, dih $$1, alf<dja> $$2) {
         tz $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = edo.a($$3);
            tz $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || btr.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tz a(eea var1, tz var2);
   }
}
