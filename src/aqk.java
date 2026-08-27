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

public class aqk extends dtb {
   private static final List<dtw> b = dtw.a();
   private final aqe c;
   final aqm d;
   final Thread e;
   final aqp f;
   private final aqk.b g;
   public final apv a;
   private final eop h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dtw[] n = new dtw[4];
   private final dsx[] o = new dsx[4];
   @Nullable
   @azg
   private dbi.d p;

   public aqk(aqm $$0, eov.c $$1, DataFixer $$2, elk $$3, Executor $$4, dsy $$5, int $$6, int $$7, boolean $$8, aqv $$9, dva $$10, Supplier<eop> $$11) {
      this.d = $$0;
      this.g = new aqk.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eop($$12, $$2, $$0.H_());
      this.a = new apv($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqp a() {
      return this.f;
   }

   @Nullable
   private apt b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dsx $$1, dtw $$2) {
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
   public dsx a(int $$0, int $$1, dtw $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dsx>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bmi $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = dae.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dsx $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<apw<dsx>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         apw<dsx> $$9 = $$8.join();
         dsx $$10 = $$9.b(null);
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
   public dth a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = dae.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dtw.n) {
               dsx $$4 = this.o[$$3];
               return $$4 instanceof dth ? (dth)$$4 : null;
            }
         }

         apt $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            apw<dsx> $$6 = $$5.b(dtw.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dsx $$7 = $$6.b(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dtw.n);
                  if ($$7 instanceof dth) {
                     return (dth)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dae.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<apw<dsx>> b(int $$0, int $$1, dtw $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<apw<dsx>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<apw<dsx>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<apw<dsx>> c(int $$0, int $$1, dtw $$2, boolean $$3) {
      dae $$4 = new dae($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = apu.a($$2);
      apt $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqr.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bmi $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? apt.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apt $$0, int $$1) {
      return $$0 == null || $$0.l() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apt $$2 = this.b(new dae($$0, $$1).a());
      int $$3 = apu.a(dtw.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dtj c(int $$0, int $$1) {
      long $$2 = dae.c($$0, $$1);
      apt $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dtw $$5 = b.get($$4);
            dsx $$6 = $$3.a($$5).getNow(apt.a).b(null);
            if ($$6 != null) {
               return $$6;
            }

            if ($$5 == dtw.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public dax c() {
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
      apt $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apt.c).a();
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
         bmi $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aqk.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apt $$4 : this.a.k()) {
            dth $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aqk.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            dbi.d $$7 = dbi.a($$6, this.d.A(), this::a, new dbh(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.aa().b(dat.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.aa().c(dat.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aqk.a $$11 : $$3) {
               dth $$12 = $$11.a;
               dae $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     dbi.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dth> $$1) {
      apt $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apt.c).a($$1);
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

   public dsy g() {
      return this.a.a();
   }

   public dsz h() {
      return this.a.b();
   }

   public dxh i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(io $$0) {
      int $$1 = jq.a($$0.u());
      int $$2 = jq.a($$0.w());
      apt $$3 = this.b(dae.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dbg $$0, jq $$1) {
      this.g.execute(() -> {
         apt $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqr<T> $$0, dae $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqr<T> $$0, dae $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dae $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqn $$0) {
      if (!$$0.dK()) {
         this.a.a($$0);
      }
   }

   public void a(bru $$0) {
      this.a.b($$0);
   }

   public void b(bru $$0) {
      this.a.a($$0);
   }

   public void a(bru $$0, ze<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bru $$0, ze<?> $$1) {
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

   public String a(dae $$0) {
      return this.a.a($$0);
   }

   public eop k() {
      return this.h;
   }

   public cds l() {
      return this.a.m();
   }

   public duc m() {
      return this.a.p();
   }

   @Nullable
   @azg
   public dbi.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dth a, apt b) {
   }

   final class b extends bok<Runnable> {
      b(dax $$0) {
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
         return aqk.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aqk.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (aqk.this.s()) {
            return true;
         } else {
            aqk.this.f.b();
            return super.A();
         }
      }
   }
}
