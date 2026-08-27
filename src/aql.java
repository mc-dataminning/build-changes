import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class aql extends dtd {
   private static final List<dty> b = dty.a();
   private final aqf c;
   final aqn d;
   final Thread e;
   final aqq f;
   private final aql.b g;
   public final apw a;
   private final eor h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dty[] n = new dty[4];
   private final dsz[] o = new dsz[4];
   @Nullable
   @azi
   private dbk.d p;

   public aql(aqn $$0, eox.c $$1, DataFixer $$2, elm $$3, Executor $$4, dta $$5, int $$6, int $$7, boolean $$8, aqw $$9, dvc $$10, Supplier<eor> $$11) {
      this.d = $$0;
      this.g = new aql.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eor($$12, $$2, $$0.H_());
      this.a = new apw($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqq a() {
      return this.f;
   }

   @Nullable
   private apu b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dsz $$1, dty $$2) {
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
   public dsz a(int $$0, int $$1, dty $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dsz>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bmk $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = dag.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dsz $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<apx<dsz>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         apx<dsz> $$9 = $$8.join();
         dsz $$10 = $$9.b(null);
         if ($$10 == null && $$3) {
            throw (IllegalStateException)ac.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
         } else {
            this.a($$5, $$10, $$2);
            return $$10;
         }
      }
   }

   @Nullable
   @Override
   public dtj a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = dag.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dty.n) {
               dsz $$4 = this.o[$$3];
               return $$4 instanceof dtj ? (dtj)$$4 : null;
            }
         }

         apu $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            apx<dsz> $$6 = $$5.b(dty.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dsz $$7 = $$6.b(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dty.n);
                  if ($$7 instanceof dtj) {
                     return (dtj)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dag.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<apx<dsz>> b(int $$0, int $$1, dty $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<apx<dsz>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<apx<dsz>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<apx<dsz>> c(int $$0, int $$1, dty $$2, boolean $$3) {
      dag $$4 = new dag($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = apv.a($$2);
      apu $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqs.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bmk $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? apu.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apu $$0, int $$1) {
      return $$0 == null || $$0.l() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apu $$2 = this.b(new dag($$0, $$1).a());
      int $$3 = apv.a(dty.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dtl c(int $$0, int $$1) {
      long $$2 = dag.c($$0, $$1);
      apu $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dty $$5 = b.get($$4);
            dsz $$6 = $$3.a($$5).getNow(apu.a).b(null);
            if ($$6 != null) {
               return $$6;
            }

            if ($$5 == dty.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public daz c() {
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
      apu $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apu.c).a();
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
      if (this.d.s().i() || !$$1) {
         this.c.a();
      }

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
      long $$0 = this.d.Y();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ah()) {
         bmk $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aql.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apu $$4 : this.a.k()) {
            dtj $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aql.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            dbk.d $$7 = dbk.a($$6, this.d.A(), this::a, new dbj(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.aa().b(dav.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.aa().c(dav.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aql.a $$11 : $$3) {
               dtj $$12 = $$11.a;
               dag $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     dbk.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dtj> $$1) {
      apu $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apu.c).a($$1);
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

   public dta g() {
      return this.a.a();
   }

   public dtb h() {
      return this.a.b();
   }

   public dxj i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(io $$0) {
      int $$1 = jq.a($$0.u());
      int $$2 = jq.a($$0.w());
      apu $$3 = this.b(dag.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dbi $$0, jq $$1) {
      this.g.execute(() -> {
         apu $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqs<T> $$0, dag $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqs<T> $$0, dag $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dag $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqo $$0) {
      if (!$$0.dK()) {
         this.a.a($$0);
      }
   }

   public void a(brw $$0) {
      this.a.b($$0);
   }

   public void b(brw $$0) {
      this.a.a($$0);
   }

   public void a(brw $$0, ze<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(brw $$0, ze<?> $$1) {
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

   public String a(dag $$0) {
      return this.a.a($$0);
   }

   public eor k() {
      return this.h;
   }

   public cdu l() {
      return this.a.m();
   }

   public due m() {
      return this.a.p();
   }

   @Nullable
   @azi
   public dbk.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dtj a, apu b) {
   }

   final class b extends bom<Runnable> {
      b(daz $$0) {
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
      protected boolean ay() {
         return true;
      }

      @Override
      protected Thread az() {
         return aql.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aql.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (aql.this.s()) {
            return true;
         } else {
            aql.this.f.b();
            return super.A();
         }
      }
   }
}
