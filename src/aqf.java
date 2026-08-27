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

public class aqf extends dsh {
   private static final List<dtc> b = dtc.a();
   private final apz c;
   final aqh d;
   final Thread e;
   final aqk f;
   private final aqf.b g;
   public final apq a;
   private final env h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dtc[] n = new dtc[4];
   private final dsd[] o = new dsd[4];
   @Nullable
   @azc
   private dao.d p;

   public aqf(aqh $$0, eob.c $$1, DataFixer $$2, ekq $$3, Executor $$4, dse $$5, int $$6, int $$7, boolean $$8, aqq $$9, dug $$10, Supplier<env> $$11) {
      this.d = $$0;
      this.g = new aqf.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new env($$12, $$2, $$0.H_());
      this.a = new apq($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqk a() {
      return this.f;
   }

   @Nullable
   private apo b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dsd $$1, dtc $$2) {
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
   public dsd a(int $$0, int $$1, dtc $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dsd>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bma $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = czk.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dsd $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<apr<dsd>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         apr<dsd> $$9 = $$8.join();
         dsd $$10 = $$9.b(null);
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
   public dsn a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = czk.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dtc.n) {
               dsd $$4 = this.o[$$3];
               return $$4 instanceof dsn ? (dsn)$$4 : null;
            }
         }

         apo $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            apr<dsd> $$6 = $$5.b(dtc.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dsd $$7 = $$6.b(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dtc.n);
                  if ($$7 instanceof dsn) {
                     return (dsn)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, czk.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<apr<dsd>> b(int $$0, int $$1, dtc $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<apr<dsd>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<apr<dsd>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<apr<dsd>> c(int $$0, int $$1, dtc $$2, boolean $$3) {
      czk $$4 = new czk($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = app.a($$2);
      apo $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqm.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bma $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? apo.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apo $$0, int $$1) {
      return $$0 == null || $$0.l() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apo $$2 = this.b(new czk($$0, $$1).a());
      int $$3 = app.a(dtc.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dsp c(int $$0, int $$1) {
      long $$2 = czk.c($$0, $$1);
      apo $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dtc $$5 = b.get($$4);
            dsd $$6 = $$3.a($$5).getNow(apo.a).b(null);
            if ($$6 != null) {
               return $$6;
            }

            if ($$5 == dtc.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public dad c() {
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
      apo $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apo.c).a();
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
         bma $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aqf.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apo $$4 : this.a.k()) {
            dsn $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aqf.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            dao.d $$7 = dao.a($$6, this.d.A(), this::a, new dan(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.aa().b(czz.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.aa().c(czz.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aqf.a $$11 : $$3) {
               dsn $$12 = $$11.a;
               czk $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     dao.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dsn> $$1) {
      apo $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apo.c).a($$1);
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

   public dse g() {
      return this.a.a();
   }

   public dsf h() {
      return this.a.b();
   }

   public dwn i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(in $$0) {
      int $$1 = jp.a($$0.u());
      int $$2 = jp.a($$0.w());
      apo $$3 = this.b(czk.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dam $$0, jp $$1) {
      this.g.execute(() -> {
         apo $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqm<T> $$0, czk $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqm<T> $$0, czk $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czk $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqi $$0) {
      if (!$$0.dI()) {
         this.a.a($$0);
      }
   }

   public void a(brh $$0) {
      this.a.b($$0);
   }

   public void b(brh $$0) {
      this.a.a($$0);
   }

   public void a(brh $$0, zb<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(brh $$0, zb<?> $$1) {
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

   public String a(czk $$0) {
      return this.a.a($$0);
   }

   public env k() {
      return this.h;
   }

   public cdd l() {
      return this.a.m();
   }

   public dti m() {
      return this.a.p();
   }

   @Nullable
   @azc
   public dao.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dsn a, apo b) {
   }

   final class b extends boc<Runnable> {
      b(dad $$0) {
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
         return aqf.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aqf.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (aqf.this.s()) {
            return true;
         } else {
            aqf.this.f.b();
            return super.A();
         }
      }
   }
}
