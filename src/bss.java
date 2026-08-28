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

public class bss implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xv d = xv.c("optimizeWorld.stage.upgrading.poi");
   static final xv e = xv.c("optimizeWorld.stage.finished.poi");
   static final xv f = xv.c("optimizeWorld.stage.upgrading.entities");
   static final xv g = xv.c("optimizeWorld.stage.finished.entities");
   static final xv h = xv.c("optimizeWorld.stage.upgrading.chunks");
   static final xv i = xv.c("optimizeWorld.stage.finished.chunks");
   final kd<ebj> j;
   final Set<aly<dha>> k;
   final boolean l;
   final boolean m;
   final evv.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aly<dha>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xv y = xv.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final evp A;

   public bss(evv.c $$0, DataFixer $$1, ke $$2, boolean $$3, boolean $$4) {
      this.j = $$2.e(mb.be);
      this.k = this.j.j().stream().map(mb::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new evp(this.n.a(dha.i).resolve("data"), $$1, $$2);
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
      new bss.d().a();
      a.info("Upgrading POIs");
      new bss.f().a();
      a.info("Upgrading blocks");
      new bss.b().a();
      this.A.b();
      $$0 = ae.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aly<dha>> c() {
      return this.k;
   }

   public float a(aly<dha> $$0) {
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
      protected final bbo b;

      a(final bbo $$0, final String $$1, final String $$2, final xv $$3, final xv $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bss.this.u = 0;
         bss.this.t = 0;
         bss.this.v = 0;
         bss.this.w = 0;
         List<bss.c<T>> $$0 = this.b();
         if (bss.this.t != 0) {
            float $$1 = (float)bss.this.u;
            bss.this.y = this.d;

            while (bss.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bss.c<T> $$4 : $$0) {
                  aly<dha> $$5 = $$4.a;
                  ListIterator<bss.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bss.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dgg $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bss.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bss.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bss.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bss.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bss.this.y = this.e;

            for (bss.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bss.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bss.c<T>> b() {
         List<bss.c<T>> $$0 = Lists.newArrayList();

         for (aly<dha> $$1 : bss.this.k) {
            ebb $$2 = new ebb(bss.this.n.f(), $$1, this.f);
            Path $$3 = bss.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bss.e> $$5 = this.b($$2, $$3);
            $$0.add(new bss.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ebb var1, Path var2);

      private ListIterator<bss.e> b(ebb $$0, Path $$1) {
         List<bss.e> $$2 = c($$0, $$1);
         bss.this.u = bss.this.u + $$2.size();
         bss.this.t = bss.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bss.e> c(ebb $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bss.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bss.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dgg> $$8 = Lists.newArrayList();

                  try (eay $$9 = new eay($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dgg $$12 = new dgg($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bss.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bss.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aly<dha> $$0, T $$1, dgg $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bss.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bss.this.v++;
         } else {
            bss.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dgg var2, aly<dha> var3);

      private void a(eay $$0) {
         if (bss.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bss.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bss.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bss.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bss.a<eas> {
      b() {
         super(bbo.c, "chunk", "region", bss.h, bss.i);
      }

      protected boolean a(eas $$0, dgg $$1, aly<dha> $$2) {
         ux $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eas.a($$3);
            dzj $$5 = bss.this.j.g(mb.b($$2)).b();
            ux $$6 = $$0.a($$2, () -> bss.this.A, $$3, $$5.c());
            dgg $$7 = new dgg($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bss.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bss.this.l) {
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

            if ($$8 || bss.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eas b(ebb $$0, Path $$1) {
         return (eas)(bss.this.m ? new eav($$0.a("source"), $$1, $$0.a("target"), bss.a($$1), bss.this.p, true) : new eas($$0, $$1, bss.this.p, true));
      }
   }

   static record c<T>(aly<dha> a, T b, ListIterator<bss.e> c) {
   }

   class d extends bss.g {
      d() {
         super(bbo.s, "entities", bss.f, bss.g);
      }

      @Override
      protected ux a(ebe $$0, ux $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eay a, List<dgg> b) {
   }

   class f extends bss.g {
      f() {
         super(bbo.q, "poi", bss.d, bss.e);
      }

      @Override
      protected ux a(ebe $$0, ux $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bss.a<ebe> {
      g(final bbo $$0, final String $$1, final xv $$2, final xv $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ebe b(ebb $$0, Path $$1) {
         return (ebe)(bss.this.m
            ? new eaw($$0.a("source"), $$1, $$0.a("target"), bss.a($$1), bss.this.p, true, this.b)
            : new ebe($$0, $$1, bss.this.p, true, this.b));
      }

      protected boolean a(ebe $$0, dgg $$1, aly<dha> $$2) {
         ux $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eas.a($$3);
            ux $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bss.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ux a(ebe var1, ux var2);
   }
}
