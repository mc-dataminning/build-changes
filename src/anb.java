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

public class anb extends dlg {
   private static final List<dlh> b = dlh.a();
   private final amv c;
   final and d;
   final Thread e;
   final ang f;
   private final anb.b g;
   public final amn a;
   private final egg h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dlh[] n = new dlh[4];
   private final dlc[] o = new dlc[4];
   @Nullable
   @avs
   private ctz.d p;

   public anb(and $$0, egl.c $$1, DataFixer $$2, edg $$3, Executor $$4, dld $$5, int $$6, int $$7, boolean $$8, anm $$9, dmw $$10, Supplier<egg> $$11) {
      this.d = $$0;
      this.g = new anb.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new egg($$12, $$2);
      this.a = new amn($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public ang a() {
      return this.f;
   }

   @Nullable
   private aml b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dlc $$1, dlh $$2) {
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
   public dlc a(int $$0, int $$1, dlh $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dlc>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bgr $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = csv.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dlc $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dlc, aml.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dlc $$9 = (dlc)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public dln a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = csv.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dlh.n) {
               dlc $$4 = this.o[$$3];
               return $$4 instanceof dln ? (dln)$$4 : null;
            }
         }

         aml $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dlc, aml.a> $$6 = $$5.b(dlh.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dlc $$7 = (dlc)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dlh.n);
                  if ($$7 instanceof dln) {
                     return (dln)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, csv.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dlc, aml.a>> b(int $$0, int $$1, dlh $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dlc, aml.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dlc, aml.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dlc, aml.a>> c(int $$0, int $$1, dlh $$2, boolean $$3) {
      csv $$4 = new csv($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = amm.a($$2);
      aml $$7 = this.b($$5);
      if ($$3) {
         this.c.a(ani.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bgr $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aml.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aml $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aml $$2 = this.b(new csv($$0, $$1).a());
      int $$3 = amm.a(dlh.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dlp c(int $$0, int $$1) {
      long $$2 = csv.c($$0, $$1);
      aml $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dlh $$5 = b.get($$4);
            Optional<dlc> $$6 = $$3.a($$5).getNow(aml.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dlh.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public cto c() {
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
      aml $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<dln, aml.a> $$2 = $$1.a().getNow(null);
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
         bgr $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<anb.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (aml $$4 : this.a.k()) {
            dln $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new anb.a($$5, $$4));
            }
         }

         if (this.d.o().aO().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            ctz.d $$7 = ctz.a($$6, this.d.A(), this::a, new cty(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.Z().b(ctk.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.Z().c(ctk.o);
            boolean $$10 = this.d.B_().e() % 400L == 0L;

            for (anb.a $$11 : $$3) {
               dln $$12 = $$11.a;
               csv $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.D_().a($$13)) {
                     ctz.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dln> $$1) {
      aml $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aml.c).left().ifPresent($$1);
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

   public dld g() {
      return this.a.a();
   }

   public dle h() {
      return this.a.b();
   }

   public dpd i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(hx $$0) {
      int $$1 = iz.a($$0.u());
      int $$2 = iz.a($$0.w());
      aml $$3 = this.b(csv.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(ctx $$0, iz $$1) {
      this.g.execute(() -> {
         aml $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(ani<T> $$0, csv $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(ani<T> $$0, csv $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csv $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(ane $$0) {
      if (!$$0.dH()) {
         this.a.a($$0);
      }
   }

   public void a(blu $$0) {
      this.a.b($$0);
   }

   public void b(blu $$0) {
      this.a.a($$0);
   }

   public void a(blu $$0, xf<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(blu $$0, xf<?> $$1) {
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

   public String a(csv $$0) {
      return this.a.a($$0);
   }

   public egg k() {
      return this.h;
   }

   public bxl l() {
      return this.a.m();
   }

   public dmc m() {
      return this.a.p();
   }

   @Nullable
   @avs
   public ctz.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dln a, aml b) {
   }

   final class b extends biq<Runnable> {
      b(cto $$0) {
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
         return anb.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         anb.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (anb.this.s()) {
            return true;
         } else {
            anb.this.f.b();
            return super.x();
         }
      }
   }
}
