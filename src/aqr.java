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
import net.minecraft.server.MinecraftServer;

public class aqr extends dva {
   private static final List<dvx> b = dvx.a();
   private final aqj c;
   final aqt d;
   final Thread e;
   final aqw f;
   private final aqr.b g;
   public final aqa a;
   private final eqt h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dvx[] n = new dvx[4];
   private final duw[] o = new duw[4];
   @Nullable
   @azs
   private ddf.d p;

   public aqr(aqt $$0, eqz.c $$1, DataFixer $$2, eno $$3, Executor $$4, dux $$5, int $$6, int $$7, boolean $$8, arc $$9, dxc $$10, Supplier<eqt> $$11) {
      this.d = $$0;
      this.g = new aqr.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.af()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eqt($$12, $$2, $$0.H_());
      this.a = new aqa($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqw a() {
      return this.f;
   }

   @Nullable
   private apy b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable duw $$1, dvx $$2) {
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
   public duw a(int $$0, int $$1, dvx $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<duw>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bne $$4 = this.d.ag();
         $$4.d("getChunk");
         long $$5 = dcb.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               duw $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<aqb<duw>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqb<duw> $$9 = $$8.join();
         duw $$10 = $$9.b(null);
         if ($$10 == null && $$3) {
            throw (IllegalStateException)ad.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
         } else {
            this.a($$5, $$10, $$2);
            return $$10;
         }
      }
   }

   @Nullable
   @Override
   public dvg a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ag().d("getChunkNow");
         long $$2 = dcb.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dvx.n) {
               duw $$4 = this.o[$$3];
               return $$4 instanceof dvg ? (dvg)$$4 : null;
            }
         }

         apy $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            duw $$6 = $$5.b(dvx.n);
            if ($$6 != null) {
               this.a($$2, $$6, dvx.n);
               if ($$6 instanceof dvg) {
                  return (dvg)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dcb.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqb<duw>> b(int $$0, int $$1, dvx $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqb<duw>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqb<duw>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqb<duw>> c(int $$0, int $$1, dvx $$2, boolean $$3) {
      dcb $$4 = new dcb($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = apz.a($$2);
      apy $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqy.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bne $$8 = this.d.ag();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ad.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aqm.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apy $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apy $$2 = this.b(new dcb($$0, $$1).a());
      int $$3 = apz.a(dvx.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dvi c(int $$0, int $$1) {
      long $$2 = dcb.c($$0, $$1);
      apy $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dvx.k);
   }

   public dcu c() {
      return this.d;
   }

   public boolean d() {
      return this.g.B();
   }

   boolean s() {
      boolean $$0 = this.c.a(this.a);
      boolean $$1 = this.a.f();
      this.a.g();
      if (!$$0 && !$$1) {
         return false;
      } else {
         this.r();
         return true;
      }
   }

   public boolean a(long $$0) {
      apy $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apy.a).a();
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
      this.d.ag().a("purge");
      if (this.d.s().i() || !$$1) {
         this.c.a();
      }

      this.s();
      this.d.ag().b("chunks");
      if ($$1) {
         this.t();
         this.a.l();
      }

      this.d.ag().b("unload");
      this.a.a($$0);
      this.d.ag().c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.Z();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ai()) {
         bne $$2 = this.d.ag();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aqr.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apy $$4 : this.a.k()) {
            dvg $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aqr.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            ddf.d $$7 = ddf.a($$6, this.d.A(), this::a, new dde(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.ab().b(dcq.e);
            ad.c($$3, this.d.z);
            int $$9 = this.d.ab().c(dcq.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aqr.a $$11 : $$3) {
               dvg $$12 = $$11.a;
               dcb $$13 = $$12.f();
               if (this.d.a($$13) && this.a.b($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     ddf.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dvg> $$1) {
      apy $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apy.a).a($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.by();
   }

   public dux g() {
      return this.a.a();
   }

   public duy h() {
      return this.a.b();
   }

   public dzj i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jd $$0) {
      int $$1 = kf.a($$0.u());
      int $$2 = kf.a($$0.w());
      apy $$3 = this.b(dcb.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(ddd $$0, kf $$1) {
      this.g.execute(() -> {
         apy $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqy<T> $$0, dcb $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqy<T> $$0, dcb $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqu $$0) {
      if (!$$0.dL()) {
         this.a.a($$0);
      }
   }

   public void a(bsq $$0) {
      this.a.b($$0);
   }

   public void b(bsq $$0) {
      this.a.a($$0);
   }

   public void a(bsq $$0, zf<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bsq $$0, zf<?> $$1) {
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

   public String a(dcb $$0) {
      return this.a.a($$0);
   }

   public eqt k() {
      return this.h;
   }

   public ceq l() {
      return this.a.m();
   }

   public dwe m() {
      return this.a.p();
   }

   @Nullable
   @azs
   public ddf.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dvg a, apy b) {
   }

   final class b extends bpg<Runnable> {
      b(final dcu $$0) {
         super("Chunk source main thread executor for " + $$0.af().a());
      }

      @Override
      public void b(BooleanSupplier $$0) {
         super.b(() -> MinecraftServer.z() && $$0.getAsBoolean());
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
         return aqr.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aqr.this.d.ag().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (aqr.this.s()) {
            return true;
         } else {
            aqr.this.f.b();
            return super.B();
         }
      }
   }
}
