import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class aly extends diw {
   private static final List<dix> b = dix.a();
   private final als c;
   final ama d;
   final Thread e;
   final amd f;
   private final aly.b g;
   public final alk a;
   private final edw h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dix[] n = new dix[4];
   private final dis[] o = new dis[4];
   @Nullable
   @auk
   private csd.d p;

   public aly(ama $$0, eeb.c $$1, DataFixer $$2, eaw $$3, Executor $$4, dit $$5, int $$6, int $$7, boolean $$8, amj $$9, dkm $$10, Supplier<edw> $$11) {
      this.d = $$0;
      this.g = new aly.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ac()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new edw($$12, $$2);
      this.a = new alk($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public amd a() {
      return this.f;
   }

   @Nullable
   private ali b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dis $$1, dix $$2) {
      for (int $$3 = 3; $$3 > 0; $$3--) {
         this.m[$$3] = this.m[$$3 - 1];
         this.n[$$3] = this.n[$$3 - 1];
         this.o[$$3] = this.o[$$3 - 1];
      }

      this.m[0] = $$0;
      this.n[0] = $$2;
      this.o[0] = $$1;
   }

   @Nullable
   @Override
   public dis a(int $$0, int $$1, dix $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dis>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bfh $$4 = this.d.ad();
         $$4.d("getChunk");
         long $$5 = cqz.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dis $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dis, ali.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dis $$9 = (dis)$$8.join().map($$0x -> $$0x, $$1x -> {
            if ($$3) {
               throw (IllegalStateException)ac.b(new IllegalStateException("Chunk not there when requested: " + $$1x));
            } else {
               return null;
            }
         });
         this.a($$5, $$9, $$2);
         return $$9;
      }
   }

   @Nullable
   @Override
   public djd a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ad().d("getChunkNow");
         long $$2 = cqz.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dix.n) {
               dis $$4 = this.o[$$3];
               return $$4 instanceof djd ? (djd)$$4 : null;
            }
         }

         ali $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dis, ali.a> $$6 = $$5.b(dix.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dis $$7 = (dis)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dix.n);
                  if ($$7 instanceof djd) {
                     return (djd)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, cqz.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dis, ali.a>> b(int $$0, int $$1, dix $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dis, ali.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dis, ali.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dis, ali.a>> c(int $$0, int $$1, dix $$2, boolean $$3) {
      cqz $$4 = new cqz($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = alj.a($$2);
      ali $$7 = this.b($$5);
      if ($$3) {
         this.c.a(amf.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bfh $$8 = this.d.ad();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ali.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable ali $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      ali $$2 = this.b(new cqz($$0, $$1).a());
      int $$3 = alj.a(dix.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public djf c(int $$0, int $$1) {
      long $$2 = cqz.c($$0, $$1);
      ali $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dix $$5 = b.get($$4);
            Optional<dis> $$6 = $$3.a($$5).getNow(ali.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dix.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public crs c() {
      return this.d;
   }

   public boolean d() {
      return this.g.x();
   }

   boolean s() {
      boolean $$0 = this.c.a(this.a);
      boolean $$1 = this.a.g();
      if (!$$0 && !$$1) {
         return false;
      } else {
         this.r();
         return true;
      }
   }

   public boolean a(long $$0) {
      ali $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<djd, ali.a> $$2 = $$1.a().getNow(null);
         return $$2 != null && $$2.left().isPresent();
      }
   }

   public void a(boolean $$0) {
      this.s();
      this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a(true);
      this.f.close();
      this.a.close();
   }

   @Override
   public void a(BooleanSupplier $$0, boolean $$1) {
      this.d.ad().a("purge");
      this.c.a();
      this.s();
      this.d.ad().b("chunks");
      if ($$1) {
         this.t();
      }

      this.d.ad().b("unload");
      this.a.a($$0);
      this.d.ad().c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.V();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      boolean $$2 = this.d.af();
      if ($$2) {
         this.a.l();
      } else {
         edx $$3 = this.d.A_();
         bfh $$4 = this.d.ad();
         $$4.a("pollingChunks");
         int $$5 = this.d.X().c(cro.o);
         boolean $$6 = $$3.e() % 400L == 0L;
         $$4.a("naturalSpawnCount");
         int $$7 = this.c.b();
         csd.d $$8 = csd.a($$7, this.d.y(), this::a, new csc(this.a));
         this.p = $$8;
         $$4.b("filteringLoadedChunks");
         List<aly.a> $$9 = Lists.newArrayListWithCapacity($$7);

         for (ali $$10 : this.a.k()) {
            djd $$11 = $$10.d();
            if ($$11 != null) {
               $$9.add(new aly.a($$11, $$10));
            }
         }

         $$4.b("spawnAndTick");
         boolean $$12 = this.d.X().b(cro.e);
         Collections.shuffle($$9);

         for (aly.a $$13 : $$9) {
            djd $$14 = $$13.a;
            cqz $$15 = $$14.f();
            if (this.d.a($$15) && this.a.c($$15)) {
               $$14.a($$1);
               if ($$12 && (this.j || this.k) && this.d.C_().a($$15)) {
                  csd.a(this.d, $$14, $$8, this.k, this.j, $$6);
               }

               if (this.d.a($$15.a())) {
                  this.d.a($$14, $$5);
               }
            }
         }

         $$4.b("customSpawners");
         if ($$12) {
            this.d.a(this.j, this.k);
         }

         $$4.b("broadcast");
         $$9.forEach($$0x -> $$0x.b.a($$0x.a));
         $$4.c();
         $$4.c();
         this.a.l();
      }
   }

   private void a(long $$0, Consumer<djd> $$1) {
      ali $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(ali.c).left().ifPresent($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bm();
   }

   public dit g() {
      return this.a.a();
   }

   public diu h() {
      return this.a.b();
   }

   public dmt i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ht $$0) {
      int $$1 = iu.a($$0.u());
      int $$2 = iu.a($$0.w());
      ali $$3 = this.b(cqz.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(csb $$0, iu $$1) {
      this.g.execute(() -> {
         ali $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(amf<T> $$0, cqz $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(amf<T> $$0, cqz $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqz $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(amb $$0) {
      if (!$$0.dG()) {
         this.a.a($$0);
      }
   }

   public void a(bki $$0) {
      this.a.b($$0);
   }

   public void b(bki $$0) {
      this.a.a($$0);
   }

   public void a(bki $$0, wk<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bki $$0, wk<?> $$1) {
      this.a.a($$0, $$1);
   }

   public void a(int $$0) {
      this.a.a($$0);
   }

   public void b(int $$0) {
      this.c.b($$0);
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public String a(cqz $$0) {
      return this.a.a($$0);
   }

   public edw k() {
      return this.h;
   }

   public bvx l() {
      return this.a.m();
   }

   public djs m() {
      return this.a.p();
   }

   @Nullable
   @auk
   public csd.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(djd a, ali b) {
   }

   final class b extends bhg<Runnable> {
      b(crs $$0) {
         super("Chunk source main thread executor for " + $$0.ac().a());
      }

      @Override
      protected Runnable f(Runnable $$0) {
         return $$0;
      }

      @Override
      protected boolean e(Runnable $$0) {
         return true;
      }

      @Override
      protected boolean at() {
         return true;
      }

      @Override
      protected Thread au() {
         return aly.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aly.this.d.ad().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (aly.this.s()) {
            return true;
         } else {
            aly.this.f.b();
            return super.x();
         }
      }
   }
}
