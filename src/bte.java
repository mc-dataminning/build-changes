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

public class bte implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wv d = wv.c("optimizeWorld.stage.upgrading.poi");
   static final wv e = wv.c("optimizeWorld.stage.finished.poi");
   static final wv f = wv.c("optimizeWorld.stage.upgrading.entities");
   static final wv g = wv.c("optimizeWorld.stage.finished.entities");
   static final wv h = wv.c("optimizeWorld.stage.upgrading.chunks");
   static final wv i = wv.c("optimizeWorld.stage.finished.chunks");
   final kf<eck> j;
   final Set<alc<dhp>> k;
   final boolean l;
   final boolean m;
   final ewz.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alc<dhp>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wv y = wv.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final ewt A;

   public bte(ewz.c $$0, DataFixer $$1, kg $$2, boolean $$3, boolean $$4) {
      this.j = $$2.f(me.bm);
      this.k = this.j.j().stream().map(me::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new ewt(this.n.a(dhp.i).resolve("data"), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wv.c("optimizeWorld.stage.failed");
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
      new bte.d().a();
      a.info("Upgrading POIs");
      new bte.f().a();
      a.info("Upgrading blocks");
      new bte.b().a();
      this.A.b();
      $$0 = af.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alc<dhp>> c() {
      return this.k;
   }

   public float a(alc<dhp> $$0) {
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

   public wv h() {
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
      private final wv d;
      private final wv e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bax b;

      a(final bax $$0, final String $$1, final String $$2, final wv $$3, final wv $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bte.this.u = 0;
         bte.this.t = 0;
         bte.this.v = 0;
         bte.this.w = 0;
         List<bte.c<T>> $$0 = this.b();
         if (bte.this.t != 0) {
            float $$1 = (float)bte.this.u;
            bte.this.y = this.d;

            while (bte.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bte.c<T> $$4 : $$0) {
                  alc<dhp> $$5 = $$4.a;
                  ListIterator<bte.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bte.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dgw $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bte.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bte.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bte.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bte.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bte.this.y = this.e;

            for (bte.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bte.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bte.c<T>> b() {
         List<bte.c<T>> $$0 = Lists.newArrayList();

         for (alc<dhp> $$1 : bte.this.k) {
            ecc $$2 = new ecc(bte.this.n.f(), $$1, this.f);
            Path $$3 = bte.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bte.e> $$5 = this.b($$2, $$3);
            $$0.add(new bte.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ecc var1, Path var2);

      private ListIterator<bte.e> b(ecc $$0, Path $$1) {
         List<bte.e> $$2 = c($$0, $$1);
         bte.this.u = bte.this.u + $$2.size();
         bte.this.t = bte.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bte.e> c(ecc $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bte.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bte.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dgw> $$8 = Lists.newArrayList();

                  try (ebz $$9 = new ebz($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dgw $$12 = new dgw($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bte.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bte.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alc<dhp> $$0, T $$1, dgw $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | z var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bte.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bte.this.v++;
         } else {
            bte.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dgw var2, alc<dhp> var3);

      private void a(ebz $$0) {
         if (bte.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bte.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bte.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bte.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bte.a<ebt> {
      b() {
         super(bax.c, "chunk", "region", bte.h, bte.i);
      }

      protected boolean a(ebt $$0, dgw $$1, alc<dhp> $$2) {
         tw $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ebt.a($$3);
            eak $$5 = bte.this.j.g(me.b($$2)).b();
            tw $$6 = $$0.a($$2, () -> bte.this.A, $$3, $$5.c());
            dgw $$7 = new dgw($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bte.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ab.b().d().c();
            if (bte.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               uc $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tw $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bte.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected ebt b(ecc $$0, Path $$1) {
         return (ebt)(bte.this.m ? new ebw($$0.a("source"), $$1, $$0.a("target"), bte.a($$1), bte.this.p, true) : new ebt($$0, $$1, bte.this.p, true));
      }
   }

   static record c<T>(alc<dhp> a, T b, ListIterator<bte.e> c) {
   }

   class d extends bte.g {
      d() {
         super(bax.s, "entities", bte.f, bte.g);
      }

      @Override
      protected tw a(ecf $$0, tw $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(ebz a, List<dgw> b) {
   }

   class f extends bte.g {
      f() {
         super(bax.q, "poi", bte.d, bte.e);
      }

      @Override
      protected tw a(ecf $$0, tw $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bte.a<ecf> {
      g(final bax $$0, final String $$1, final wv $$2, final wv $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ecf b(ecc $$0, Path $$1) {
         return (ecf)(bte.this.m
            ? new ebx($$0.a("source"), $$1, $$0.a("target"), bte.a($$1), bte.this.p, true, this.b)
            : new ecf($$0, $$1, bte.this.p, true, this.b));
      }

      protected boolean a(ecf $$0, dgw $$1, alc<dhp> $$2) {
         tw $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ebt.a($$3);
            tw $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ab.b().d().c();
            if ($$6 || bte.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tw a(ecf var1, tw var2);
   }
}
