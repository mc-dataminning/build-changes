import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arh extends dws {
   private static final Logger b = LogUtils.getLogger();
   private final aqy c;
   final arj d;
   final Thread e;
   final arm f;
   private final arh.b g;
   public final aqp a;
   private final est h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dxp[] n = new dxp[4];
   private final dwo[] o = new dwo[4];
   private final List<dwy> p = new ArrayList<>();
   private final Set<aqn> q = new ReferenceOpenHashSet();
   @Nullable
   @bal
   private deu.d r;

   public arh(arj $$0, esz.c $$1, DataFixer $$2, epj $$3, Executor $$4, dwp $$5, int $$6, int $$7, boolean $$8, ars $$9, dyv $$10, Supplier<est> $$11) {
      this.d = $$0;
      this.g = new arh.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ag()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new est($$12, $$2, $$0.G_());
      this.a = new aqp($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public arm a() {
      return this.f;
   }

   @Nullable
   private aqn b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dwo $$1, dxp $$2) {
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
   public dwo a(int $$0, int $$1, dxp $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dwo>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bog $$4 = this.d.ah();
         $$4.d("getChunk");
         long $$5 = ddp.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dwo $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<aqq<dwo>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqq<dwo> $$9 = $$8.join();
         dwo $$10 = $$9.b(null);
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
   public dwy a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ah().d("getChunkNow");
         long $$2 = ddp.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dxp.n) {
               dwo $$4 = this.o[$$3];
               return $$4 instanceof dwy ? (dwy)$$4 : null;
            }
         }

         aqn $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dwo $$6 = $$5.b(dxp.n);
            if ($$6 != null) {
               this.a($$2, $$6, dxp.n);
               if ($$6 instanceof dwy) {
                  return (dwy)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, ddp.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqq<dwo>> b(int $$0, int $$1, dxp $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqq<dwo>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqq<dwo>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqq<dwo>> c(int $$0, int $$1, dxp $$2, boolean $$3) {
      ddp $$4 = new ddp($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqo.a($$2);
      aqn $$7 = this.b($$5);
      if ($$3) {
         this.c.a(aro.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bog $$8 = this.d.ah();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ad.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? arb.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqn $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqn $$2 = this.b(new ddp($$0, $$1).a());
      int $$3 = aqo.a(dxp.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dxa c(int $$0, int $$1) {
      long $$2 = ddp.c($$0, $$1);
      aqn $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dxp.k.c());
   }

   public dej c() {
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
      if (!this.d.a($$0)) {
         return false;
      } else {
         aqn $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqn.a).a();
      }
   }

   public void a(boolean $$0) {
      this.s();
      this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a(true);
      this.h.close();
      this.f.close();
      this.a.close();
   }

   @Override
   public void a(BooleanSupplier $$0, boolean $$1) {
      this.d.ah().a("purge");
      if (this.d.s().i() || !$$1) {
         this.c.a();
      }

      this.s();
      this.d.ah().b("chunks");
      if ($$1) {
         this.t();
         this.a.l();
      }

      this.d.ah().b("unload");
      this.a.a($$0);
      this.d.ah().c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.aa();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.aj()) {
         bog $$2 = this.d.ah();
         $$2.a("pollingChunks");
         if (this.d.s().i()) {
            List<dwy> $$3 = this.p;

            try {
               $$2.a("filteringTickingChunks");
               this.a($$3);
               $$2.b("shuffleChunks");
               ad.c($$3, this.d.z);
               this.a($$2, $$1, $$3);
               $$2.c();
            } finally {
               $$3.clear();
            }
         }

         this.a($$2);
         $$2.c();
      }
   }

   private void a(bog $$0) {
      $$0.a("broadcast");

      for (aqn $$1 : this.q) {
         dwy $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dwy> $$0) {
      this.a.a($$1 -> {
         dwy $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bog $$0, long $$1, List<dwy> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      deu.d $$4 = deu.a($$3, this.d.A(), this::a, new det(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.ac().b(def.e);
      int $$6 = this.d.ac().c(def.o);
      List<buq> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.z_().c() % 400L == 0L;
         $$8 = deu.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dwy $$10 : $$2) {
         ddp $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.B_().a($$11)) {
            deu.a(this.d, $$10, $$4, $$8);
         }

         if (this.d.a($$11.a())) {
            this.d.a($$10, $$6);
         }
      }

      $$0.b("customSpawners");
      if ($$5) {
         this.d.a(this.j, this.k);
      }
   }

   private void a(long $$0, Consumer<dwy> $$1) {
      aqn $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqn.a).a($$1);
      }
   }

   @Override
   public String e() {
      return Integer.toString(this.j());
   }

   @VisibleForTesting
   public int f() {
      return this.g.bz();
   }

   public dwp g() {
      return this.a.a();
   }

   public dwq h() {
      return this.a.b();
   }

   public ebc i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jf $$0) {
      int $$1 = kh.a($$0.u());
      int $$2 = kh.a($$0.w());
      aqn $$3 = this.b(ddp.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(des $$0, kh $$1) {
      this.g.execute(() -> {
         aqn $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(aro<T> $$0, ddp $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(aro<T> $$0, ddp $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ddp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(ark $$0) {
      if (!$$0.dN()) {
         this.a.a($$0);
      }
   }

   public void a(btr $$0) {
      this.a.b($$0);
   }

   public void b(btr $$0) {
      this.a.a($$0);
   }

   public void a(btr $$0, zl<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(btr $$0, zl<?> $$1) {
      this.a.a($$0, $$1);
   }

   public void a(int $$0) {
      this.a.a($$0);
   }

   public void b(int $$0) {
      this.c.b($$0);
   }

   @Override
   public void b(boolean $$0) {
      this.j = $$0;
      this.k = this.k;
   }

   public String a(ddp $$0) {
      return this.a.a($$0);
   }

   public est k() {
      return this.h;
   }

   public cfq l() {
      return this.a.m();
   }

   public dxx m() {
      return this.a.p();
   }

   @Nullable
   @bal
   public deu.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dwy a, aqn b) {
   }

   final class b extends bqi<Runnable> {
      b(final dej $$0) {
         super("Chunk source main thread executor for " + $$0.ag().a());
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
      protected boolean ax() {
         return true;
      }

      @Override
      protected Thread ay() {
         return arh.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         arh.this.d.ah().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arh.this.s()) {
            return true;
         } else {
            arh.this.f.b();
            return super.B();
         }
      }
   }
}
