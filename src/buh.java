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

public class buh implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xc d = xc.c("optimizeWorld.stage.upgrading.poi");
   static final xc e = xc.c("optimizeWorld.stage.finished.poi");
   static final xc f = xc.c("optimizeWorld.stage.upgrading.entities");
   static final xc g = xc.c("optimizeWorld.stage.finished.entities");
   static final xc h = xc.c("optimizeWorld.stage.upgrading.chunks");
   static final xc i = xc.c("optimizeWorld.stage.finished.chunks");
   final jt<efe> j;
   final Set<alj<djz>> k;
   final boolean l;
   final boolean m;
   final ezx.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alj<djz>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xc y = xc.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final ezr A;

   public buh(ezx.c $$0, DataFixer $$1, fad $$2, ju $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mi.bq);
      this.k = this.j.j().stream().map(mi::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      ezc.a $$6 = new ezc.a(null, $$2.y().c());
      this.A = new ezr($$6, this.n.a(djz.i).resolve("data"), $$1, $$3);
      this.m = $$5;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xc.c("optimizeWorld.stage.failed");
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
      new buh.d().a();
      a.info("Upgrading POIs");
      new buh.f().a();
      a.info("Upgrading blocks");
      new buh.b().a();
      this.A.b();
      $$0 = ag.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alj<djz>> c() {
      return this.k;
   }

   public float a(alj<djz> $$0) {
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

   public xc h() {
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
      private final xc d;
      private final xc e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbf b;

      a(final bbf $$0, final String $$1, final String $$2, final xc $$3, final xc $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         buh.this.u = 0;
         buh.this.t = 0;
         buh.this.v = 0;
         buh.this.w = 0;
         List<buh.c<T>> $$0 = this.b();
         if (buh.this.t != 0) {
            float $$1 = (float)buh.this.u;
            buh.this.y = this.d;

            while (buh.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (buh.c<T> $$4 : $$0) {
                  alj<djz> $$5 = $$4.a;
                  ListIterator<buh.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     buh.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dje $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (buh.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           buh.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  buh.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               buh.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            buh.this.y = this.e;

            for (buh.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  buh.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<buh.c<T>> b() {
         List<buh.c<T>> $$0 = Lists.newArrayList();

         for (alj<djz> $$1 : buh.this.k) {
            eew $$2 = new eew(buh.this.n.f(), $$1, this.f);
            Path $$3 = buh.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<buh.e> $$5 = this.b($$2, $$3);
            $$0.add(new buh.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eew var1, Path var2);

      private ListIterator<buh.e> b(eew $$0, Path $$1) {
         List<buh.e> $$2 = c($$0, $$1);
         buh.this.u = buh.this.u + $$2.size();
         buh.this.t = buh.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<buh.e> c(eew $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<buh.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = buh.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dje> $$8 = Lists.newArrayList();

                  try (eet $$9 = new eet($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dje $$12 = new dje($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new buh.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     buh.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alj<djz> $$0, T $$1, dje $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | aa var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            buh.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            buh.this.v++;
         } else {
            buh.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dje var2, alj<djz> var3);

      private void a(eet $$0) {
         if (buh.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = buh.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  buh.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               buh.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends buh.a<een> {
      b() {
         super(bbf.c, "chunk", "region", buh.h, buh.i);
      }

      protected boolean a(een $$0, dje $$1, alj<djz> $$2) {
         ua $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = een.a($$3);
            ede $$5 = buh.this.j.g(mi.b($$2)).b();
            ua $$6 = $$0.a($$2, () -> buh.this.A, $$3, $$5.c());
            dje $$7 = new dje($$6.b("xPos", 0), $$6.b("zPos", 0));
            if (!$$7.equals($$1)) {
               buh.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ac.b().d().c();
            if (buh.this.l) {
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

            if ($$8 || buh.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected een b(eew $$0, Path $$1) {
         return (een)(buh.this.m ? new eeq($$0.a("source"), $$1, $$0.a("target"), buh.a($$1), buh.this.p, true) : new een($$0, $$1, buh.this.p, true));
      }
   }

   static record c<T>(alj<djz> a, T b, ListIterator<buh.e> c) {
   }

   class d extends buh.g {
      d() {
         super(bbf.s, "entities", buh.f, buh.g);
      }

      @Override
      protected ua a(eez $$0, ua $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eet a, List<dje> b) {
   }

   class f extends buh.g {
      f() {
         super(bbf.q, "poi", buh.d, buh.e);
      }

      @Override
      protected ua a(eez $$0, ua $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends buh.a<eez> {
      g(final bbf $$0, final String $$1, final xc $$2, final xc $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eez b(eew $$0, Path $$1) {
         return (eez)(buh.this.m
            ? new eer($$0.a("source"), $$1, $$0.a("target"), buh.a($$1), buh.this.p, true, this.b)
            : new eez($$0, $$1, buh.this.p, true, this.b));
      }

      protected boolean a(eez $$0, dje $$1, alj<djz> $$2) {
         ua $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = een.a($$3);
            ua $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ac.b().d().c();
            if ($$6 || buh.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ua a(eez var1, ua var2);
   }
}
