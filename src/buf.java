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

public class buf implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xa d = xa.c("optimizeWorld.stage.upgrading.poi");
   static final xa e = xa.c("optimizeWorld.stage.finished.poi");
   static final xa f = xa.c("optimizeWorld.stage.upgrading.entities");
   static final xa g = xa.c("optimizeWorld.stage.finished.entities");
   static final xa h = xa.c("optimizeWorld.stage.upgrading.chunks");
   static final xa i = xa.c("optimizeWorld.stage.finished.chunks");
   final js<efc> j;
   final Set<alh<djx>> k;
   final boolean l;
   final boolean m;
   final ezv.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<alh<djx>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xa y = xa.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final ezp A;

   public buf(ezv.c $$0, DataFixer $$1, fab $$2, jt $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mh.bq);
      this.k = this.j.j().stream().map(mh::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      eza.a $$6 = new eza.a(null, $$2.y().c());
      this.A = new ezp($$6, this.n.a(djx.i).resolve("data"), $$1, $$3);
      this.m = $$5;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xa.c("optimizeWorld.stage.failed");
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
      new buf.d().a();
      a.info("Upgrading POIs");
      new buf.f().a();
      a.info("Upgrading blocks");
      new buf.b().a();
      this.A.b();
      $$0 = ag.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<alh<djx>> c() {
      return this.k;
   }

   public float a(alh<djx> $$0) {
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

   public xa h() {
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
      private final xa d;
      private final xa e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bbd b;

      a(final bbd $$0, final String $$1, final String $$2, final xa $$3, final xa $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         buf.this.u = 0;
         buf.this.t = 0;
         buf.this.v = 0;
         buf.this.w = 0;
         List<buf.c<T>> $$0 = this.b();
         if (buf.this.t != 0) {
            float $$1 = (float)buf.this.u;
            buf.this.y = this.d;

            while (buf.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (buf.c<T> $$4 : $$0) {
                  alh<djx> $$5 = $$4.a;
                  ListIterator<buf.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     buf.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (djc $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (buf.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           buf.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = (float)$$6.nextIndex() / $$1;
                  buf.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               buf.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            buf.this.y = this.e;

            for (buf.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  buf.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<buf.c<T>> b() {
         List<buf.c<T>> $$0 = Lists.newArrayList();

         for (alh<djx> $$1 : buf.this.k) {
            eeu $$2 = new eeu(buf.this.n.f(), $$1, this.f);
            Path $$3 = buf.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<buf.e> $$5 = this.b($$2, $$3);
            $$0.add(new buf.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(eeu var1, Path var2);

      private ListIterator<buf.e> b(eeu $$0, Path $$1) {
         List<buf.e> $$2 = c($$0, $$1);
         buf.this.u = buf.this.u + $$2.size();
         buf.this.t = buf.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<buf.e> c(eeu $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<buf.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = buf.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<djc> $$8 = Lists.newArrayList();

                  try (eer $$9 = new eer($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           djc $$12 = new djc($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new buf.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     buf.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(alh<djx> $$0, T $$1, djc $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | aa var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            buf.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            buf.this.v++;
         } else {
            buf.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, djc var2, alh<djx> var3);

      private void a(eer $$0) {
         if (buf.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = buf.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  buf.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               buf.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends buf.a<eel> {
      b() {
         super(bbd.c, "chunk", "region", buf.h, buf.i);
      }

      protected boolean a(eel $$0, djc $$1, alh<djx> $$2) {
         tz $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eel.a($$3);
            edc $$5 = buf.this.j.g(mh.b($$2)).b();
            tz $$6 = $$0.a($$2, () -> buf.this.A, $$3, $$5.c());
            djc $$7 = new djc($$6.b("xPos", 0), $$6.b("zPos", 0));
            if (!$$7.equals($$1)) {
               buf.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ac.b().d().c();
            if (buf.this.l) {
               $$8 = $$8 || $$6.b("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.b("isLightOn");
               $$6.r("isLightOn");
               uf $$9 = $$6.p("sections");

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  Optional<tz> $$11 = $$9.a($$10);
                  if (!$$11.isEmpty()) {
                     tz $$12 = $$11.get();
                     $$8 = $$8 || $$12.b("BlockLight");
                     $$12.r("BlockLight");
                     $$8 = $$8 || $$12.b("SkyLight");
                     $$12.r("SkyLight");
                  }
               }
            }

            if ($$8 || buf.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected eel b(eeu $$0, Path $$1) {
         return (eel)(buf.this.m ? new eeo($$0.a("source"), $$1, $$0.a("target"), buf.a($$1), buf.this.p, true) : new eel($$0, $$1, buf.this.p, true));
      }
   }

   static record c<T>(alh<djx> a, T b, ListIterator<buf.e> c) {
   }

   class d extends buf.g {
      d() {
         super(bbd.s, "entities", buf.f, buf.g);
      }

      @Override
      protected tz a(eex $$0, tz $$1) {
         return $$0.a($$1, -1);
      }
   }

   static record e(eer a, List<djc> b) {
   }

   class f extends buf.g {
      f() {
         super(bbd.q, "poi", buf.d, buf.e);
      }

      @Override
      protected tz a(eex $$0, tz $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends buf.a<eex> {
      g(final bbd $$0, final String $$1, final xa $$2, final xa $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected eex b(eeu $$0, Path $$1) {
         return (eex)(buf.this.m
            ? new eep($$0.a("source"), $$1, $$0.a("target"), buf.a($$1), buf.this.p, true, this.b)
            : new eex($$0, $$1, buf.this.p, true, this.b));
      }

      protected boolean a(eex $$0, djc $$1, alh<djx> $$2) {
         tz $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = eel.a($$3);
            tz $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ac.b().d().c();
            if ($$6 || buf.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract tz a(eex var1, tz var2);
   }
}
