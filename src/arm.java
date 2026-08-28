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

public class arm extends dxu {
   private static final Logger b = LogUtils.getLogger();
   private final ard c;
   private final arp d;
   final Thread e;
   final ars f;
   private final arm.b g;
   public final aqu a;
   private final etv h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dyr[] n = new dyr[4];
   private final dxq[] o = new dxq[4];
   private final List<dya> p = new ArrayList<>();
   private final Set<aqs> q = new ReferenceOpenHashSet();
   @Nullable
   @bat
   private dfx.d r;

   public arm(arp $$0, eub.c $$1, DataFixer $$2, eql $$3, Executor $$4, dxr $$5, int $$6, int $$7, boolean $$8, arz $$9, dzx $$10, Supplier<etv> $$11) {
      this.d = $$0;
      this.g = new arm.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ag()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new etv($$12, $$2, $$0.J_());
      this.a = new aqu($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public ars a() {
      return this.f;
   }

   @Nullable
   private aqs b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dxq $$1, dyr $$2) {
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
   public dxq a(int $$0, int $$1, dyr $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dxq>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bou $$4 = bot.a();
         $$4.f("getChunk");
         long $$5 = des.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dxq $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqv<dxq>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqv<dxq> $$9 = $$8.join();
         dxq $$10 = $$9.b(null);
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
   public dya a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bot.a().f("getChunkNow");
         long $$2 = des.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dyr.n) {
               dxq $$4 = this.o[$$3];
               return $$4 instanceof dya ? (dya)$$4 : null;
            }
         }

         aqs $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dxq $$6 = $$5.b(dyr.n);
            if ($$6 != null) {
               this.a($$2, $$6, dyr.n);
               if ($$6 instanceof dya) {
                  return (dya)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, des.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqv<dxq>> b(int $$0, int $$1, dyr $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqv<dxq>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqv<dxq>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqv<dxq>> c(int $$0, int $$1, dyr $$2, boolean $$3) {
      des $$4 = new des($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqt.a($$2);
      aqs $$7 = this.b($$5);
      if ($$3) {
         this.c.a(arv.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bou $$8 = bot.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ae.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? arg.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqs $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqs $$2 = this.b(new des($$0, $$1).a());
      int $$3 = aqt.a(dyr.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dyc c(int $$0, int $$1) {
      long $$2 = des.c($$0, $$1);
      aqs $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dyr.k.c());
   }

   public dfm c() {
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
         aqs $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqs.a).a();
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
      long $$0 = this.d.ab();
      long $$1 = $$0 - this.i;
      this.i = $$0;
      if (!this.d.ah()) {
         bou $$2 = bot.a();
         $$2.a("pollingChunks");
         if (this.d.t().i()) {
            List<dya> $$3 = this.p;

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

   private void a(bou $$0) {
      $$0.a("broadcast");

      for (aqs $$1 : this.q) {
         dya $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dya> $$0) {
      this.a.a($$1 -> {
         dya $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.q())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bou $$0, long $$1, List<dya> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dfx.d $$4 = dfx.a($$3, this.d.B(), this::a, new dfw(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.N().b(dfi.e);
      int $$6 = this.d.N().c(dfi.o);
      List<bvk> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.C_().c() % 400L == 0L;
         $$8 = dfx.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dya $$10 : $$2) {
         des $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.E_().a($$11)) {
            dfx.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dya> $$1) {
      aqs $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqs.a).a($$1);
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

   public dxr g() {
      return this.a.a();
   }

   public dxs h() {
      return this.a.b();
   }

   public ece i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      aqs $$3 = this.b(des.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dfv $$0, kj $$1) {
      this.g.execute(() -> {
         aqs $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(arv<T> $$0, des $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(arv<T> $$0, des $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(des $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(arq $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bul $$0) {
      this.a.b($$0);
   }

   public void b(bul $$0) {
      this.a.a($$0);
   }

   public void a(bul $$0, zq<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bul $$0, zq<?> $$1) {
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

   public String a(des $$0) {
      return this.a.a($$0);
   }

   public etv k() {
      return this.h;
   }

   public cgl l() {
      return this.a.m();
   }

   public dyz m() {
      return this.a.p();
   }

   @Nullable
   @bat
   public dfx.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dya a, aqs b) {
   }

   final class b extends bqz<Runnable> {
      b(final dfm $$0) {
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
         return arm.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bot.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arm.this.s()) {
            return true;
         } else {
            arm.this.f.b();
            return super.B();
         }
      }
   }
}
