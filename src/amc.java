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

public class amc extends dji {
   private static final List<djj> b = djj.a();
   private final alw c;
   final ame d;
   final Thread e;
   final amh f;
   private final amc.b g;
   public final alo a;
   private final eei h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final djj[] n = new djj[4];
   private final dje[] o = new dje[4];
   @Nullable
   @aup
   private csl.d p;

   public amc(ame $$0, een.c $$1, DataFixer $$2, ebi $$3, Executor $$4, djf $$5, int $$6, int $$7, boolean $$8, amn $$9, dky $$10, Supplier<eei> $$11) {
      this.d = $$0;
      this.g = new amc.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ad()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eei($$12, $$2);
      this.a = new alo($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public amh a() {
      return this.f;
   }

   @Nullable
   private alm b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dje $$1, djj $$2) {
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
   public dje a(int $$0, int $$1, djj $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dje>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bfo $$4 = this.d.ae();
         $$4.d("getChunk");
         long $$5 = crh.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dje $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dje, alm.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dje $$9 = (dje)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public djp a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ae().d("getChunkNow");
         long $$2 = crh.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == djj.n) {
               dje $$4 = this.o[$$3];
               return $$4 instanceof djp ? (djp)$$4 : null;
            }
         }

         alm $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dje, alm.a> $$6 = $$5.b(djj.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dje $$7 = (dje)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, djj.n);
                  if ($$7 instanceof djp) {
                     return (djp)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, crh.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dje, alm.a>> b(int $$0, int $$1, djj $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dje, alm.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dje, alm.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dje, alm.a>> c(int $$0, int $$1, djj $$2, boolean $$3) {
      crh $$4 = new crh($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aln.a($$2);
      alm $$7 = this.b($$5);
      if ($$3) {
         this.c.a(amj.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bfo $$8 = this.d.ae();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? alm.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable alm $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      alm $$2 = this.b(new crh($$0, $$1).a());
      int $$3 = aln.a(djj.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public djr c(int $$0, int $$1) {
      long $$2 = crh.c($$0, $$1);
      alm $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            djj $$5 = b.get($$4);
            Optional<dje> $$6 = $$3.a($$5).getNow(alm.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == djj.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public csa c() {
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
      alm $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<djp, alm.a> $$2 = $$1.a().getNow(null);
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
      long $$0 = this.d.W();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ag()) {
         bfo $$2 = this.d.ae();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<amc.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (alm $$4 : this.a.k()) {
            djp $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new amc.a($$5, $$4));
            }
         }

         if (this.d.n().aO().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            csl.d $$7 = csl.a($$6, this.d.z(), this::a, new csk(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.Y().b(crw.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.Y().c(crw.o);
            boolean $$10 = this.d.A_().e() % 400L == 0L;

            for (amc.a $$11 : $$3) {
               djp $$12 = $$11.a;
               crh $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     csl.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<djp> $$1) {
      alm $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(alm.c).left().ifPresent($$1);
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

   public djf g() {
      return this.a.a();
   }

   public djg h() {
      return this.a.b();
   }

   public dnf i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ht $$0) {
      int $$1 = iu.a($$0.u());
      int $$2 = iu.a($$0.w());
      alm $$3 = this.b(crh.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(csj $$0, iu $$1) {
      this.g.execute(() -> {
         alm $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(amj<T> $$0, crh $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(amj<T> $$0, crh $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(crh $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(amf $$0) {
      if (!$$0.dI()) {
         this.a.a($$0);
      }
   }

   public void a(bkq $$0) {
      this.a.b($$0);
   }

   public void b(bkq $$0) {
      this.a.a($$0);
   }

   public void a(bkq $$0, wk<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bkq $$0, wk<?> $$1) {
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

   public String a(crh $$0) {
      return this.a.a($$0);
   }

   public eei k() {
      return this.h;
   }

   public bwf l() {
      return this.a.m();
   }

   public dke m() {
      return this.a.p();
   }

   @Nullable
   @aup
   public csl.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(djp a, alm b) {
   }

   final class b extends bhn<Runnable> {
      b(csa $$0) {
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
      protected boolean av() {
         return true;
      }

      @Override
      protected Thread aw() {
         return amc.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         amc.this.d.ae().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (amc.this.s()) {
            return true;
         } else {
            amc.this.f.b();
            return super.x();
         }
      }
   }
}
