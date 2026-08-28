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

public class arl extends dxj {
   private static final Logger b = LogUtils.getLogger();
   private final arc c;
   private final arn d;
   final Thread e;
   final arq f;
   private final arl.b g;
   public final aqt a;
   private final etk h;
   private long i;
   private boolean j = true;
   private boolean k = true;
   private static final int l = 4;
   private final long[] m = new long[4];
   private final dyg[] n = new dyg[4];
   private final dxf[] o = new dxf[4];
   private final List<dxp> p = new ArrayList<>();
   private final Set<aqr> q = new ReferenceOpenHashSet();
   @Nullable
   @baq
   private dfm.d r;

   public arl(arn $$0, etq.c $$1, DataFixer $$2, eqa $$3, Executor $$4, dxg $$5, int $$6, int $$7, boolean $$8, arx $$9, dzm $$10, Supplier<etk> $$11) {
      this.d = $$0;
      this.g = new arl.b($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.ag()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new etk($$12, $$2, $$0.H_());
      this.a = new aqt($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.r();
   }

   public arq a() {
      return this.f;
   }

   @Nullable
   private aqr b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable dxf $$1, dyg $$2) {
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
   public dxf a(int $$0, int $$1, dyg $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<dxf>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bon $$4 = bom.a();
         $$4.f("getChunk");
         long $$5 = deh.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.m[$$6] && $$2 == this.n[$$6]) {
               dxf $$7 = this.o[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqu<dxf>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqu<dxf> $$9 = $$8.join();
         dxf $$10 = $$9.b(null);
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
   public dxp a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bom.a().f("getChunkNow");
         long $$2 = deh.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.m[$$3] && this.n[$$3] == dyg.n) {
               dxf $$4 = this.o[$$3];
               return $$4 instanceof dxp ? (dxp)$$4 : null;
            }
         }

         aqr $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            dxf $$6 = $$5.b(dyg.n);
            if ($$6 != null) {
               this.a($$2, $$6, dyg.n);
               if ($$6 instanceof dxp) {
                  return (dxp)$$6;
               }
            }

            return null;
         }
      }
   }

   private void r() {
      Arrays.fill(this.m, deh.c);
      Arrays.fill(this.n, null);
      Arrays.fill(this.o, null);
   }

   public CompletableFuture<aqu<dxf>> b(int $$0, int $$1, dyg $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqu<dxf>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqu<dxf>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqu<dxf>> c(int $$0, int $$1, dyg $$2, boolean $$3) {
      deh $$4 = new deh($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqs.a($$2);
      aqr $$7 = this.b($$5);
      if ($$3) {
         this.c.a(art.h, $$4, $$6, $$4);
         if (this.a($$7, $$6)) {
            bon $$8 = bom.a();
            $$8.a("chunkLoad");
            this.s();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)ae.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? arf.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqr $$0, int $$1) {
      return $$0 == null || $$0.i() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqr $$2 = this.b(new deh($$0, $$1).a());
      int $$3 = aqs.a(dyg.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public dxr c(int $$0, int $$1) {
      long $$2 = deh.c($$0, $$1);
      aqr $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(dyg.k.c());
   }

   public dfb c() {
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
         aqr $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqr.a).a();
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
      bon $$2 = bom.a();
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
         bon $$2 = bom.a();
         $$2.a("pollingChunks");
         if (this.d.s().i()) {
            List<dxp> $$3 = this.p;

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

   private void a(bon $$0) {
      $$0.a("broadcast");

      for (aqr $$1 : this.q) {
         dxp $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.q.clear();
      $$0.c();
   }

   private void a(List<dxp> $$0) {
      this.a.a($$1 -> {
         dxp $$2 = $$1.d();
         if ($$2 != null && this.d.a($$1.q())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bon $$0, long $$1, List<dxp> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.b();
      dfm.d $$4 = dfm.a($$3, this.d.A(), this::a, new dfl(this.a));
      this.r = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.ac().b(dex.e);
      int $$6 = this.d.ac().c(dex.o);
      List<bvd> $$8;
      if ($$5 && (this.j || this.k)) {
         boolean $$7 = this.d.A_().c() % 400L == 0L;
         $$8 = dfm.a($$4, this.k, this.j, $$7);
      } else {
         $$8 = List.of();
      }

      for (dxp $$10 : $$2) {
         deh $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.C_().a($$11)) {
            dfm.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<dxp> $$1) {
      aqr $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqr.a).a($$1);
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

   public dxg g() {
      return this.a.a();
   }

   public dxh h() {
      return this.a.b();
   }

   public ebt i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      aqr $$3 = this.b(deh.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.q.add($$3);
      }
   }

   @Override
   public void a(dfk $$0, kj $$1) {
      this.g.execute(() -> {
         aqr $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.q.add($$2);
         }
      });
   }

   public <T> void a(art<T> $$0, deh $$1, int $$2, T $$3) {
      this.c.c($$0, $$1, $$2, $$3);
   }

   public <T> void b(art<T> $$0, deh $$1, int $$2, T $$3) {
      this.c.d($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(deh $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public void a(aro $$0) {
      if (!$$0.dS()) {
         this.a.a($$0);
      }
   }

   public void a(bue $$0) {
      this.a.b($$0);
   }

   public void b(bue $$0) {
      this.a.a($$0);
   }

   public void a(bue $$0, zp<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bue $$0, zp<?> $$1) {
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

   public String a(deh $$0) {
      return this.a.a($$0);
   }

   public etk k() {
      return this.h;
   }

   public cge l() {
      return this.a.m();
   }

   public dyo m() {
      return this.a.p();
   }

   @Nullable
   @baq
   public dfm.d n() {
      return this.r;
   }

   public void o() {
      this.c.g();
   }

   static record a(dxp a, aqr b) {
   }

   final class b extends bqs<Runnable> {
      b(final dfb $$0) {
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
         return arl.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bom.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (arl.this.s()) {
            return true;
         } else {
            arl.this.f.b();
            return super.B();
         }
      }
   }
}
