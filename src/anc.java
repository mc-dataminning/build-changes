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

public class anc extends dlp {
   private static final List<dlq> b = dlq.a();
   private final amw c;
   final ane d;
   final Thread e;
   final anh f;
   private final anc.b g;
   public final amo a;
   private final egp h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dlq[] n = new dlq[4];
   private final dll[] o = new dll[4];
   @Nullable
   @avu
   private cui.d p;

   public anc(ane $$0, egv.c $$1, DataFixer $$2, edp $$3, Executor $$4, dlm $$5, int $$6, int $$7, boolean $$8, ann $$9, dnf $$10, Supplier<egp> $$11) {
      this.d = $$0;
      this.g = new anc.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new egp($$12, $$2);
      this.a = new amo($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public anh a() {
      return this.f;
   }

   @Nullable
   private amm b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dll $$1, dlq $$2) {
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
   public dll a(int $$0, int $$1, dlq $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dll>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bgt $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = cte.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dll $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dll, amm.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dll $$9 = (dll)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public dlw a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = cte.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dlq.n) {
               dll $$4 = this.o[$$3];
               return $$4 instanceof dlw ? (dlw)$$4 : null;
            }
         }

         amm $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dll, amm.a> $$6 = $$5.b(dlq.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dll $$7 = (dll)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dlq.n);
                  if ($$7 instanceof dlw) {
                     return (dlw)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, cte.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dll, amm.a>> b(int $$0, int $$1, dlq $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dll, amm.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dll, amm.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dll, amm.a>> c(int $$0, int $$1, dlq $$2, boolean $$3) {
      cte $$4 = new cte($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = amn.a($$2);
      amm $$7 = this.b($$5);
      if ($$3) {
         this.c.a(anj.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bgt $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? amm.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable amm $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      amm $$2 = this.b(new cte($$0, $$1).a());
      int $$3 = amn.a(dlq.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dly c(int $$0, int $$1) {
      long $$2 = cte.c($$0, $$1);
      amm $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dlq $$5 = b.get($$4);
            Optional<dll> $$6 = $$3.a($$5).getNow(amm.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dlq.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public ctx c() {
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
      amm $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<dlw, amm.a> $$2 = $$1.a().getNow(null);
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
      this.d.af().a("purge");
      this.c.a();
      this.s();
      this.d.af().b("chunks");
      if ($$1) {
         this.t();
         this.a.l();
      }

      this.d.af().b("unload");
      this.a.a($$0);
      this.d.af().c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.X();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ah()) {
         bgt $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<anc.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (amm $$4 : this.a.k()) {
            dlw $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new anc.a($$5, $$4));
            }
         }

         if (this.d.o().aO().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            cui.d $$7 = cui.a($$6, this.d.A(), this::a, new cuh(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.Z().b(ctt.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.Z().c(ctt.o);
            boolean $$10 = this.d.B_().e() % 400L == 0L;

            for (anc.a $$11 : $$3) {
               dlw $$12 = $$11.a;
               cte $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.D_().a($$13)) {
                     cui.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dlw> $$1) {
      amm $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(amm.c).left().ifPresent($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.br();
   }

   public dlm g() {
      return this.a.a();
   }

   public dln h() {
      return this.a.b();
   }

   public dpm i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(hx $$0) {
      int $$1 = iz.a($$0.u());
      int $$2 = iz.a($$0.w());
      amm $$3 = this.b(cte.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(cug $$0, iz $$1) {
      this.g.execute(() -> {
         amm $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(anj<T> $$0, cte $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(anj<T> $$0, cte $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cte $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(anf $$0) {
      if (!$$0.dG()) {
         this.a.a($$0);
      }
   }

   public void a(blw $$0) {
      this.a.b($$0);
   }

   public void b(blw $$0) {
      this.a.a($$0);
   }

   public void a(blw $$0, xg<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(blw $$0, xg<?> $$1) {
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

   public String a(cte $$0) {
      return this.a.a($$0);
   }

   public egp k() {
      return this.h;
   }

   public bxq l() {
      return this.a.m();
   }

   public dml m() {
      return this.a.p();
   }

   @Nullable
   @avu
   public cui.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dlw a, amm b) {
   }

   final class b extends bis<Runnable> {
      b(ctx $$0) {
         super("Chunk source main thread executor for " + $$0.ae().a());
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
      protected boolean av() {
         return true;
      }

      @Override
      protected Thread aw() {
         return anc.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         anc.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (anc.this.s()) {
            return true;
         } else {
            anc.this.f.b();
            return super.x();
         }
      }
   }
}
