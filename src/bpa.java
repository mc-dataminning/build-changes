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

public class bpa {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xi d = wu.c("optimizeWorld.stage.upgrading.poi");
   static final xi e = wu.c("optimizeWorld.stage.finished.poi");
   static final xi f = wu.c("optimizeWorld.stage.upgrading.entities");
   static final xi g = wu.c("optimizeWorld.stage.finished.entities");
   static final xi h = wu.c("optimizeWorld.stage.upgrading.chunks");
   static final xi i = wu.c("optimizeWorld.stage.finished.chunks");
   final jj<dua> j;
   final Set<akg<dad>> k;
   final boolean l;
   final boolean m;
   final eob.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<akg<dad>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wu y = wu.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final env A;

   public bpa(eob.c $$0, DataFixer $$1, jk $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(le.aT);
      this.k = this.j.f().stream().map(le::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new env(this.n.a(dad.h).resolve("data").toFile(), $$1, $$2);
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
      long $$0 = ac.b();
      a.info("Upgrading entities");
      new bpa.d().a();
      a.info("Upgrading POIs");
      new bpa.f().a();
      a.info("Upgrading blocks");
      new bpa.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<akg<dad>> c() {
      return this.k;
   }

   public float a(akg<dad> $$0) {
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
      protected final azf b;

      a(azf $$0, String $$1, String $$2, xi $$3, xi $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bpa.this.u = 0;
         bpa.this.t = 0;
         bpa.this.v = 0;
         bpa.this.w = 0;
         List<bpa.c<T>> $$0 = this.b();
         if (bpa.this.t != 0) {
            float $$1 = (float)bpa.this.u;
            bpa.this.y = this.d;

            while (bpa.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bpa.c<T> $$4 : $$0) {
                  akg<dad> $$5 = $$4.a;
                  ListIterator<bpa.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bpa.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (czk $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bpa.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bpa.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bpa.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bpa.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bpa.this.y = this.e;

            for (bpa.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bpa.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bpa.c<T>> b() {
         List<bpa.c<T>> $$0 = Lists.newArrayList();

         for (akg<dad> $$1 : bpa.this.k) {
            dtt $$2 = new dtt(bpa.this.n.f(), $$1, this.f);
            Path $$3 = bpa.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bpa.e> $$5 = this.b($$2, $$3);
            $$0.add(new bpa.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dtt var1, Path var2);

      private ListIterator<bpa.e> b(dtt $$0, Path $$1) {
         List<bpa.e> $$2 = c($$0, $$1);
         bpa.this.u = bpa.this.u + $$2.size();
         bpa.this.t = bpa.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bpa.e> c(dtt $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bpa.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bpa.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<czk> $$8 = Lists.newArrayList();

                  try (dtq $$9 = new dtq($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           czk $$12 = new czk($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bpa.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bpa.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(akg<dad> $$0, T $$1, czk $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bpa.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bpa.this.v++;
         } else {
            bpa.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, czk var2, akg<dad> var3);

      private void a(dtq $$0) {
         if (bpa.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bpa.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bpa.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bpa.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bpa.a<dtk> {
      b() {
         super(azf.c, "chunk", "region", bpa.h, bpa.i);
      }

      protected boolean a(dtk $$0, czk $$1, akg<dad> $$2) {
         ua $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dtk.a($$3);
            dse $$5 = bpa.this.j.f(le.b($$2)).b();
            ua $$6 = $$0.a($$2, () -> bpa.this.A, $$3, $$5.b());
            czk $$7 = new czk($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bpa.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bpa.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               ug $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  ua $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bpa.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dtk b(dtt $$0, Path $$1) {
         return (dtk)(bpa.this.m ? new dtn($$0.a("source"), $$1, $$0.a("target"), bpa.a($$1), bpa.this.p, true) : new dtk($$0, $$1, bpa.this.p, true));
      }
   }

   static record c<T>(akg<dad> a, T b, ListIterator<bpa.e> c) {
   }

   class d extends bpa.g {
      d() {
         super(azf.s, "entities", bpa.f, bpa.g);
      }

      @Override
      protected ua a(dtv $$0, ua $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dtq a, List<czk> b) {
   }

   class f extends bpa.g {
      f() {
         super(azf.q, "poi", bpa.d, bpa.e);
      }

      @Override
      protected ua a(dtv $$0, ua $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bpa.a<dtv> {
      g(azf $$0, String $$1, xi $$2, xi $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dtv b(dtt $$0, Path $$1) {
         return (dtv)(bpa.this.m
            ? new dto($$0.a("source"), $$1, $$0.a("target"), bpa.a($$1), bpa.this.p, true, this.b)
            : new dtv($$0, $$1, bpa.this.p, true, this.b));
      }

      protected boolean a(dtv $$0, czk $$1, akg<dad> $$2) {
         ua $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dtk.a($$3);
            ua $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bpa.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ua a(dtv var1, ua var2);
   }
}
