import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
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

public class arr extends edh {
   private static final Logger b = LogUtils.getLogger();
   private final arh c;
   private final aru d;
   final Thread e;
   final ary f;
   private final arr.a g;
   public final aqy a;
   private final ezr h;
   private final dkw i;
   private long j;
   private boolean k = true;
   private boolean l = true;
   private static final int m = 4;
   private final long[] n = new long[4];
   private final eee[] o = new eee[4];
   private final edd[] p = new edd[4];
   private final List<edn> q = new ObjectArrayList();
   private final Set<aqw> r = new ReferenceOpenHashSet();
   @Nullable
   @baz
   private dkk.d s;

   public arr(aru $$0, ezx.c $$1, DataFixer $$2, ewg $$3, Executor $$4, ede $$5, int $$6, int $$7, boolean $$8, ase $$9, efk $$10, Supplier<ezr> $$11) {
      this.d = $$0;
      this.g = new arr.a($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.aj()).resolve("data");

      try {
         w.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new ezr(new ezc.a($$0), $$12, $$2, $$0.J_());
      this.i = this.h.a(dkw.b);
      this.a = new aqy($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, this.i, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.s();
   }

   public ary a() {
      return this.f;
   }

   @Nullable
   private aqw b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable edd $$1, eee $$2) {
      for (int $$3 = 3; $$3 > 0; $$3--) {
         this.n[$$3] = this.n[$$3 - 1];
         this.o[$$3] = this.o[$$3 - 1];
         this.p[$$3] = this.p[$$3 - 1];
      }

      this.n[0] = $$0;
      this.o[0] = $$2;
      this.p[0] = $$1;
   }

   @Nullable
   @Override
   public edd a(int $$0, int $$1, eee $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<edd>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         brd $$4 = brc.a();
         $$4.f("getChunk");
         long $$5 = dje.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.n[$$6] && $$2 == this.o[$$6]) {
               edd $$7 = this.p[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqz<edd>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqz<edd> $$9 = $$8.join();
         edd $$10 = $$9.b(null);
         if ($$10 == null && $$3) {
            throw (IllegalStateException)ag.b(new IllegalStateException("Chunk not there when requested: " + $$9.b()));
         } else {
            this.a($$5, $$10, $$2);
            return $$10;
         }
      }
   }

   @Nullable
   @Override
   public edn a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         brc.a().f("getChunkNow");
         long $$2 = dje.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.n[$$3] && this.o[$$3] == eee.n) {
               edd $$4 = this.p[$$3];
               return $$4 instanceof edn ? (edn)$$4 : null;
            }
         }

         aqw $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            edd $$6 = $$5.b(eee.n);
            if ($$6 != null) {
               this.a($$2, $$6, eee.n);
               if ($$6 instanceof edn) {
                  return (edn)$$6;
               }
            }

            return null;
         }
      }
   }

   private void s() {
      Arrays.fill(this.n, dje.c);
      Arrays.fill(this.o, null);
      Arrays.fill(this.p, null);
   }

   public CompletableFuture<aqz<edd>> b(int $$0, int $$1, eee $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqz<edd>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqz<edd>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqz<edd>> c(int $$0, int $$1, eee $$2, boolean $$3) {
      dje $$4 = new dje($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqx.a($$2);
      aqw $$7 = this.b($$5);
      if ($$3) {
         this.a(new asa(asb.i, $$6), $$4);
         if (this.a($$7, $$6)) {
            brd $$8 = brc.a();
            $$8.a("chunkLoad");
            this.t();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ag.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ark.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqw $$0, int $$1) {
      return $$0 == null || $$0.j() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqw $$2 = this.b(new dje($$0, $$1).a());
      int $$3 = aqx.a(eee.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public edp c(int $$0, int $$1) {
      long $$2 = dje.c($$0, $$1);
      aqw $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(eee.k.c());
   }

   public djz c() {
      return this.d;
   }

   public boolean d() {
      return this.g.B();
   }

   boolean t() {
      boolean $$0 = this.c.a(this.a);
      boolean $$1 = this.a.f();
      this.a.g();
      if (!$$0 && !$$1) {
         return false;
      } else {
         this.s();
         return true;
      }
   }

   public boolean a(long $$0) {
      if (!this.d.a($$0)) {
         return false;
      } else {
         aqw $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqw.a).a();
      }
   }

   public void a(boolean $$0) {
      this.t();
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
      brd $$2 = brc.a();
      $$2.a("purge");
      if (this.d.u().i() || !$$1) {
         this.i.c();
      }

      this.t();
      $$2.b("chunks");
      if ($$1) {
         this.u();
         this.a.l();
      }

      $$2.b("unload");
      this.a.a($$0);
      $$2.c();
      this.s();
   }

   private void u() {
      long $$0 = this.d.ae();
      long $$1 = $$0 - this.j;
      this.j = $$0;
      if (!this.d.ak()) {
         brd $$2 = brc.a();
         $$2.a("pollingChunks");
         if (this.d.u().i()) {
            $$2.a("tickingChunks");
            this.a($$2, $$1);
            $$2.c();
         }

         this.a($$2);
         $$2.c();
      }
   }

   private void a(brd $$0) {
      $$0.a("broadcast");

      for (aqw $$1 : this.r) {
         edn $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.r.clear();
      $$0.c();
   }

   private void a(brd $$0, long $$1) {
      $$0.b("naturalSpawnCount");
      int $$2 = this.c.a();
      dkk.d $$3 = dkk.a($$2, this.d.C(), this::a, new dkj(this.a));
      this.s = $$3;
      $$0.b("spawnAndTick");
      boolean $$4 = this.d.O().c(djv.f);
      int $$5 = this.d.O().d(djv.p);
      List<bxz> $$7;
      if ($$4 && (this.k || this.l)) {
         boolean $$6 = this.d.C_().c() % 400L == 0L;
         $$7 = dkk.a($$3, this.l, this.k, $$6);
      } else {
         $$7 = List.of();
      }

      List<edn> $$9 = this.q;

      try {
         $$0.a("filteringSpawningChunks");
         this.a.a($$9);
         $$0.b("shuffleSpawningChunks");
         ag.c($$9, this.d.A);
         $$0.b("tickSpawningChunks");

         for (edn $$10 : $$9) {
            this.a($$10, $$1, $$7, $$3);
         }
      } finally {
         $$9.clear();
      }

      $$0.b("tickTickingChunks");
      this.a.a($$1x -> this.d.a($$1x, $$5));
      $$0.c();
      $$0.b("customSpawners");
      if ($$4) {
         this.d.a(this.k, this.l);
      }
   }

   private void a(edn $$0, long $$1, List<bxz> $$2, dkk.d $$3) {
      dje $$4 = $$0.f();
      $$0.b($$1);
      if (this.c.c($$4.a())) {
         this.d.a($$0);
      }

      if (!$$2.isEmpty()) {
         if (this.d.c($$4)) {
            dkk.a(this.d, $$0, $$3, $$2);
         }
      }
   }

   private void a(long $$0, Consumer<edn> $$1) {
      aqw $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqw.a).a($$1);
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

   public ede g() {
      return this.a.a();
   }

   public edf h() {
      return this.a.b();
   }

   public eht i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(iw $$0) {
      int $$1 = jz.a($$0.u());
      int $$2 = jz.a($$0.w());
      aqw $$3 = this.b(dje.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.r.add($$3);
      }
   }

   @Override
   public void a(dki $$0, jz $$1) {
      this.g.execute(() -> {
         aqw $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.r.add($$2);
         }
      });
   }

   public void a(asa $$0, dje $$1) {
      this.i.a($$0, $$1);
   }

   public void a(asb $$0, dje $$1, int $$2) {
      this.i.a($$0, $$1, $$2);
   }

   public void b(asb $$0, dje $$1, int $$2) {
      this.i.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dje $$0, boolean $$1) {
      return this.i.a($$0, $$1);
   }

   @Override
   public LongSet k() {
      return this.i.e();
   }

   public void a(arv $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bwv $$0) {
      this.a.b($$0);
   }

   public void b(bwv $$0) {
      this.a.a($$0);
   }

   public void a(bwv $$0, zj<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bwv $$0, zj<?> $$1) {
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
      this.k = $$0;
      this.l = this.l;
   }

   public String a(dje $$0) {
      return this.a.a($$0);
   }

   public ezr l() {
      return this.h;
   }

   public ciy m() {
      return this.a.m();
   }

   public eem n() {
      return this.a.p();
   }

   @Nullable
   @baz
   public dkk.d o() {
      return this.s;
   }

   public void p() {
      this.i.d();
   }

   public void a(aqw $$0) {
      if ($$0.i()) {
         this.r.add($$0);
      }
   }

   final class a extends bth<Runnable> {
      a(final djz $$0) {
         super("Chunk source main thread executor for " + $$0.aj().a());
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
         return arr.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         brc.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arr.this.t()) {
            return true;
         } else {
            arr.this.f.b();
            return super.B();
         }
      }
   }
}
