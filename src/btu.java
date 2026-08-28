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

public class btu implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final wy d = wy.c("optimizeWorld.stage.upgrading.poi");
   static final wy e = wy.c("optimizeWorld.stage.finished.poi");
   static final wy f = wy.c("optimizeWorld.stage.upgrading.entities");
   static final wy g = wy.c("optimizeWorld.stage.finished.entities");
   static final wy h = wy.c("optimizeWorld.stage.upgrading.chunks");
   static final wy i = wy.c("optimizeWorld.stage.finished.chunks");
   final js<eer> j;
   final Set<alf<djm>> k;
   final boolean l;
   final boolean m;
   final ezh.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alf<djm>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile wy y = wy.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final ezb A;

   public btu(ezh.c $$0, DataFixer $$1, ezn $$2, jt $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mh.bq);
      this.k = this.j.j().stream().map(mh::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      eym.a $$6 = new eym.a(null, $$2.y().c());
      this.A = new ezb($$6, this.n.a(djm.i).resolve("data"), $$1, $$3);
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
      long $$0 = ag.c();
      a.info("Upgrading entities");
      new btu.d().a();
      a.info("Upgrading POIs");
      new btu.f().a();
      a.info("Upgrading blocks");
      new btu.b().a();
      this.A.b();
      $$0 = ag.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alf<djm>> c() {
      return this.k;
   }

   public float a(alf<djm> $$0) {
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
         btu.this.u = 0;
         btu.this.t = 0;
         btu.this.v = 0;
         btu.this.w = 0;
         List<btu.c<T>> $$0 = this.b();
         if (btu.this.t != 0) {
            float $$1 = (float)btu.this.u;
            btu.this.y = this.d;

            while (btu.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (btu.c<T> $$4 : $$0) {
                  alf<djm> $$5 = $$4.a;
                  ListIterator<btu.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     btu.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dir $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (btu.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           btu.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  btu.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               btu.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            btu.this.y = this.e;

            for (btu.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  btu.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<btu.c<T>> b() {
         List<btu.c<T>> $$0 = Lists.newArrayList();

         for (alf<djm> $$1 : btu.this.k) {
            eej $$2 = new eej(btu.this.n.f(), $$1, this.f);
            Path $$3 = btu.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<btu.e> $$5 = this.b($$2, $$3);
            $$0.add(new btu.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eej var1, Path var2);

      private ListIterator<btu.e> b(eej $$0, Path $$1) {
         List<btu.e> $$2 = c($$0, $$1);
         btu.this.u = btu.this.u + $$2.size();
         btu.this.t = btu.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<btu.e> c(eej $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<btu.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = btu.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dir> $$8 = Lists.newArrayList();

                  try (eeg $$9 = new eeg($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dir $$12 = new dir($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new btu.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     btu.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alf<djm> $$0, T $$1, dir $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | aa var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            btu.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            btu.this.v++;
         } else {
            btu.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dir var2, alf<djm> var3);

      private void a(eeg $$0) {
         if (btu.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = btu.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  btu.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               btu.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends btu.a<eea> {
      b() {
         super(bbb.c, "chunk", "region", btu.h, btu.i);
      }

      protected boolean a(eea $$0, dir $$1, alf<djm> $$2) {
         tz $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eea.a($$3);
            ecr $$5 = btu.this.j.g(mh.b($$2)).b();
            tz $$6 = $$0.a($$2, () -> btu.this.A, $$3, $$5.c());
            dir $$7 = new dir($$6.f("xPos"), $$6.f("zPos"));
            if (!$$7.equals($$1)) {
               btu.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ac.b().d().c();
            if (btu.this.l) {
               $$8 = $$8 || $$6.c("Heightmaps");
               $$6.p("Heightmaps");
               $$8 = $$8 || $$6.c("isLightOn");
               $$6.p("isLightOn");
               uf $$9 = $$6.d("sections", 10);

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  tz $$11 = $$9.a($$10);
                  $$8 = $$8 || $$11.c("BlockLight");
                  $$11.p("BlockLight");
                  $$8 = $$8 || $$11.c("SkyLight");
                  $$11.p("SkyLight");
               }
            }

            if ($$8 || btu.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eea b(eej $$0, Path $$1) {
         return (eea)(btu.this.m ? new eed($$0.a("source"), $$1, $$0.a("target"), btu.a($$1), btu.this.p, true) : new eea($$0, $$1, btu.this.p, true));
      }
   }

   static record c<T>(alf<djm> a, T b, ListIterator<btu.e> c) {
   }

   class d extends btu.g {
      d() {
         super(bbb.s, "entities", btu.f, btu.g);
      }

      @Override
      protected tz a(eem $$0, tz $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eeg a, List<dir> b) {
   }

   class f extends btu.g {
      f() {
         super(bbb.q, "poi", btu.d, btu.e);
      }

      @Override
      protected tz a(eem $$0, tz $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends btu.a<eem> {
      g(final bbb $$0, final String $$1, final wy $$2, final wy $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eem b(eej $$0, Path $$1) {
         return (eem)(btu.this.m
            ? new eee($$0.a("source"), $$1, $$0.a("target"), btu.a($$1), btu.this.p, true, this.b)
            : new eem($$0, $$1, btu.this.p, true, this.b));
      }

      protected boolean a(eem $$0, dir $$1, alf<djm> $$2) {
         tz $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eea.a($$3);
            tz $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ac.b().d().c();
            if ($$6 || btu.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tz a(eem var1, tz var2);
   }
}
