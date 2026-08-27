import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Either;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class aou extends dnj {
   private static final List<dnk> b = dnk.a();
   private final aoo c;
   final aow d;
   final Thread e;
   final aoz f;
   private final aou.b g;
   public final aog a;
   private final eim h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dnk[] n = new dnk[4];
   private final dnf[] o = new dnf[4];
   @Nullable
   @axl
   private cwc.d p;

   public aou(aow $$0, eis.c $$1, DataFixer $$2, efm $$3, Executor $$4, dng $$5, int $$6, int $$7, boolean $$8, apf $$9, dpc $$10, Supplier<eim> $$11) {
      this.d = $$0;
      this.g = new aou.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ad()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eim($$12, $$2);
      this.a = new aog($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aoz a() {
      return this.f;
   }

   @Nullable
   private aoe b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dnf $$1, dnk $$2) {
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
   public dnf a(int $$0, int $$1, dnk $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dnf>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bin $$4 = this.d.ae();
         $$4.d("getChunk");
         long $$5 = cuy.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dnf $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dnf, aoe.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dnf $$9 = (dnf)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public dnq a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ae().d("getChunkNow");
         long $$2 = cuy.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dnk.n) {
               dnf $$4 = this.o[$$3];
               return $$4 instanceof dnq ? (dnq)$$4 : null;
            }
         }

         aoe $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dnf, aoe.a> $$6 = $$5.b(dnk.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dnf $$7 = (dnf)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dnk.n);
                  if ($$7 instanceof dnq) {
                     return (dnq)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, cuy.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dnf, aoe.a>> b(int $$0, int $$1, dnk $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dnf, aoe.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dnf, aoe.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dnf, aoe.a>> c(int $$0, int $$1, dnk $$2, boolean $$3) {
      cuy $$4 = new cuy($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aof.a($$2);
      aoe $$7 = this.b($$5);
      if ($$3) {
         this.c.a(apb.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bin $$8 = this.d.ae();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aoe.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aoe $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aoe $$2 = this.b(new cuy($$0, $$1).a());
      int $$3 = aof.a(dnk.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dns c(int $$0, int $$1) {
      long $$2 = cuy.c($$0, $$1);
      aoe $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dnk $$5 = b.get($$4);
            Optional<dnf> $$6 = $$3.a($$5).getNow(aoe.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dnk.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public cvr c() {
      return this.d;
   }

   public boolean d() {
      return this.g.y();
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
      aoe $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<dnq, aoe.a> $$2 = $$1.a().getNow(null);
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
      this.d.ae().a("purge");
      this.c.a();
      this.s();
      this.d.ae().b("chunks");
      if ($$1) {
         this.t();
         this.a.l();
      }

      this.d.ae().b("unload");
      this.a.a($$0);
      this.d.ae().c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.X();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ag()) {
         bin $$2 = this.d.ae();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aou.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (aoe $$4 : this.a.k()) {
            dnq $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aou.a($$5, $$4));
            }
         }

         if (this.d.o().aQ().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            cwc.d $$7 = cwc.a($$6, this.d.A(), this::a, new cwb(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.Z().b(cvn.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.Z().c(cvn.o);
            boolean $$10 = this.d.B_().c() % 400L == 0L;

            for (aou.a $$11 : $$3) {
               dnq $$12 = $$11.a;
               cuy $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.D_().a($$13)) {
                     cwc.a(this.d, $$12, $$7, this.k, this.j, $$10);
                  }

                  if (this.d.a($$13.a())) {
                     this.d.a($$12, $$9);
                  }
               }
            }

            $$2.b("customSpawners");
            if ($$8) {
               this.d.a(this.j, this.k);
            }
         }

         $$2.b("broadcast");
         $$3.forEach($$0x -> $$0x.b.a($$0x.a));
         $$2.c();
         $$2.c();
      }
   }

   private void a(long $$0, Consumer<dnq> $$1) {
      aoe $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aoe.c).left().ifPresent($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bu();
   }

   public dng g() {
      return this.a.a();
   }

   public dnh h() {
      return this.a.b();
   }

   public drj i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(hz $$0) {
      int $$1 = jb.a($$0.u());
      int $$2 = jb.a($$0.w());
      aoe $$3 = this.b(cuy.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(cwa $$0, jb $$1) {
      this.g.execute(() -> {
         aoe $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(apb<T> $$0, cuy $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cuy $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aox $$0) {
      if (!$$0.dH()) {
         this.a.a($$0);
      }
   }

   public void a(bnq $$0) {
      this.a.b($$0);
   }

   public void b(bnq $$0) {
      this.a.a($$0);
   }

   public void a(bnq $$0, xx<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bnq $$0, xx<?> $$1) {
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

   public String a(cuy $$0) {
      return this.a.a($$0);
   }

   public eim k() {
      return this.h;
   }

   public bzl l() {
      return this.a.m();
   }

   public dof m() {
      return this.a.p();
   }

   @Nullable
   @axl
   public cwc.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dnq a, aoe b) {
   }

   final class b extends bkm<Runnable> {
      b(cvr $$0) {
         super("Chunk source main thread executor for " + $$0.ad().a());
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
      protected boolean ax() {
         return true;
      }

      @Override
      protected Thread ay() {
         return aou.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aou.this.d.ae().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean y() {
         if (aou.this.s()) {
            return true;
         } else {
            aou.this.f.b();
            return super.y();
         }
      }
   }
}
