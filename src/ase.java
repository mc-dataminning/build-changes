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

public class ase extends dzm {
   private static final Logger b = LogUtils.getLogger();
   private final arv c;
   private final ash d;
   final Thread e;
   final ask f;
   private final ase.b g;
   public final arm a;
   private final evp h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final eaj[] n = new eaj[4];
   private final dzi[] o = new dzi[4];
   private final List<dzs> p = new ArrayList<>();
   private final Set<ark> q = new ReferenceOpenHashSet();
   @Nullable
   @bbl
   private dhl.d r;

   public ase(ash $$0, evv.c $$1, DataFixer $$2, esf $$3, Executor $$4, dzj $$5, int $$6, int $$7, boolean $$8, asr $$9, ebp $$10, Supplier<evp> $$11) {
      this.d = $$0;
      this.g = new ase.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ah()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new evp($$12, $$2, $$0.K_());
      this.a = new arm($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public ask a() {
      return this.f;
   }

   @Nullable
   private ark b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dzi $$1, eaj $$2) {
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
   public dzi a(int $$0, int $$1, eaj $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dzi>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bpo $$4 = bpn.a();
         $$4.f("getChunk");
         long $$5 = dgg.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dzi $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<arn<dzi>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         arn<dzi> $$9 = $$8.join();
         dzi $$10 = $$9.b(null);
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
   public dzs a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bpn.a().f("getChunkNow");
         long $$2 = dgg.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == eaj.n) {
               dzi $$4 = this.o[$$3];
               return $$4 instanceof dzs ? (dzs)$$4 : null;
            }
         }

         ark $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dzi $$6 = $$5.b(eaj.n);
            if ($$6 != null) {
               this.a($$2, $$6, eaj.n);
               if ($$6 instanceof dzs) {
                  return (dzs)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, dgg.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<arn<dzi>> b(int $$0, int $$1, eaj $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<arn<dzi>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<arn<dzi>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<arn<dzi>> c(int $$0, int $$1, eaj $$2, boolean $$3) {
      dgg $$4 = new dgg($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = arl.a($$2);
      ark $$7 = this.b($$5);
      if ($$3) {
         this.c.a(asn.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bpo $$8 = bpn.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ae.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ary.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable ark $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      ark $$2 = this.b(new dgg($$0, $$1).a());
      int $$3 = arl.a(eaj.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dzu c(int $$0, int $$1) {
      long $$2 = dgg.c($$0, $$1);
      ark $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(eaj.k.c());
   }

   public dha c() {
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
         ark $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(ark.a).a();
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
      bpo $$2 = bpn.a();
      $$2.a("purge");
      if (this.d.t().i() || !$$1) {
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
      long $$0 = this.d.ac();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ai()) {
         bpo $$2 = bpn.a();
         $$2.a("pollingChunks");
         if (this.d.t().i()) {
            List<dzs> $$3 = this.p;

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

   private void a(bpo $$0) {
      $$0.a("broadcast");

      for (ark $$1 : this.q) {
         dzs $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dzs> $$0) {
      this.a.a($$1 -> {
         dzs $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.q())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bpo $$0, long $$1, List<dzs> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dhl.d $$4 = dhl.a($$3, this.d.B(), this::a, new dhk(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.N().b(dgw.e);
      int $$6 = this.d.N().c(dgw.o);
      List<bwe> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.D_().c() % 400L == 0L;
         $$8 = dhl.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dzs $$10 : $$2) {
         dgg $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.F_().a($$11)) {
            dhl.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dzs> $$1) {
      ark $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(ark.a).a($$1);
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

   public dzj g() {
      return this.a.a();
   }

   public dzk h() {
      return this.a.b();
   }

   public edw i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      ark $$3 = this.b(dgg.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dhj $$0, kj $$1) {
      this.g.execute(() -> {
         ark $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(asn<T> $$0, dgg $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(asn<T> $$0, dgg $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgg $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(asi $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bvf $$0) {
      this.a.b($$0);
   }

   public void b(bvf $$0) {
      this.a.a($$0);
   }

   public void a(bvf $$0, aac<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bvf $$0, aac<?> $$1) {
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

   public String a(dgg $$0) {
      return this.a.a($$0);
   }

   public evp k() {
      return this.h;
   }

   public chf l() {
      return this.a.m();
   }

   public ear m() {
      return this.a.p();
   }

   @Nullable
   @bbl
   public dhl.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dzs a, ark b) {
   }

   final class b extends brt<Runnable> {
      b(final dha $$0) {
         super("Chunk source main thread executor for " + $$0.ah().a());
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
         return ase.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bpn.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (ase.this.s()) {
            return true;
         } else {
            ase.this.f.b();
            return super.B();
         }
      }
   }
}
