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

public class aoy extends doe {
   private static final List<dof> b = dof.a();
   private final aos c;
   final apa d;
   final Thread e;
   final apd f;
   private final aoy.b g;
   public final aok a;
   private final eji h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dof[] n = new dof[4];
   private final doa[] o = new doa[4];
   @Nullable
   @axp
   private cwp.d p;

   public aoy(apa $$0, ejo.c $$1, DataFixer $$2, egh $$3, Executor $$4, dob $$5, int $$6, int $$7, boolean $$8, apj $$9, dpx $$10, Supplier<eji> $$11) {
      this.d = $$0;
      this.g = new aoy.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ad()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eji($$12, $$2, $$0.I_());
      this.a = new aok($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public apd a() {
      return this.f;
   }

   @Nullable
   private aoi b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, doa $$1, dof $$2) {
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
   public doa a(int $$0, int $$1, dof $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<doa>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bjc $$4 = this.d.ae();
         $$4.d("getChunk");
         long $$5 = cvl.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               doa $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<doa, aoi.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         doa $$9 = (doa)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public dol a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ae().d("getChunkNow");
         long $$2 = cvl.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dof.n) {
               doa $$4 = this.o[$$3];
               return $$4 instanceof dol ? (dol)$$4 : null;
            }
         }

         aoi $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<doa, aoi.a> $$6 = $$5.b(dof.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               doa $$7 = (doa)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dof.n);
                  if ($$7 instanceof dol) {
                     return (dol)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, cvl.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<doa, aoi.a>> b(int $$0, int $$1, dof $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<doa, aoi.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<doa, aoi.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<doa, aoi.a>> c(int $$0, int $$1, dof $$2, boolean $$3) {
      cvl $$4 = new cvl($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aoj.a($$2);
      aoi $$7 = this.b($$5);
      if ($$3) {
         this.c.a(apf.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bjc $$8 = this.d.ae();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aoi.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aoi $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aoi $$2 = this.b(new cvl($$0, $$1).a());
      int $$3 = aoj.a(dof.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public don c(int $$0, int $$1) {
      long $$2 = cvl.c($$0, $$1);
      aoi $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dof $$5 = b.get($$4);
            Optional<doa> $$6 = $$3.a($$5).getNow(aoi.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dof.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public cwe c() {
      return this.d;
   }

   public boolean d() {
      return this.g.A();
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
      aoi $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<dol, aoi.a> $$2 = $$1.a().getNow(null);
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
         bjc $$2 = this.d.ae();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aoy.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (aoi $$4 : this.a.k()) {
            dol $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aoy.a($$5, $$4));
            }
         }

         if (this.d.o().aR().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            cwp.d $$7 = cwp.a($$6, this.d.A(), this::a, new cwo(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.Z().b(cwa.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.Z().c(cwa.o);
            boolean $$10 = this.d.B_().c() % 400L == 0L;

            for (aoy.a $$11 : $$3) {
               dol $$12 = $$11.a;
               cvl $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.D_().a($$13)) {
                     cwp.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dol> $$1) {
      aoi $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aoi.c).left().ifPresent($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bw();
   }

   public dob g() {
      return this.a.a();
   }

   public doc h() {
      return this.a.b();
   }

   public dse i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ib $$0) {
      int $$1 = jd.a($$0.u());
      int $$2 = jd.a($$0.w());
      aoi $$3 = this.b(cvl.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(cwn $$0, jd $$1) {
      this.g.execute(() -> {
         aoi $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(apf<T> $$0, cvl $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(apf<T> $$0, cvl $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvl $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(apb $$0) {
      if (!$$0.dE()) {
         this.a.a($$0);
      }
   }

   public void a(bof $$0) {
      this.a.b($$0);
   }

   public void b(bof $$0) {
      this.a.a($$0);
   }

   public void a(bof $$0, xz<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bof $$0, xz<?> $$1) {
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

   public String a(cvl $$0) {
      return this.a.a($$0);
   }

   public eji k() {
      return this.h;
   }

   public caa l() {
      return this.a.m();
   }

   public dpa m() {
      return this.a.p();
   }

   @Nullable
   @axp
   public cwp.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dol a, aoi b) {
   }

   final class b extends blb<Runnable> {
      b(cwe $$0) {
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
      protected boolean ay() {
         return true;
      }

      @Override
      protected Thread az() {
         return aoy.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aoy.this.d.ae().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (aoy.this.s()) {
            return true;
         } else {
            aoy.this.f.b();
            return super.A();
         }
      }
   }
}
