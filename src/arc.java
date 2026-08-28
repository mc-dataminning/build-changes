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

public class arc extends dua {
   private static final List<duv> b = duv.a();
   private final aqw c;
   final are d;
   final Thread e;
   final arh f;
   private final arc.b g;
   public final aqn a;
   private final epo h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final duv[] n = new duv[4];
   private final dtw[] o = new dtw[4];
   @Nullable
   @bab
   private dch.d p;

   public arc(are $$0, epu.c $$1, DataFixer $$2, emj $$3, Executor $$4, dtx $$5, int $$6, int $$7, boolean $$8, arn $$9, dvz $$10, Supplier<epo> $$11) {
      this.d = $$0;
      this.g = new arc.b($$0);
      this.e = Thread.currentThread();
      File $$12 = $$1.a($$0.af()).resolve("data").toFile();
      $$12.mkdirs();
      this.h = new epo($$12, $$2, $$0.H_());
      this.a = new aqn($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.e();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public arh a() {
      return this.f;
   }

   @Nullable
   private aql b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dtw $$1, duv $$2) {
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
   public dtw a(int $$0, int $$1, duv $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dtw>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bng $$4 = this.d.ag();
         $$4.d("getChunk");
         long $$5 = dbd.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dtw $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<aqo<dtw>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$8::isDone);
         aqo<dtw> $$9 = $$8.join();
         dtw $$10 = $$9.b(null);
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
   public dug a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ag().d("getChunkNow");
         long $$2 = dbd.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == duv.n) {
               dtw $$4 = this.o[$$3];
               return $$4 instanceof dug ? (dug)$$4 : null;
            }
         }

         aql $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            aqo<dtw> $$6 = $$5.b(duv.n).getNow(null);
            if ($$6 == null) {
               return null;
            } else {
               dtw $$7 = $$6.b(null);
               if ($$7 != null) {
                  this.a($$2, $$7, duv.n);
                  if ($$7 instanceof dug) {
                     return (dug)$$7;
                  }
               }

               return null;
            }
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dbd.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqo<dtw>> b(int $$0, int $$1, duv $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqo<dtw>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.c($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqo<dtw>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqo<dtw>> c(int $$0, int $$1, duv $$2, boolean $$3) {
      dbd $$4 = new dbd($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqm.a($$2);
      aql $$7 = this.b($$5);
      if ($$3) {
         this.c.a(arj.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bng $$8 = this.d.ag();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ac.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aql.b : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aql $$0, int $$1) {
      return $$0 == null || $$0.l() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aql $$2 = this.b(new dbd($$0, $$1).a());
      int $$3 = aqm.a(duv.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dui c(int $$0, int $$1) {
      long $$2 = dbd.c($$0, $$1);
      aql $$3 = this.b($$2);
      if ($$3 == null) {
         return null;
      } else {
         int $$4 = b.size() - 1;

         while (true) {
            duv $$5 = b.get($$4);
            dtw $$6 = $$3.a($$5).getNow(aql.a).b(null);
            if ($$6 != null) {
               return $$6;
            }

            if ($$5 == duv.k.d()) {
               return null;
            }

            $$4--;
         }
      }
   }

   public dbw c() {
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
      aql $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         return !this.d.a($$0) ? false : $$1.a().getNow(aql.c).a();
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
         bng $$2 = this.d.ag();
         $$2.a("pollingChunks");
         $$2.a("filteringLoadedChunks");
         List<arc.a> $$3 = Lists.newArrayListWithCapacity(this.a.i());

         for (aql $$4 : this.a.k()) {
            dug $$5 = $$4.d();
            if ($$5 != null) {
               $$3.add(new arc.a($$5, $$4));
            }
         }

         if (this.d.s().i()) {
            $$2.b("naturalSpawnCount");
            int $$6 = this.c.b();
            dch.d $$7 = dch.a($$6, this.d.A(), this::a, new dcg(this.a));
            this.p = $$7;
            $$2.b("spawnAndTick");
            boolean $$8 = this.d.ab().b(dbs.e);
            ac.c($$3, this.d.z);
            int $$9 = this.d.ab().c(dbs.o);
            boolean $$10 = this.d.A_().c() % 400L == 0L;

            for (arc.a $$11 : $$3) {
               dug $$12 = $$11.a;
               dbd $$13 = $$12.f();
               if (this.d.a($$13) && this.a.c($$13)) {
                  $$12.a($$1);
                  if ($$8 && (this.j || this.k) && this.d.C_().a($$13)) {
                     dch.a(this.d, $$12, $$7, this.k, this.j, $$10);
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

   private void a(long $$0, Consumer<dug> $$1) {
      aql $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aql.c).a($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bx();
   }

   public dtx g() {
      return this.a.a();
   }

   public dty h() {
      return this.a.b();
   }

   public dyg i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(iz $$0) {
      int $$1 = kb.a($$0.u());
      int $$2 = kb.a($$0.w());
      aql $$3 = this.b(dbd.c($$1, $$2));
      if ($$3 != null) {
         $$3.a($$0);
      }
   }

   @Override
   public void a(dcf $$0, kb $$1) {
      this.g.execute(() -> {
         aql $$2 = this.b($$1.r().a());
         if ($$2 != null) {
            $$2.a($$0, $$1.b());
         }
      });
   }

   public <T> void a(arj<T> $$0, dbd $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(arj<T> $$0, dbd $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbd $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(arf $$0) {
      if (!$$0.dK()) {
         this.a.a($$0);
      }
   }

   public void a(bss $$0) {
      this.a.b($$0);
   }

   public void b(bss $$0) {
      this.a.a($$0);
   }

   public void a(bss $$0, zv<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bss $$0, zv<?> $$1) {
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

   public String a(dbd $$0) {
      return this.a.a($$0);
   }

   public epo k() {
      return this.h;
   }

   public cer l() {
      return this.a.m();
   }

   public dvb m() {
      return this.a.p();
   }

   @Nullable
   @bab
   public dch.d n() {
      return this.p;
   }

   public void o() {
      this.c.e();
   }

   static record a(dug a, aql b) {
   }

   final class b extends bpi<Runnable> {
      b(final dbw $$0) {
         super("Chunk source main thread executor for " + $$0.af().a());
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
         return arc.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         arc.this.d.ag().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean A() {
         if (arc.this.s()) {
            return true;
         } else {
            arc.this.f.b();
            return super.A();
         }
      }
   }
}
