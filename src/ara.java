import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
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

public class ara extends dzq {
   private static final Logger b = LogUtils.getLogger();
   private final aqq c;
   private final ard d;
   final Thread e;
   final arh f;
   private final ara.a g;
   public final aqh a;
   private final evw h;
   private final dhw i;
   private long j;
   private boolean k = true;
   private boolean l = true;
   private static final int m = 4;
   private final long[] n = new long[4];
   private final ean[] o = new ean[4];
   private final dzm[] p = new dzm[4];
   private final List<dzw> q = new ArrayList<>();
   private final Set<aqf> r = new ReferenceOpenHashSet();
   @Nullable
   @bag
   private dhk.d s;

   public ara(ard $$0, ewc.c $$1, DataFixer $$2, esm $$3, Executor $$4, dzn $$5, int $$6, int $$7, boolean $$8, arn $$9, ebt $$10, Supplier<evw> $$11) {
      this.d = $$0;
      this.g = new ara.a($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.aj()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new evw($$12, $$2, $$0.F_());
      this.i = this.h.a(dhw.a(), "chunks");
      this.a = new aqh($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, this.i, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.s();
   }

   public arh a() {
      return this.f;
   }

   @Nullable
   private aqf b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dzm $$1, ean $$2) {
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
   public dzm a(int $$0, int $$1, ean $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dzm>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bpj $$4 = bpi.a();
         $$4.f("getChunk");
         long $$5 = dgg.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.n[$$6] && $$2 == this.o[$$6]) {
               dzm $$7 = this.p[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqi<dzm>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqi<dzm> $$9 = $$8.join();
         dzm $$10 = $$9.b(null);
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
   public dzw a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bpi.a().f("getChunkNow");
         long $$2 = dgg.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.n[$$3] && this.o[$$3] == ean.n) {
               dzm $$4 = this.p[$$3];
               return $$4 instanceof dzw ? (dzw)$$4 : null;
            }
         }

         aqf $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dzm $$6 = $$5.b(ean.n);
            if ($$6 != null) {
               this.a($$2, $$6, ean.n);
               if ($$6 instanceof dzw) {
                  return (dzw)$$6;
               }
            }

            return null;
         }
      }
   }

   private void s() {
      Arrays.fill(this.n, dgg.c);
      Arrays.fill(this.o, null);
      Arrays.fill(this.p, null);
   }

   public CompletableFuture<aqi<dzm>> b(int $$0, int $$1, ean $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqi<dzm>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqi<dzm>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqi<dzm>> c(int $$0, int $$1, ean $$2, boolean $$3) {
      dgg $$4 = new dgg($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqg.a($$2);
      aqf $$7 = this.b($$5);
      if ($$3) {
         this.a(new arj(ark.i, $$6), $$4);
         if (this.a($$7, $$6)) {
            bpj $$8 = bpi.a();
            $$8.a("chunkLoad");
            this.t();
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
      aqf $$2 = this.b(new dgg($$0, $$1).a());
      int $$3 = aqg.a(ean.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dzy c(int $$0, int $$1) {
      long $$2 = dgg.c($$0, $$1);
      aqf $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(ean.k.c());
   }

   public dgz c() {
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
         aqf $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqf.a).a();
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
      bpj $$2 = bpi.a();
      $$2.a("purge");
      if (this.d.u().i() || !$$1) {
         this.i.d();
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
         bpj $$2 = bpi.a();
         $$2.a("pollingChunks");
         if (this.d.u().i()) {
            List<dzw> $$3 = this.q;

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

   private void a(bpj $$0) {
      $$0.a("broadcast");

      for (aqf $$1 : this.r) {
         dzw $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.r.clear();
      $$0.c();
   }

   private void a(List<dzw> $$0) {
      this.a.a($$1 -> {
         dzw $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bpj $$0, long $$1, List<dzw> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.a();
      dhk.d $$4 = dhk.a($$3, this.d.C(), this::a, new dhj(this.a));
      this.s = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.O().b(dgv.e);
      int $$6 = this.d.O().c(dgv.o);
      List<bwb> $$8;
      if ($$5 && (this.k || this.l)) {
         boolean $$7 = this.d.y_().c() % 400L == 0L;
         $$8 = dhk.a($$4, this.l, this.k, $$7);
      } else {
         $$8 = List.of();
      }

      for (dzw $$10 : $$2) {
         dgg $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.A_().a($$11)) {
            dhk.a(this.d, $$10, $$4, $$8);
         }

         if (this.d.a($$11.a())) {
            this.d.a($$10, $$6);
         }
      }

      $$0.b("customSpawners");
      if ($$5) {
         this.d.a(this.k, this.l);
      }
   }

   private void a(long $$0, Consumer<dzw> $$1) {
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

   public dzn g() {
      return this.a.a();
   }

   public dzo h() {
      return this.a.b();
   }

   public eec i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      aqf $$3 = this.b(dgg.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.r.add($$3);
      }
   }

   @Override
   public void a(dhi $$0, kk $$1) {
      this.g.execute(() -> {
         aqf $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.r.add($$2);
         }
      });
   }

   public void a(arj $$0, dgg $$1) {
      this.i.a($$0, $$1);
   }

   public void a(ark $$0, dgg $$1, int $$2) {
      this.i.a($$0, $$1, $$2);
   }

   public void b(ark $$0, dgg $$1, int $$2) {
      this.i.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgg $$0, boolean $$1) {
      return this.i.a($$0, $$1);
   }

   @Override
   public LongSet k() {
      return this.i.f();
   }

   public void a(are $$0) {
      if (!$$0.dP()) {
         this.a.a($$0);
      }
   }

   public void a(bva $$0) {
      this.a.b($$0);
   }

   public void b(bva $$0) {
      this.a.a($$0);
   }

   public void a(bva $$0, yw<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bva $$0, yw<?> $$1) {
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

   public String a(dgg $$0) {
      return this.a.a($$0);
   }

   public evw l() {
      return this.h;
   }

   public chc m() {
      return this.a.m();
   }

   public eav n() {
      return this.a.p();
   }

   @Nullable
   @bag
   public dhk.d o() {
      return this.s;
   }

   public void p() {
      this.i.e();
   }

   public void a(aqf $$0) {
      if ($$0.i()) {
         this.r.add($$0);
      }
   }

   final class a extends brn<Runnable> {
      a(final dgz $$0) {
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
         return ara.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bpi.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (ara.this.t()) {
            return true;
         } else {
            ara.this.f.b();
            return super.B();
         }
      }
   }
}
