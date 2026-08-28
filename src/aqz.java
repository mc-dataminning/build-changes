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

public class aqz extends dyw {
   private static final Logger b = LogUtils.getLogger();
   private final aqq c;
   private final arc d;
   final Thread e;
   final arf f;
   private final aqz.b g;
   public final aqh a;
   private final euz h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dzt[] n = new dzt[4];
   private final dys[] o = new dys[4];
   private final List<dzc> p = new ArrayList<>();
   private final Set<aqf> q = new ReferenceOpenHashSet();
   @Nullable
   @bag
   private dgt.d r;

   public aqz(arc $$0, evf.c $$1, DataFixer $$2, erp $$3, Executor $$4, dyt $$5, int $$6, int $$7, boolean $$8, arm $$9, eaz $$10, Supplier<euz> $$11) {
      this.d = $$0;
      this.g = new aqz.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ai()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new euz($$12, $$2, $$0.K_());
      this.a = new aqh($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public arf a() {
      return this.f;
   }

   @Nullable
   private aqf b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dys $$1, dzt $$2) {
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
   public dys a(int $$0, int $$1, dzt $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dys>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bos $$4 = bor.a();
         $$4.f("getChunk");
         long $$5 = dfo.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dys $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqi<dys>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqi<dys> $$9 = $$8.join();
         dys $$10 = $$9.b(null);
         if ($$10 == null && $$3) {
            throw (IllegalStateException)af.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
         } else {
            this.a($$5, $$10, $$2);
            return $$10;
         }
      }
   }

   @Nullable
   @Override
   public dzc a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bor.a().f("getChunkNow");
         long $$2 = dfo.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dzt.n) {
               dys $$4 = this.o[$$3];
               return $$4 instanceof dzc ? (dzc)$$4 : null;
            }
         }

         aqf $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dys $$6 = $$5.b(dzt.n);
            if ($$6 != null) {
               this.a($$2, $$6, dzt.n);
               if ($$6 instanceof dzc) {
                  return (dzc)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dfo.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqi<dys>> b(int $$0, int $$1, dzt $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqi<dys>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqi<dys>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqi<dys>> c(int $$0, int $$1, dzt $$2, boolean $$3) {
      dfo $$4 = new dfo($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqg.a($$2);
      aqf $$7 = this.b($$5);
      if ($$3) {
         this.c.a(ari.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bos $$8 = bor.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)af.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aqt.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqf $$0, int $$1) {
      return $$0 == null || $$0.j() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqf $$2 = this.b(new dfo($$0, $$1).a());
      int $$3 = aqg.a(dzt.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dze c(int $$0, int $$1) {
      long $$2 = dfo.c($$0, $$1);
      aqf $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dzt.k.c());
   }

   public dgi c() {
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
         aqf $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqf.a).a();
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
      bos $$2 = bor.a();
      $$2.a("purge");
      if (this.d.u().i() || !$$1) {
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
      long $$0 = this.d.ad();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.aj()) {
         bos $$2 = bor.a();
         $$2.a("pollingChunks");
         if (this.d.u().i()) {
            List<dzc> $$3 = this.p;

            try {
               $$2.a("filteringTickingChunks");
               this.a($$3);
               $$2.b("shuffleChunks");
               af.c($$3, this.d.A);
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

   private void a(bos $$0) {
      $$0.a("broadcast");

      for (aqf $$1 : this.q) {
         dzc $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dzc> $$0) {
      this.a.a($$1 -> {
         dzc $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bos $$0, long $$1, List<dzc> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dgt.d $$4 = dgt.a($$3, this.d.C(), this::a, new dgs(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.O().b(dge.e);
      int $$6 = this.d.O().c(dge.o);
      List<bvj> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.D_().c() % 400L == 0L;
         $$8 = dgt.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dzc $$10 : $$2) {
         dfo $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.F_().a($$11)) {
            dgt.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dzc> $$1) {
      aqf $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqf.a).a($$1);
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

   public dyt g() {
      return this.a.a();
   }

   public dyu h() {
      return this.a.b();
   }

   public edg i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      aqf $$3 = this.b(dfo.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dgr $$0, kk $$1) {
      this.g.execute(() -> {
         aqf $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(ari<T> $$0, dfo $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(ari<T> $$0, dfo $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfo $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(ard $$0) {
      if (!$$0.dR()) {
         this.a.a($$0);
      }
   }

   public void a(buk $$0) {
      this.a.b($$0);
   }

   public void b(buk $$0) {
      this.a.a($$0);
   }

   public void a(buk $$0, yv<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(buk $$0, yv<?> $$1) {
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

   public String a(dfo $$0) {
      return this.a.a($$0);
   }

   public euz k() {
      return this.h;
   }

   public cgk l() {
      return this.a.m();
   }

   public eab m() {
      return this.a.p();
   }

   @Nullable
   @bag
   public dgt.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   public void a(aqf $$0) {
      if ($$0.i()) {
         this.q.add($$0);
      }
   }

   static record a(dzc a, aqf b) {
   }

   final class b extends bqy<Runnable> {
      b(final dgi $$0) {
         super("Chunk source main thread executor for " + $$0.ai().a());
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
         return aqz.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bor.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (aqz.this.s()) {
            return true;
         } else {
            aqz.this.f.b();
            return super.B();
         }
      }
   }
}
