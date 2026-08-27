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

public class akp extends dhj {
   private static final List<dhk> b = dhk.a();
   private final akj c;
   final akr d;
   final Thread e;
   final aku f;
   private final akp.b g;
   public final akb a;
   private final ecc h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dhk[] n = new dhk[4];
   private final dhf[] o = new dhf[4];
   @Nullable
   @asy
   private cqg.d p;

   public akp(akr $$0, ecg.c $$1, DataFixer $$2, dzc $$3, Executor $$4, dhg $$5, int $$6, int $$7, boolean $$8, ala $$9, diz $$10, Supplier<ecc> $$11) {
      this.d = $$0;
      this.g = new akp.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ac()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new ecc($$12, $$2);
      this.a = new akb($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aku a() {
      return this.f;
   }

   @Nullable
   private ajz b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, dhf $$1, dhk $$2) {
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
   public dhf a(int $$0, int $$1, dhk $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dhf>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bdp $$4 = this.d.ad();
         $$4.d("getChunk");
         long $$5 = cpc.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dhf $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<Either<dhf, ajz.a>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         dhf $$9 = (dhf)$$8.join().map($$0x -> $$0x, $$1x -> {
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
   public dhq a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ad().d("getChunkNow");
         long $$2 = cpc.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dhk.n) {
               dhf $$4 = this.o[$$3];
               return $$4 instanceof dhq ? (dhq)$$4 : null;
            }
         }

         ajz $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            Either<dhf, ajz.a> $$6 = $$5.b(dhk.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dhf $$7 = (dhf)$$6.left().orElse(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dhk.n);
                  if ($$7 instanceof dhq) {
                     return (dhq)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, cpc.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<Either<dhf, ajz.a>> b(int $$0, int $$1, dhk $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<Either<dhf, ajz.a>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<Either<dhf, ajz.a>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<Either<dhf, ajz.a>> c(int $$0, int $$1, dhk $$2, boolean $$3) {
      cpc $$4 = new cpc($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aka.a($$2);
      ajz $$7 = this.b($$5);
      if ($$3) {
         this.c.a(akw.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bdp $$8 = this.d.ad();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ajz.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable ajz $$0, int $$1) {
      return $$0 == null || $$0.m() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      ajz $$2 = this.b(new cpc($$0, $$1).a());
      int $$3 = aka.a(dhk.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dhs c(int $$0, int $$1) {
      long $$2 = cpc.c($$0, $$1);
      ajz $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dhk $$5 = b.get($$4);
            Optional<dhf> $$6 = $$3.a($$5).getNow(ajz.a).left();
            if ($$6.isPresent()) {
               return $$6.get();
            }

            if ($$5 == dhk.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public cpv c() {
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
      ajz $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         Either<dhq, ajz.a> $$2 = $$1.a().getNow(null);
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
         ecd $$3 = this.d.z_();
         bdp $$4 = this.d.ad();
         $$4.a("pollingChunks");
         int $$5 = this.d.X().c(cpr.n);
         boolean $$6 = $$3.e() % 400L == 0L;
         $$4.a("naturalSpawnCount");
         int $$7 = this.c.b();
         cqg.d $$8 = cqg.a($$7, this.d.y(), this::a, new cqf(this.a));
         this.p = $$8;
         $$4.b("filteringLoadedChunks");
         List<akp.a> $$9 = Lists.newArrayListWithCapacity($$7);

         for (ajz $$10 : this.a.k()) {
            dhq $$11 = $$10.d();
            if ($$11 != null) {
               $$9.add(new akp.a($$11, $$10));
            }
         }

         $$4.b("spawnAndTick");
         boolean $$12 = this.d.X().b(cpr.e);
         Collections.shuffle($$9);

         for (akp.a $$13 : $$9) {
            dhq $$14 = $$13.a;
            cpc $$15 = $$14.f();
            if (this.d.a($$15) && this.a.c($$15)) {
               $$14.a($$1);
               if ($$12 && (this.j || this.k) && this.d.B_().a($$15)) {
                  cqg.a(this.d, $$14, $$8, this.k, this.j, $$6);
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

   private void a(long $$0, Consumer<dhq> $$1) {
      ajz $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(ajz.c).left().ifPresent($$1);
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

   public dhg g() {
      return this.a.a();
   }

   public dhh h() {
      return this.a.b();
   }

   public dlg i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(gw $$0) {
      int $$1 = hz.a($$0.u());
      int $$2 = hz.a($$0.w());
      ajz $$3 = this.b(cpc.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(cqe $$0, hz $$1) {
      this.g.execute(() -> {
         ajz $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(akw<T> $$0, cpc $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(akw<T> $$0, cpc $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpc $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aks $$0) {
      if (!$$0.dG()) {
         this.a.a($$0);
      }
   }

   public void a(biq $$0) {
      this.a.b($$0);
   }

   public void b(biq $$0) {
      this.a.a($$0);
   }

   public void a(biq $$0, vd<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(biq $$0, vd<?> $$1) {
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

   public String a(cpc $$0) {
      return this.a.a($$0);
   }

   public ecc k() {
      return this.h;
   }

   public buf l() {
      return this.a.m();
   }

   public dif m() {
      return this.a.p();
   }

   @Nullable
   @asy
   public cqg.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dhq a, ajz b) {
   }

   final class b extends bfo<Runnable> {
      b(cpv $$0) {
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
         return akp.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         akp.this.d.ad().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean x() {
         if (akp.this.s()) {
            return true;
         } else {
            akp.this.f.b();
            return super.x();
         }
      }
   }
}
