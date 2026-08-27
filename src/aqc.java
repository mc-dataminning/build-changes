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

public class aqc extends dry {
   private static final List<dst> b = dst.a();
   private final apw c;
   final aqe d;
   final Thread e;
   final aqh f;
   private final aqc.b g;
   public final apn a;
   private final enk h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dst[] n = new dst[4];
   private final dru[] o = new dru[4];
   @Nullable
   @ayz
   private daf.d p;

   public aqc(aqe $$0, enq.c $$1, DataFixer $$2, ekh $$3, Executor $$4, drv $$5, int $$6, int $$7, boolean $$8, aqn $$9, dtx $$10, Supplier<enk> $$11) {
      this.d = $$0;
      this.g = new aqc.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.ae()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new enk($$12, $$2, $$0.H_());
      this.a = new apn($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqh a() {
      return this.f;
   }

   @Nullable
   private apl b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dru $$1, dst $$2) {
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
   public dru a(int $$0, int $$1, dst $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dru>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         ble $$4 = this.d.af();
         $$4.d("getChunk");
         long $$5 = czb.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dru $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<apo<dru>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         apo<dru> $$9 = $$8.join();
         dru $$10 = $$9.b(null);
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
   public dse a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.af().d("getChunkNow");
         long $$2 = czb.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dst.n) {
               dru $$4 = this.o[$$3];
               return $$4 instanceof dse ? (dse)$$4 : null;
            }
         }

         apl $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            apo<dru> $$6 = $$5.b(dst.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dru $$7 = $$6.b(null);
               if ($$7 != null) {
                  this.a($$2, $$7, dst.n);
                  if ($$7 instanceof dse) {
                     return (dse)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, czb.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<apo<dru>> b(int $$0, int $$1, dst $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<apo<dru>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<apo<dru>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<apo<dru>> c(int $$0, int $$1, dst $$2, boolean $$3) {
      czb $$4 = new czb($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = apm.a($$2);
      apl $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqj.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            ble $$8 = this.d.af();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? apl.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apl $$0, int $$1) {
      return $$0 == null || $$0.l() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apl $$2 = this.b(new czb($$0, $$1).a());
      int $$3 = apm.a(dst.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dsg c(int $$0, int $$1) {
      long $$2 = czb.c($$0, $$1);
      apl $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            dst $$5 = b.get($$4);
            dru $$6 = $$3.a($$5).getNow(apl.a).b(null);
            if ($$6 != null) {
               return $$6;
            }

            if ($$5 == dst.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public czu c() {
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
      apl $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apl.c).a();
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
         ble $$2 = this.d.af();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aqc.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apl $$4 : this.a.k()) {
            dse $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aqc.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            daf.d $$7 = daf.a($$6, this.d.A(), this::a, new dae(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.aa().b(czq.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.aa().c(czq.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aqc.a $$11 : $$3) {
               dse $$12 = $$11.a;
               czb $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     daf.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dse> $$1) {
      apl $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apl.c).a($$1);
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

   public drv g() {
      return this.a.a();
   }

   public drw h() {
      return this.a.b();
   }

   public dwe i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(im $$0) {
      int $$1 = jo.a($$0.u());
      int $$2 = jo.a($$0.w());
      apl $$3 = this.b(czb.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dad $$0, jo $$1) {
      this.g.execute(() -> {
         apl $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqj<T> $$0, czb $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqj<T> $$0, czb $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czb $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqf $$0) {
      if (!$$0.dI()) {
         this.a.a($$0);
      }
   }

   public void a(bql $$0) {
      this.a.b($$0);
   }

   public void b(bql $$0) {
      this.a.a($$0);
   }

   public void a(bql $$0, yz<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bql $$0, yz<?> $$1) {
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

   public String a(czb $$0) {
      return this.a.a($$0);
   }

   public enk k() {
      return this.h;
   }

   public cch l() {
      return this.a.m();
   }

   public dsz m() {
      return this.a.p();
   }

   @Nullable
   @ayz
   public daf.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dse a, apl b) {
   }

   final class b extends bng<Runnable> {
      b(czu $$0) {
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
         return aqc.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aqc.this.d.af().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (aqc.this.s()) {
            return true;
         } else {
            aqc.this.f.b();
            return super.A();
         }
      }
   }
}
