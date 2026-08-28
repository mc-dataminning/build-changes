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
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buq implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xg d = xg.c("optimizeWorld.stage.upgrading.poi");
   static final xg e = xg.c("optimizeWorld.stage.finished.poi");
   static final xg f = xg.c("optimizeWorld.stage.upgrading.entities");
   static final xg g = xg.c("optimizeWorld.stage.finished.entities");
   static final xg h = xg.c("optimizeWorld.stage.upgrading.chunks");
   static final xg i = xg.c("optimizeWorld.stage.finished.chunks");
   final jt<efo> j;
   final Set<alq<dkj>> k;
   final boolean l;
   final boolean m;
   final fah.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alq<dkj>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xg y = xg.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final fab A;

   public buq(fah.c $$0, DataFixer $$1, fan $$2, ju $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mi.bq);
      this.k = this.j.j().stream().map(mi::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      ezm.a $$6 = new ezm.a(null, $$2.y().c());
      this.A = new fab($$6, this.n.a(dkj.i).resolve("data"), $$1, $$3);
      this.m = $$5;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xg.c("optimizeWorld.stage.failed");
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
      new buq.d().a();
      a.info("Upgrading POIs");
      new buq.f().a();
      a.info("Upgrading blocks");
      new buq.b().a();
      this.A.b();
      $$0 = ag.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alq<dkj>> c() {
      return this.k;
   }

   public float a(alq<dkj> $$0) {
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

   public xg h() {
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
      private final xg d;
      private final xg e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbo b;

      a(final bbo $$0, final String $$1, final String $$2, final xg $$3, final xg $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         buq.this.u = 0;
         buq.this.t = 0;
         buq.this.v = 0;
         buq.this.w = 0;
         List<buq.c<T>> $$0 = this.b();
         if (buq.this.t != 0) {
            float $$1 = (float)buq.this.u;
            buq.this.y = this.d;

            while (buq.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (buq.c<T> $$4 : $$0) {
                  alq<dkj> $$5 = $$4.a;
                  ListIterator<buq.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     buq.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (djo $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (buq.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           buq.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  buq.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               buq.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            buq.this.y = this.e;

            for (buq.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  buq.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<buq.c<T>> b() {
         List<buq.c<T>> $$0 = Lists.newArrayList();

         for (alq<dkj> $$1 : buq.this.k) {
            efg $$2 = new efg(buq.this.n.f(), $$1, this.f);
            Path $$3 = buq.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<buq.e> $$5 = this.b($$2, $$3);
            $$0.add(new buq.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(efg var1, Path var2);

      private ListIterator<buq.e> b(efg $$0, Path $$1) {
         List<buq.e> $$2 = c($$0, $$1);
         buq.this.u = buq.this.u + $$2.size();
         buq.this.t = buq.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<buq.e> c(efg $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<buq.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = buq.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<djo> $$8 = Lists.newArrayList();

                  try (efd $$9 = new efd($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           djo $$12 = new djo($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new buq.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     buq.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alq<dkj> $$0, T $$1, djo $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | aa var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            buq.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            buq.this.v++;
         } else {
            buq.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, djo var2, alq<dkj> var3);

      private void a(efd $$0) {
         if (buq.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = buq.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  buq.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               buq.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends buq.a<eex> {
      b() {
         super(bbo.c, "chunk", "region", buq.h, buq.i);
      }

      protected boolean a(eex $$0, djo $$1, alq<dkj> $$2) {
         ua $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eex.a($$3);
            edo $$5 = buq.this.j.g(mi.b($$2)).b();
            ua $$6 = $$0.a($$2, () -> buq.this.A, $$3, $$5.c());
            djo $$7 = new djo($$6.b("xPos", 0), $$6.b("zPos", 0));
            if (!$$7.equals($$1)) {
               buq.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ac.b().d().c();
            if (buq.this.l) {
               $$8 = $$8 || $$6.b("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.b("isLightOn");
               $$6.r("isLightOn");
               ug $$9 = $$6.p("sections");

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  Optional<ua> $$11 = $$9.a($$10);
                  if (!$$11.isEmpty()) {
                     ua $$12 = $$11.get();
                     $$8 = $$8 || $$12.b("BlockLight");
                     $$12.r("BlockLight");
                     $$8 = $$8 || $$12.b("SkyLight");
                     $$12.r("SkyLight");
                  }
               }
            }

            if ($$8 || buq.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eex b(efg $$0, Path $$1) {
         return (eex)(buq.this.m ? new efa($$0.a("source"), $$1, $$0.a("target"), buq.a($$1), buq.this.p, true) : new eex($$0, $$1, buq.this.p, true));
      }
   }

   static record c<T>(alq<dkj> a, T b, ListIterator<buq.e> c) {
   }

   class d extends buq.g {
      d() {
         super(bbo.s, "entities", buq.f, buq.g);
      }

      @Override
      protected ua a(efj $$0, ua $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(efd a, List<djo> b) {
   }

   class f extends buq.g {
      f() {
         super(bbo.q, "poi", buq.d, buq.e);
      }

      @Override
      protected ua a(efj $$0, ua $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends buq.a<efj> {
      g(final bbo $$0, final String $$1, final xg $$2, final xg $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected efj b(efg $$0, Path $$1) {
         return (efj)(buq.this.m
            ? new efb($$0.a("source"), $$1, $$0.a("target"), buq.a($$1), buq.this.p, true, this.b)
            : new efj($$0, $$1, buq.this.p, true, this.b));
      }

      protected boolean a(efj $$0, djo $$1, alq<dkj> $$2) {
         ua $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eex.a($$3);
            ua $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ac.b().d().c();
            if ($$6 || buq.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ua a(efj var1, ua var2);
   }
}
