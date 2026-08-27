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

public class blk {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final we d = vq.c("optimizeWorld.stage.upgrading.poi");
   static final we e = vq.c("optimizeWorld.stage.finished.poi");
   static final we f = vq.c("optimizeWorld.stage.upgrading.entities");
   static final we g = vq.c("optimizeWorld.stage.finished.entities");
   static final we h = vq.c("optimizeWorld.stage.upgrading.chunks");
   static final we i = vq.c("optimizeWorld.stage.finished.chunks");
   final iv<dow> j;
   final Set<aix<cvr>> k;
   final boolean l;
   final boolean m;
   final eis.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aix<cvr>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile vq y = vq.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final eim A;

   public blk(eis.c $$0, DataFixer $$1, iv<dow> $$2, boolean $$3, boolean $$4) {
      this.j = $$2;
      this.k = $$2.f().stream().map(kg::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new eim(this.n.a(cvr.h).resolve("data").toFile(), $$1);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = vq.c("optimizeWorld.stage.failed");
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
      new blk.d().a();
      a.info("Upgrading POIs");
      new blk.f().a();
      a.info("Upgrading blocks");
      new blk.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aix<cvr>> c() {
      return this.k;
   }

   public float a(aix<cvr> $$0) {
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

   public vq h() {
      return this.y;
   }

   abstract class a<T extends AutoCloseable> {
      private final we d;
      private final we e;
      private final String f;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final axo b;

      a(axo $$0, String $$1, we $$2, we $$3) {
         this.b = $$0;
         this.f = $$1;
         this.d = $$2;
         this.e = $$3;
      }

      public void a() {
         blk.this.u = 0;
         blk.this.t = 0;
         blk.this.v = 0;
         blk.this.w = 0;
         List<blk.c<T>> $$0 = this.a(this.f);
         if (blk.this.t != 0) {
            float $$1 = (float)blk.this.u;
            blk.this.y = this.d;

            while (blk.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (blk.c<T> $$4 : $$0) {
                  aix<cvr> $$5 = $$4.a;
                  ListIterator<blk.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     blk.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (cuy $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (blk.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           blk.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  blk.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               blk.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            blk.this.y = this.e;

            for (blk.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  blk.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<blk.c<T>> a(String $$0) {
         List<blk.c<T>> $$1 = Lists.newArrayList();

         for (aix<cvr> $$2 : blk.this.k) {
            Path $$3 = blk.this.n.a($$2);
            Path $$4 = $$3.resolve($$0);
            T $$5 = this.a($$0, $$3, $$4);
            ListIterator<blk.e> $$6 = this.a($$0, $$2);
            $$1.add(new blk.c<>($$2, $$5, $$6));
         }

         return $$1;
      }

      protected abstract T a(String var1, Path var2, Path var3);

      private ListIterator<blk.e> a(String $$0, aix<cvr> $$1) {
         List<blk.e> $$2 = this.a($$1, $$0);
         blk.this.u = blk.this.u + $$2.size();
         blk.this.t = blk.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private List<blk.e> a(aix<cvr> $$0, String $$1) {
         File $$2 = blk.this.n.a($$0).toFile();
         File $$3 = new File($$2, $$1);
         File[] $$4 = $$3.listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$4 == null) {
            return List.of();
         } else {
            List<blk.e> $$5 = Lists.newArrayList();

            for (File $$6 : $$4) {
               Matcher $$7 = blk.z.matcher($$6.getName());
               if ($$7.matches()) {
                  int $$8 = Integer.parseInt($$7.group(1)) << 5;
                  int $$9 = Integer.parseInt($$7.group(2)) << 5;
                  List<cuy> $$10 = Lists.newArrayList();

                  try (don $$11 = new don($$6.toPath(), $$3.toPath(), true)) {
                     for (int $$12 = 0; $$12 < 32; $$12++) {
                        for (int $$13 = 0; $$13 < 32; $$13++) {
                           cuy $$14 = new cuy($$12 + $$8, $$13 + $$9);
                           if ($$11.b($$14)) {
                              $$10.add($$14);
                           }
                        }
                     }

                     if (!$$10.isEmpty()) {
                        $$5.add(new blk.e($$11, $$10));
                     }
                  } catch (Throwable var21) {
                     blk.a.error("Failed to read chunks from region file {}", $$6.toPath(), var21);
                  }
               }
            }

            return $$5;
         }
      }

      private boolean a(aix<cvr> $$0, T $$1, cuy $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            blk.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            blk.this.v++;
         } else {
            blk.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, cuy var2, aix<cvr> var3);

      private void a(don $$0) {
         if (blk.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = $$2.resolveSibling("new_" + $$2.getFileName().toString()).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  blk.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               blk.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends blk.a<doh> {
      b() {
         super(axo.c, "region", blk.h, blk.i);
      }

      protected boolean a(doh $$0, cuy $$1, aix<cvr> $$2) {
         sw $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = doh.a($$3);
            dng $$5 = blk.this.j.e(kg.b($$2)).b();
            sw $$6 = $$0.a($$2, () -> blk.this.A, $$3, $$5.b());
            cuy $$7 = new cuy($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               blk.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (blk.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               tc $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  sw $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || blk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected doh b(String $$0, Path $$1, Path $$2) {
         return (doh)(blk.this.m ? new dok($$2, $$1.resolve("new_" + $$0), blk.this.p, true) : new doh($$2, blk.this.p, true));
      }
   }

   static record c<T>(aix<cvr> a, T b, ListIterator<blk.e> c) {
   }

   class d extends blk.g {
      d() {
         super(axo.s, "entities", blk.f, blk.g);
      }

      @Override
      protected sw a(dor $$0, sw $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(don a, List<cuy> b) {
   }

   class f extends blk.g {
      f() {
         super(axo.q, "poi", blk.d, blk.e);
      }

      @Override
      protected sw a(dor $$0, sw $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends blk.a<dor> {
      g(axo $$0, String $$1, we $$2, we $$3) {
         super($$0, $$1, $$2, $$3);
      }

      protected dor b(String $$0, Path $$1, Path $$2) {
         return (dor)(blk.this.m ? new dol($$2, $$1.resolve("new_" + $$0), blk.this.p, true, $$0, this.b) : new dor($$2, blk.this.p, true, $$0, this.b));
      }

      protected boolean a(dor $$0, cuy $$1, aix<cvr> $$2) {
         sw $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = doh.a($$3);
            sw $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || blk.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract sw a(dor var1, sw var2);
   }
}
