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

public class bnt {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final ww d = wi.c("optimizeWorld.stage.upgrading.poi");
   static final ww e = wi.c("optimizeWorld.stage.finished.poi");
   static final ww f = wi.c("optimizeWorld.stage.upgrading.entities");
   static final ww g = wi.c("optimizeWorld.stage.finished.entities");
   static final ww h = wi.c("optimizeWorld.stage.upgrading.chunks");
   static final ww i = wi.c("optimizeWorld.stage.finished.chunks");
   final ja<dtb> j;
   final Set<aju<czg>> k;
   final boolean l;
   final boolean m;
   final ena.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<aju<czg>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wi y = wi.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final emu A;

   public bnt(ena.c $$0, DataFixer $$1, jb $$2, boolean $$3, boolean $$4) {
      this.j = $$2.d(ku.aQ);
      this.k = this.j.f().stream().map(ku::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$3;
      this.p = $$1;
      this.n = $$0;
      this.A = new emu(this.n.a(czg.h).resolve("data").toFile(), $$1, $$2);
      this.m = $$4;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = wi.c("optimizeWorld.stage.failed");
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
      new bnt.d().a();
      a.info("Upgrading POIs");
      new bnt.f().a();
      a.info("Upgrading blocks");
      new bnt.b().a();
      this.A.a();
      $$0 = ac.b() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<aju<czg>> c() {
      return this.k;
   }

   public float a(aju<czg> $$0) {
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

   public wi h() {
      return this.y;
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final ww d;
      private final ww e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final ays b;

      a(ays $$0, String $$1, String $$2, ww $$3, ww $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bnt.this.u = 0;
         bnt.this.t = 0;
         bnt.this.v = 0;
         bnt.this.w = 0;
         List<bnt.c<T>> $$0 = this.b();
         if (bnt.this.t != 0) {
            float $$1 = (float)bnt.this.u;
            bnt.this.y = this.d;

            while (bnt.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bnt.c<T> $$4 : $$0) {
                  aju<czg> $$5 = $$4.a;
                  ListIterator<bnt.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bnt.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (cyn $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bnt.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bnt.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  bnt.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bnt.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bnt.this.y = this.e;

            for (bnt.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bnt.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bnt.c<T>> b() {
         List<bnt.c<T>> $$0 = Lists.newArrayList();

         for (aju<czg> $$1 : bnt.this.k) {
            dsu $$2 = new dsu(bnt.this.n.f(), $$1, this.f);
            Path $$3 = bnt.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bnt.e> $$5 = this.b($$2, $$3);
            $$0.add(new bnt.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(dsu var1, Path var2);

      private ListIterator<bnt.e> b(dsu $$0, Path $$1) {
         List<bnt.e> $$2 = c($$0, $$1);
         bnt.this.u = bnt.this.u + $$2.size();
         bnt.this.t = bnt.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bnt.e> c(dsu $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bnt.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bnt.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<cyn> $$8 = Lists.newArrayList();

                  try (dsr $$9 = new dsr($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           cyn $$12 = new cyn($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bnt.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bnt.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(aju<czg> $$0, T $$1, cyn $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | y var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bnt.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bnt.this.v++;
         } else {
            bnt.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, cyn var2, aju<czg> var3);

      private void a(dsr $$0) {
         if (bnt.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bnt.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bnt.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bnt.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bnt.a<dsl> {
      b() {
         super(ays.c, "chunk", "region", bnt.h, bnt.i);
      }

      protected boolean a(dsl $$0, cyn $$1, aju<czg> $$2) {
         to $$3 = $$0.e($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dsl.a($$3);
            drf $$5 = bnt.this.j.f(ku.b($$2)).b();
            to $$6 = $$0.a($$2, () -> bnt.this.A, $$3, $$5.b());
            cyn $$7 = new cyn($$6.h("xPos"), $$6.h("zPos"));
            if (!$$7.equals($$1)) {
               bnt.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < aa.b().d().c();
            if (bnt.this.l) {
               $$8 = $$8 || $$6.e("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.e("isLightOn");
               $$6.r("isLightOn");
               tu $$9 = $$6.c("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  to $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.e("BlockLight");
                  $$11.r("BlockLight");
                  $$8 = $$8 || $$11.e("SkyLight");
                  $$11.r("SkyLight");
               }
            }

            if ($$8 || bnt.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$6);
               return true;
            }
         }

         return false;
      }

      protected dsl b(dsu $$0, Path $$1) {
         return (dsl)(bnt.this.m ? new dso($$0.a("source"), $$1, $$0.a("target"), bnt.a($$1), bnt.this.p, true) : new dsl($$0, $$1, bnt.this.p, true));
      }
   }

   static record c<T>(aju<czg> a, T b, ListIterator<bnt.e> c) {
   }

   class d extends bnt.g {
      d() {
         super(ays.s, "entities", bnt.f, bnt.g);
      }

      @Override
      protected to a(dsw $$0, to $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(dsr a, List<cyn> b) {
   }

   class f extends bnt.g {
      f() {
         super(ays.q, "poi", bnt.d, bnt.e);
      }

      @Override
      protected to a(dsw $$0, to $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bnt.a<dsw> {
      g(ays $$0, String $$1, ww $$2, ww $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected dsw b(dsu $$0, Path $$1) {
         return (dsw)(bnt.this.m
            ? new dsp($$0.a("source"), $$1, $$0.a("target"), bnt.a($$1), bnt.this.p, true, this.b)
            : new dsw($$0, $$1, bnt.this.p, true, this.b));
      }

      protected boolean a(dsw $$0, cyn $$1, aju<czg> $$2) {
         to $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = dsl.a($$3);
            to $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < aa.b().d().c();
            if ($$6 || bnt.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract to a(dsw var1, to var2);
   }
}
