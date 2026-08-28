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

public class arf extends dwo {
   private static final Logger b = LogUtils.getLogger();
   private final aqw c;
   final arh d;
   final Thread e;
   final ark f;
   private final arf.b g;
   public final aqn a;
   private final esp h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dxl[] n = new dxl[4];
   private final dwk[] o = new dwk[4];
   private final List<dwu> p = new ArrayList<>();
   private final Set<aql> q = new ReferenceOpenHashSet();
   @Nullable
   @baj
   private der.d r;

   public arf(arh $$0, esv.c $$1, DataFixer $$2, epf $$3, Executor $$4, dwl $$5, int $$6, int $$7, boolean $$8, arq $$9, dyr $$10, Supplier<esp> $$11) {
      this.d = $$0;
      this.g = new arf.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ag()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new esp($$12, $$2, $$0.F_());
      this.a = new aqn($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public ark a() {
      return this.f;
   }

   @Nullable
   private aql b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dwk $$1, dxl $$2) {
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
   public dwk a(int $$0, int $$1, dxl $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dwk>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bod $$4 = this.d.ah();
         $$4.d("getChunk");
         long $$5 = ddm.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dwk $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.d("getChunkCacheMiss");
         CompletableFuture<aqo<dwk>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqo<dwk> $$9 = $$8.join();
         dwk $$10 = $$9.b(null);
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
   public dwu a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         this.d.ah().d("getChunkNow");
         long $$2 = ddm.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dxl.n) {
               dwk $$4 = this.o[$$3];
               return $$4 instanceof dwu ? (dwu)$$4 : null;
            }
         }

         aql $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dwk $$6 = $$5.b(dxl.n);
            if ($$6 != null) {
               this.a($$2, $$6, dxl.n);
               if ($$6 instanceof dwu) {
                  return (dwu)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, ddm.a);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqo<dwk>> b(int $$0, int $$1, dxl $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqo<dwk>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqo<dwk>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqo<dwk>> c(int $$0, int $$1, dxl $$2, boolean $$3) {
      ddm $$4 = new ddm($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqm.a($$2);
      aql $$7 = this.b($$5);
      if ($$3) {
         this.c.a(arm.g, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bod $$8 = this.d.ah();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ad.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? aqz.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aql $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aql $$2 = this.b(new ddm($$0, $$1).a());
      int $$3 = aqm.a(dxl.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dww c(int $$0, int $$1) {
      long $$2 = ddm.c($$0, $$1);
      aql $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dxl.k.c());
   }

   public deg c() {
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
         aql $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aql.a).a();
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
         bod $$2 = this.d.ah();
         $$2.a("pollingChunks");
         if (this.d.s().i()) {
            List<dwu> $$3 = this.p;

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

   private void a(bod $$0) {
      $$0.a("broadcast");

      for (aql $$1 : this.q) {
         dwu $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dwu> $$0) {
      this.a.a($$1 -> {
         dwu $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bod $$0, long $$1, List<dwu> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      der.d $$4 = der.a($$3, this.d.A(), this::a, new deq(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.ac().b(dec.e);
      int $$6 = this.d.ac().c(dec.o);
      List<bun> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.y_().c() % 400L == 0L;
         $$8 = der.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dwu $$10 : $$2) {
         ddm $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.A_().a($$11)) {
            der.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dwu> $$1) {
      aql $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aql.a).a($$1);
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

   public dwl g() {
      return this.a.a();
   }

   public dwm h() {
      return this.a.b();
   }

   public eay i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(je $$0) {
      int $$1 = kg.a($$0.u());
      int $$2 = kg.a($$0.w());
      aql $$3 = this.b(ddm.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dep $$0, kg $$1) {
      this.g.execute(() -> {
         aql $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(arm<T> $$0, ddm $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(arm<T> $$0, ddm $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ddm $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(ari $$0) {
      if (!$$0.dN()) {
         this.a.a($$0);
      }
   }

   public void a(bto $$0) {
      this.a.b($$0);
   }

   public void b(bto $$0) {
      this.a.a($$0);
   }

   public void a(bto $$0, zk<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bto $$0, zk<?> $$1) {
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

   public String a(ddm $$0) {
      return this.a.a($$0);
   }

   public esp k() {
      return this.h;
   }

   public cfn l() {
      return this.a.m();
   }

   public dxt m() {
      return this.a.p();
   }

   @Nullable
   @baj
   public der.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dwu a, aql b) {
   }

   final class b extends bqf<Runnable> {
      b(final deg $$0) {
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
         return arf.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         arf.this.d.ah().d("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arf.this.s()) {
            return true;
         } else {
            arf.this.f.b();
            return super.B();
         }
      }
   }
}
