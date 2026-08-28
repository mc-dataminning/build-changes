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

public class arn extends eci {
   private static final Logger b = LogUtils.getLogger();
   private final ard c;
   private final arq d;
   final Thread e;
   final aru f;
   private final arn.a g;
   public final aqu a;
   private final eyp h;
   private final djx i;
   private long j;
   private boolean k = true;
   private boolean l = true;
   private static final int m = 4;
   private final long[] n = new long[4];
   private final edf[] o = new edf[4];
   private final ece[] p = new ece[4];
   private final List<eco> q = new ObjectArrayList();
   private final Set<aqs> r = new ReferenceOpenHashSet();
   @Nullable
   @bav
   private djl.d s;

   public arn(arq $$0, eyv.c $$1, DataFixer $$2, eve $$3, Executor $$4, ecf $$5, int $$6, int $$7, boolean $$8, asa $$9, eel $$10, Supplier<eyp> $$11) {
      this.d = $$0;
      this.g = new arn.a($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.aj()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new eyp(new eya.a($$0), $$12, $$2, $$0.F_());
      this.i = this.h.a(djx.b);
      this.a = new aqu($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, this.i, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.s();
   }

   public aru a() {
      return this.f;
   }

   @Nullable
   private aqs b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable ece $$1, edf $$2) {
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
   public ece a(int $$0, int $$1, edf $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<ece>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bqo $$4 = bqn.a();
         $$4.f("getChunk");
         long $$5 = dih.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.n[$$6] && $$2 == this.o[$$6]) {
               ece $$7 = this.p[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqv<ece>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqv<ece> $$9 = $$8.join();
         ece $$10 = $$9.b(null);
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
   public eco a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bqn.a().f("getChunkNow");
         long $$2 = dih.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.n[$$3] && this.o[$$3] == edf.n) {
               ece $$4 = this.p[$$3];
               return $$4 instanceof eco ? (eco)$$4 : null;
            }
         }

         aqs $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            ece $$6 = $$5.b(edf.n);
            if ($$6 != null) {
               this.a($$2, $$6, edf.n);
               if ($$6 instanceof eco) {
                  return (eco)$$6;
               }
            }

            return null;
         }
      }
   }

   private void s() {
      Arrays.fill(this.n, dih.c);
      Arrays.fill(this.o, null);
      Arrays.fill(this.p, null);
   }

   public CompletableFuture<aqv<ece>> b(int $$0, int $$1, edf $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqv<ece>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqv<ece>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqv<ece>> c(int $$0, int $$1, edf $$2, boolean $$3) {
      dih $$4 = new dih($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqt.a($$2);
      aqs $$7 = this.b($$5);
      if ($$3) {
         this.a(new arw(arx.i, $$6), $$4);
         if (this.a($$7, $$6)) {
            bqo $$8 = bqn.a();
            $$8.a("chunkLoad");
            this.t();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)af.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? arg.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqs $$0, int $$1) {
      return $$0 == null || $$0.j() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqs $$2 = this.b(new dih($$0, $$1).a());
      int $$3 = aqt.a(edf.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public ecq c(int $$0, int $$1) {
      long $$2 = dih.c($$0, $$1);
      aqs $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(edf.k.c());
   }

   public dja c() {
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
         aqs $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqs.a).a();
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
      bqo $$2 = bqn.a();
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
         bqo $$2 = bqn.a();
         if (this.d.u().i()) {
            $$2.a("tickingChunks");
            this.a($$2, $$1);
            $$2.c();
         }

         this.a($$2);
         $$2.c();
      }
   }

   private void a(bqo $$0) {
      $$0.a("broadcast");

      for (aqs $$1 : this.r) {
         eco $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.r.clear();
      $$0.c();
   }

   private void a(bqo $$0, long $$1) {
      $$0.b("naturalSpawnCount");
      int $$2 = this.c.a();
      djl.d $$3 = djl.a($$2, this.d.C(), this::a, new djk(this.a));
      this.s = $$3;
      $$0.b("spawnAndTick");
      boolean $$4 = this.d.O().c(diw.f);
      int $$5 = this.d.O().d(diw.p);
      List<bxh> $$7;
      if ($$4 && (this.k || this.l)) {
         boolean $$6 = this.d.y_().c() % 400L == 0L;
         $$7 = djl.a($$3, this.l, this.k, $$6);
      } else {
         $$7 = List.of();
      }

      List<eco> $$9 = this.q;

      try {
         $$0.a("filteringSpawningChunks");
         this.a.a($$9);
         $$0.b("shuffleSpawningChunks");
         af.c($$9, this.d.A);
         $$0.b("tickSpawningChunks");

         for (eco $$10 : $$9) {
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

   private void a(eco $$0, long $$1, List<bxh> $$2, djl.d $$3) {
      dih $$4 = $$0.f();
      $$0.b($$1);
      if (this.c.c($$4.a())) {
         this.d.a($$0);
      }

      if (!$$2.isEmpty()) {
         if (this.d.c($$4)) {
            djl.a(this.d, $$0, $$3, $$2);
         }
      }
   }

   private void a(long $$0, Consumer<eco> $$1) {
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

   public ecf g() {
      return this.a.a();
   }

   public ecg h() {
      return this.a.b();
   }

   public egu i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(iu $$0) {
      int $$1 = jx.a($$0.u());
      int $$2 = jx.a($$0.w());
      aqs $$3 = this.b(dih.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.r.add($$3);
      }
   }

   @Override
   public void a(djj $$0, jx $$1) {
      this.g.execute(() -> {
         aqs $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.r.add($$2);
         }
      });
   }

   public void a(arw $$0, dih $$1) {
      this.i.a($$0, $$1);
   }

   public void a(arx $$0, dih $$1, int $$2) {
      this.i.a($$0, $$1, $$2);
   }

   public void b(arx $$0, dih $$1, int $$2) {
      this.i.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dih $$0, boolean $$1) {
      return this.i.a($$0, $$1);
   }

   @Override
   public LongSet k() {
      return this.i.e();
   }

   public void a(arr $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bwf $$0) {
      this.a.b($$0);
   }

   public void b(bwf $$0) {
      this.a.a($$0);
   }

   public void a(bwf $$0, zf<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bwf $$0, zf<?> $$1) {
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

   public String a(dih $$0) {
      return this.a.a($$0);
   }

   public eyp l() {
      return this.h;
   }

   public cig m() {
      return this.a.m();
   }

   public edn n() {
      return this.a.p();
   }

   @Nullable
   @bav
   public djl.d o() {
      return this.s;
   }

   public void p() {
      this.i.d();
   }

   public void a(aqs $$0) {
      if ($$0.i()) {
         this.r.add($$0);
      }
   }

   final class a extends bss<Runnable> {
      a(final dja $$0) {
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
         return arn.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bqn.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arn.this.t()) {
            return true;
         } else {
            arn.this.f.b();
            return super.B();
         }
      }
   }
}
