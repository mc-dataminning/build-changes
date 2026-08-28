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

public class bpu {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xi d = wu.c("optimizeWorld.stage.upgrading.poi");
   static final xi e = wu.c("optimizeWorld.stage.finished.poi");
   static final xi f = wu.c("optimizeWorld.stage.upgrading.entities");
   static final xi g = wu.c("optimizeWorld.stage.finished.entities");
   static final xi h = wu.c("optimizeWorld.stage.upgrading.chunks");
   static final xi i = wu.c("optimizeWorld.stage.finished.chunks");
   final jw<dwg> j;
   final Set<akj<dcf>> k;
   final boolean l;
   final boolean m;
   final eqi.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akj<dcf>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wu y = wu.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eqc A;

   public bpu(eqi.c $$0, DataFixer $$1, jx $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(lr.ba);
      this.k = this.j.g().stream().map(lr::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eqc(this.n.a(dcf.h).resolve("data").toFile(), $$1, $$2);
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
      new bpu.d().a();
      a.info("Upgrading POIs");
      new bpu.f().a();
      a.info("Upgrading blocks");
      new bpu.b().a();
      this.A.a();
      $$0 = ac.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akj<dcf>> c() {
      return this.k;
   }

   public float a(akj<dcf> $$0) {
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
      protected final azo b;

      a(final azo $$0, final String $$1, final String $$2, final xi $$3, final xi $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bpu.this.u = 0;
         bpu.this.t = 0;
         bpu.this.v = 0;
         bpu.this.w = 0;
         List<bpu.c<T>> $$0 = this.b();
         if (bpu.this.t != 0) {
            float $$1 = (float)bpu.this.u;
            bpu.this.y = this.d;

            while (bpu.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bpu.c<T> $$4 : $$0) {
                  akj<dcf> $$5 = $$4.a;
                  ListIterator<bpu.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bpu.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dbm $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bpu.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bpu.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bpu.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bpu.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bpu.this.y = this.e;

            for (bpu.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bpu.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bpu.c<T>> b() {
         List<bpu.c<T>> $$0 = Lists.newArrayList();

         for (akj<dcf> $$1 : bpu.this.k) {
            dvz $$2 = new dvz(bpu.this.n.f(), $$1, this.f);
            Path $$3 = bpu.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bpu.e> $$5 = this.b($$2, $$3);
            $$0.add(new bpu.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dvz var1, Path var2);

      private ListIterator<bpu.e> b(dvz $$0, Path $$1) {
         List<bpu.e> $$2 = c($$0, $$1);
         bpu.this.u = bpu.this.u + $$2.size();
         bpu.this.t = bpu.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bpu.e> c(dvz $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bpu.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bpu.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dbm> $$8 = Lists.newArrayList();

                  try (dvw $$9 = new dvw($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dbm $$12 = new dbm($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bpu.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bpu.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akj<dcf> $$0, T $$1, dbm $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bpu.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bpu.this.v++;
         } else {
            bpu.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dbm var2, akj<dcf> var3);

      private void a(dvw $$0) {
         if (bpu.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bpu.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bpu.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bpu.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bpu.a<dvq> {
      b() {
         super(azo.c, "chunk", "region", bpu.h, bpu.i);
      }

      protected boolean a(dvq $$0, dbm $$1, akj<dcf> $$2) {
         tx $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvq.a($$3);
            duh $$5 = bpu.this.j.f(lr.b($$2)).b();
            tx $$6 = $$0.a($$2, () -> bpu.this.A, $$3, $$5.c());
            dbm $$7 = new dbm($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bpu.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bpu.this.l) {
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

            if ($$8 || bpu.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dvq b(dvz $$0, Path $$1) {
         return (dvq)(bpu.this.m ? new dvt($$0.a("source"), $$1, $$0.a("target"), bpu.a($$1), bpu.this.p, true) : new dvq($$0, $$1, bpu.this.p, true));
      }
   }

   static record c<T>(akj<dcf> a, T b, ListIterator<bpu.e> c) {
   }

   class d extends bpu.g {
      d() {
         super(azo.s, "entities", bpu.f, bpu.g);
      }

      @Override
      protected tx a(dwb $$0, tx $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dvw a, List<dbm> b) {
   }

   class f extends bpu.g {
      f() {
         super(azo.q, "poi", bpu.d, bpu.e);
      }

      @Override
      protected tx a(dwb $$0, tx $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bpu.a<dwb> {
      g(final azo $$0, final String $$1, final xi $$2, final xi $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dwb b(dvz $$0, Path $$1) {
         return (dwb)(bpu.this.m
            ? new dvu($$0.a("source"), $$1, $$0.a("target"), bpu.a($$1), bpu.this.p, true, this.b)
            : new dwb($$0, $$1, bpu.this.p, true, this.b));
      }

      protected boolean a(dwb $$0, dbm $$1, akj<dcf> $$2) {
         tx $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dvq.a($$3);
            tx $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bpu.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tx a(dwb var1, tx var2);
   }
}
