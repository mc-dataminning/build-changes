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

public class aro extends dxn {
   private static final Logger b = LogUtils.getLogger();
   private final arf c;
   private final arq d;
   final Thread e;
   final art f;
   private final aro.b g;
   public final aqw a;
   private final eto h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dyk[] n = new dyk[4];
   private final dxj[] o = new dxj[4];
   private final List<dxt> p = new ArrayList<>();
   private final Set<aqu> q = new ReferenceOpenHashSet();
   @Nullable
   @bau
   private dfq.d r;

   public aro(arq $$0, etu.c $$1, DataFixer $$2, eqe $$3, Executor $$4, dxk $$5, int $$6, int $$7, boolean $$8, asa $$9, dzq $$10, Supplier<eto> $$11) {
      this.d = $$0;
      this.g = new aro.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ag()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new eto($$12, $$2, $$0.H_());
      this.a = new aqw($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public art a() {
      return this.f;
   }

   @Nullable
   private aqu b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dxj $$1, dyk $$2) {
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
   public dxj a(int $$0, int $$1, dyk $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dxj>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bor $$4 = boq.a();
         $$4.f("getChunk");
         long $$5 = del.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dxj $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqx<dxj>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqx<dxj> $$9 = $$8.join();
         dxj $$10 = $$9.b(null);
         if ($$10 == null && $$3) {
            throw (IllegalStateException)ae.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
         } else {
            this.a($$5, $$10, $$2);
            return $$10;
         }
      }
   }

   @Nullable
   @Override
   public dxt a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         boq.a().f("getChunkNow");
         long $$2 = del.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dyk.n) {
               dxj $$4 = this.o[$$3];
               return $$4 instanceof dxt ? (dxt)$$4 : null;
            }
         }

         aqu $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dxj $$6 = $$5.b(dyk.n);
            if ($$6 != null) {
               this.a($$2, $$6, dyk.n);
               if ($$6 instanceof dxt) {
                  return (dxt)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, del.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqx<dxj>> b(int $$0, int $$1, dyk $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqx<dxj>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqx<dxj>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqx<dxj>> c(int $$0, int $$1, dyk $$2, boolean $$3) {
      del $$4 = new del($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqv.a($$2);
      aqu $$7 = this.b($$5);
      if ($$3) {
         this.c.a(arw.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bor $$8 = boq.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ae.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ari.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqu $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqu $$2 = this.b(new del($$0, $$1).a());
      int $$3 = aqv.a(dyk.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dxv c(int $$0, int $$1) {
      long $$2 = del.c($$0, $$1);
      aqu $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dyk.k.c());
   }

   public dff c() {
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
         aqu $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqu.a).a();
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
      bor $$2 = boq.a();
      $$2.a("purge");
      if (this.d.s().i() || !$$1) {
         this.c.a();
      }

      this.s();
      $$2.b("chunks");
      if ($$1) {
         this.t();
         this.a.l();
      }

      $$2.b("unload");
      this.a.a($$0);
      $$2.c();
      this.r();
   }

   private void t() {
      long $$0 = this.d.aa();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ah()) {
         bor $$2 = boq.a();
         $$2.a("pollingChunks");
         if (this.d.s().i()) {
            List<dxt> $$3 = this.p;

            try {
               $$2.a("filteringTickingChunks");
               this.a($$3);
               $$2.b("shuffleChunks");
               ae.c($$3, this.d.A);
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

   private void a(bor $$0) {
      $$0.a("broadcast");

      for (aqu $$1 : this.q) {
         dxt $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dxt> $$0) {
      this.a.a($$1 -> {
         dxt $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.q())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bor $$0, long $$1, List<dxt> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dfq.d $$4 = dfq.a($$3, this.d.A(), this::a, new dfp(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.ac().b(dfb.e);
      int $$6 = this.d.ac().c(dfb.o);
      List<bvh> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.A_().c() % 400L == 0L;
         $$8 = dfq.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dxt $$10 : $$2) {
         del $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.C_().a($$11)) {
            dfq.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dxt> $$1) {
      aqu $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqu.a).a($$1);
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

   public dxk g() {
      return this.a.a();
   }

   public dxl h() {
      return this.a.b();
   }

   public ebx i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      aqu $$3 = this.b(del.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dfo $$0, kj $$1) {
      this.g.execute(() -> {
         aqu $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(arw<T> $$0, del $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(arw<T> $$0, del $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(del $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(arr $$0) {
      if (!$$0.dT()) {
         this.a.a($$0);
      }
   }

   public void a(bui $$0) {
      this.a.b($$0);
   }

   public void b(bui $$0) {
      this.a.a($$0);
   }

   public void a(bui $$0, zs<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bui $$0, zs<?> $$1) {
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

   public String a(del $$0) {
      return this.a.a($$0);
   }

   public eto k() {
      return this.h;
   }

   public cgi l() {
      return this.a.m();
   }

   public dys m() {
      return this.a.p();
   }

   @Nullable
   @bau
   public dfq.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dxt a, aqu b) {
   }

   final class b extends bqw<Runnable> {
      b(final dff $$0) {
         super("Chunk source main thread executor for " + $$0.ag().a());
      }

      @Override
      public void b(BooleanSupplier $$0) {
         super.b(() -> MinecraftServer.z() && $$0.getAsBoolean());
      }

      @Override
      public Runnable f(Runnable $$0) {
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
         return aro.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         boq.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (aro.this.s()) {
            return true;
         } else {
            aro.this.f.b();
            return super.B();
         }
      }
   }
}
