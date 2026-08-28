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

public class aqk extends dul {
   private static final List<dvi> b = dvi.a();
   private final aqc c;
   final aqm d;
   final Thread e;
   final aqp f;
   private final aqk.b g;
   public final apt a;
   private final eqe h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dvi[] n = new dvi[4];
   private final duh[] o = new duh[4];
   @Nullable
   @azl
   private dcr.d p;

   public aqk(aqm $$0, eqk.c $$1, DataFixer $$2, emz $$3, Executor $$4, dui $$5, int $$6, int $$7, boolean $$8, aqv $$9, dwn $$10, Supplier<eqe> $$11) {
      this.d = $$0;
      this.g = new aqk.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.af()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new eqe($$12, $$2, $$0.H_());
      this.a = new apt($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public aqp a() {
      return this.f;
   }

   @Nullable
   private apr b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable duh $$1, dvi $$2) {
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
   public duh a(int $$0, int $$1, dvi $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<duh>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bmv $$4 = this.d.ag();
         $$4.d("getChunk");
         long $$5 = dbn.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               duh $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<apu<duh>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         apu<duh> $$9 = $$8.join();
         duh $$10 = $$9.b(null);
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
   public dur a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ag().d("getChunkNow");
         long $$2 = dbn.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dvi.n) {
               duh $$4 = this.o[$$3];
               return $$4 instanceof dur ? (dur)$$4 : null;
            }
         }

         apr $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            duh $$6 = $$5.b(dvi.n);
            if ($$6 != null) {
               this.a($$2, $$6, dvi.n);
               if ($$6 instanceof dur) {
                  return (dur)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dbn.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<apu<duh>> b(int $$0, int $$1, dvi $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<apu<duh>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<apu<duh>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<apu<duh>> c(int $$0, int $$1, dvi $$2, boolean $$3) {
      dbn $$4 = new dbn($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aps.a($$2);
      apr $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aqr.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bmv $$8 = this.d.ag();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aqf.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable apr $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      apr $$2 = this.b(new dbn($$0, $$1).a());
      int $$3 = aps.a(dvi.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dut c(int $$0, int $$1) {
      long $$2 = dbn.c($$0, $$1);
      apr $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dvi.k);
   }

   public dcg c() {
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
      apr $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(apr.a).a();
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
         bmv $$2 = this.d.ag();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<aqk.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (apr $$4 : this.a.k()) {
            dur $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new aqk.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            dcr.d $$7 = dcr.a($$6, this.d.A(), this::a, new dcq(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.ab().b(dcc.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.ab().c(dcc.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (aqk.a $$11 : $$3) {
               dur $$12 = $$11.a;
               dbn $$13 = $$12.f();
               if (this.d.a($$13) && this.a.b($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     dcr.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dur> $$1) {
      apr $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(apr.a).a($$1);
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

   public dui g() {
      return this.a.a();
   }

   public duj h() {
      return this.a.b();
   }

   public dyu i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ja $$0) {
      int $$1 = kc.a($$0.u());
      int $$2 = kc.a($$0.w());
      apr $$3 = this.b(dbn.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dcp $$0, kc $$1) {
      this.g.execute(() -> {
         apr $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(aqr<T> $$0, dbn $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aqr<T> $$0, dbn $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbn $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aqn $$0) {
      if (!$$0.dM()) {
         this.a.a($$0);
      }
   }

   public void a(bsh $$0) {
      this.a.b($$0);
   }

   public void b(bsh $$0) {
      this.a.a($$0);
   }

   public void a(bsh $$0, zb<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bsh $$0, zb<?> $$1) {
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

   public String a(dbn $$0) {
      return this.a.a($$0);
   }

   public eqe k() {
      return this.h;
   }

   public ceg l() {
      return this.a.m();
   }

   public dvp m() {
      return this.a.p();
   }

   @Nullable
   @azl
   public dcr.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dur a, apr b) {
   }

   final class b extends box<Runnable> {
      b(final dcg $$0) {
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
      protected boolean az() {
         return true;
      }

      @Override
      protected Thread aA() {
         return aqk.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         aqk.this.d.ag().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (aqk.this.s()) {
            return true;
         } else {
            aqk.this.f.b();
            return super.B();
         }
      }
   }
}
