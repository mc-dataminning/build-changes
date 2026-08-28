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

public class ara extends dyx {
   private static final Logger b = LogUtils.getLogger();
   private final aqr c;
   private final ard d;
   final Thread e;
   final arg f;
   private final ara.b g;
   public final aqi a;
   private final eva h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dzu[] n = new dzu[4];
   private final dyt[] o = new dyt[4];
   private final List<dzd> p = new ArrayList<>();
   private final Set<aqg> q = new ReferenceOpenHashSet();
   @Nullable
   @bag
   private dgu.d r;

   public ara(ard $$0, evg.c $$1, DataFixer $$2, erq $$3, Executor $$4, dyu $$5, int $$6, int $$7, boolean $$8, arn $$9, eba $$10, Supplier<eva> $$11) {
      this.d = $$0;
      this.g = new ara.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ai()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new eva($$12, $$2, $$0.K_());
      this.a = new aqi($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public arg a() {
      return this.f;
   }

   @Nullable
   private aqg b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dyt $$1, dzu $$2) {
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
   public dyt a(int $$0, int $$1, dzu $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dyt>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bou $$4 = bot.a();
         $$4.f("getChunk");
         long $$5 = dfp.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dyt $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqj<dyt>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqj<dyt> $$9 = $$8.join();
         dyt $$10 = $$9.b(null);
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
   public dzd a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bot.a().f("getChunkNow");
         long $$2 = dfp.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dzu.n) {
               dyt $$4 = this.o[$$3];
               return $$4 instanceof dzd ? (dzd)$$4 : null;
            }
         }

         aqg $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dyt $$6 = $$5.b(dzu.n);
            if ($$6 != null) {
               this.a($$2, $$6, dzu.n);
               if ($$6 instanceof dzd) {
                  return (dzd)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dfp.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqj<dyt>> b(int $$0, int $$1, dzu $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqj<dyt>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqj<dyt>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqj<dyt>> c(int $$0, int $$1, dzu $$2, boolean $$3) {
      dfp $$4 = new dfp($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqh.a($$2);
      aqg $$7 = this.b($$5);
      if ($$3) {
         this.c.a(arj.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bou $$8 = bot.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)af.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aqu.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqg $$0, int $$1) {
      return $$0 == null || $$0.j() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqg $$2 = this.b(new dfp($$0, $$1).a());
      int $$3 = aqh.a(dzu.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dzf c(int $$0, int $$1) {
      long $$2 = dfp.c($$0, $$1);
      aqg $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dzu.k.c());
   }

   public dgj c() {
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
         aqg $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqg.a).a();
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
      bou $$2 = bot.a();
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
         bou $$2 = bot.a();
         $$2.a("pollingChunks");
         if (this.d.u().i()) {
            List<dzd> $$3 = this.p;

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

   private void a(bou $$0) {
      $$0.a("broadcast");

      for (aqg $$1 : this.q) {
         dzd $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dzd> $$0) {
      this.a.a($$1 -> {
         dzd $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bou $$0, long $$1, List<dzd> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dgu.d $$4 = dgu.a($$3, this.d.C(), this::a, new dgt(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.O().b(dgf.e);
      int $$6 = this.d.O().c(dgf.o);
      List<bvl> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.D_().c() % 400L == 0L;
         $$8 = dgu.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dzd $$10 : $$2) {
         dfp $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.F_().a($$11)) {
            dgu.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dzd> $$1) {
      aqg $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqg.a).a($$1);
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

   public dyu g() {
      return this.a.a();
   }

   public dyv h() {
      return this.a.b();
   }

   public edh i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      aqg $$3 = this.b(dfp.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dgs $$0, kk $$1) {
      this.g.execute(() -> {
         aqg $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(arj<T> $$0, dfp $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(arj<T> $$0, dfp $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(are $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bum $$0) {
      this.a.b($$0);
   }

   public void b(bum $$0) {
      this.a.a($$0);
   }

   public void a(bum $$0, yw<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bum $$0, yw<?> $$1) {
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

   public String a(dfp $$0) {
      return this.a.a($$0);
   }

   public eva k() {
      return this.h;
   }

   public cgm l() {
      return this.a.m();
   }

   public eac m() {
      return this.a.p();
   }

   @Nullable
   @bag
   public dgu.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   public void a(aqg $$0) {
      if ($$0.i()) {
         this.q.add($$0);
      }
   }

   static record a(dzd a, aqg b) {
   }

   final class b extends bra<Runnable> {
      b(final dgj $$0) {
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
         return ara.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bot.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (ara.this.s()) {
            return true;
         } else {
            ara.this.f.b();
            return super.B();
         }
      }
   }
}
