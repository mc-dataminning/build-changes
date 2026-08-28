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

public class ark extends ean {
   private static final Logger b = LogUtils.getLogger();
   private final ara c;
   private final arn d;
   final Thread e;
   final arr f;
   private final ark.a g;
   public final aqr a;
   private final ewt h;
   private final dim i;
   private long j;
   private boolean k = true;
   private boolean l = true;
   private static final int m = 4;
   private final long[] n = new long[4];
   private final ebk[] o = new ebk[4];
   private final eaj[] p = new eaj[4];
   private final List<eat> q = new ArrayList<>();
   private final Set<aqp> r = new ReferenceOpenHashSet();
   @Nullable
   @bar
   private dia.d s;

   public ark(arn $$0, ewz.c $$1, DataFixer $$2, etj $$3, Executor $$4, eak $$5, int $$6, int $$7, boolean $$8, arx $$9, ecq $$10, Supplier<ewt> $$11) {
      this.d = $$0;
      this.g = new ark.a($$0);
      this.e = Thread.currentThread();
      Path $$12 = $$1.a($$0.aj()).resolve("data");

      try {
         v.c($$12);
      } catch (IOException var15) {
         b.error("Failed to create dimension data storage directory", var15);
      }

      this.h = new ewt($$12, $$2, $$0.F_());
      this.i = this.h.a(dim.a(), "chunks");
      this.a = new aqr($$0, $$1, $$2, $$3, $$4, this.g, this, $$5, $$9, $$10, $$11, this.i, $$6, $$8);
      this.f = this.a.d();
      this.c = this.a.j();
      this.c.b($$7);
      this.s();
   }

   public arr a() {
      return this.f;
   }

   @Nullable
   private aqp b(long $$0) {
      return this.a.b($$0);
   }

   public int b() {
      return this.a.h();
   }

   private void a(long $$0, @Nullable eaj $$1, ebk $$2) {
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
   public eaj a(int $$0, int $$1, ebk $$2, boolean $$3) {
      if (Thread.currentThread() != this.e) {
         return CompletableFuture.<eaj>supplyAsync(() -> this.a($$0, $$1, $$2, $$3), this.g).join();
      } else {
         bqb $$4 = bqa.a();
         $$4.f("getChunk");
         long $$5 = dgw.c($$0, $$1);

         for (int $$6 = 0; $$6 < 4; $$6++) {
            if ($$5 == this.n[$$6] && $$2 == this.o[$$6]) {
               eaj $$7 = this.p[$$6];
               if ($$7 != null || !$$3) {
                  return $$7;
               }
            }
         }

         $$4.f("getChunkCacheMiss");
         CompletableFuture<aqs<eaj>> $$8 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$8::isDone);
         aqs<eaj> $$9 = $$8.join();
         eaj $$10 = $$9.b(null);
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
   public eat a(int $$0, int $$1) {
      if (Thread.currentThread() != this.e) {
         return null;
      } else {
         bqa.a().f("getChunkNow");
         long $$2 = dgw.c($$0, $$1);

         for (int $$3 = 0; $$3 < 4; $$3++) {
            if ($$2 == this.n[$$3] && this.o[$$3] == ebk.n) {
               eaj $$4 = this.p[$$3];
               return $$4 instanceof eat ? (eat)$$4 : null;
            }
         }

         aqp $$5 = this.b($$2);
         if ($$5 == null) {
            return null;
         } else {
            eaj $$6 = $$5.b(ebk.n);
            if ($$6 != null) {
               this.a($$2, $$6, ebk.n);
               if ($$6 instanceof eat) {
                  return (eat)$$6;
               }
            }

            return null;
         }
      }
   }

   private void s() {
      Arrays.fill(this.n, dgw.c);
      Arrays.fill(this.o, null);
      Arrays.fill(this.p, null);
   }

   public CompletableFuture<aqs<eaj>> b(int $$0, int $$1, ebk $$2, boolean $$3) {
      boolean $$4 = Thread.currentThread() == this.e;
      CompletableFuture<aqs<eaj>> $$5;
      if ($$4) {
         $$5 = this.c($$0, $$1, $$2, $$3);
         this.g.b($$5::isDone);
      } else {
         $$5 = CompletableFuture.<CompletableFuture<aqs<eaj>>>supplyAsync(() -> this.c($$0, $$1, $$2, $$3), this.g).thenCompose($$0x -> $$0x);
      }

      return $$5;
   }

   private CompletableFuture<aqs<eaj>> c(int $$0, int $$1, ebk $$2, boolean $$3) {
      dgw $$4 = new dgw($$0, $$1);
      long $$5 = $$4.a();
      int $$6 = aqq.a($$2);
      aqp $$7 = this.b($$5);
      if ($$3) {
         this.a(new art(aru.i, $$6), $$4);
         if (this.a($$7, $$6)) {
            bqb $$8 = bqa.a();
            $$8.a("chunkLoad");
            this.t();
            $$7 = this.b($$5);
            $$8.c();
            if (this.a($$7, $$6)) {
               throw (IllegalStateException)af.b(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.a($$7, $$6) ? ard.c : $$7.a($$2, this.a);
   }

   private boolean a(@Nullable aqp $$0, int $$1) {
      return $$0 == null || $$0.j() > $$1;
   }

   @Override
   public boolean b(int $$0, int $$1) {
      aqp $$2 = this.b(new dgw($$0, $$1).a());
      int $$3 = aqq.a(ebk.n);
      return !this.a($$2, $$3);
   }

   @Nullable
   @Override
   public eav c(int $$0, int $$1) {
      long $$2 = dgw.c($$0, $$1);
      aqp $$3 = this.b($$2);
      return $$3 == null ? null : $$3.a(ebk.k.c());
   }

   public dhp c() {
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
         aqp $$1 = this.b($$0);
         return $$1 == null ? false : $$1.a().getNow(aqp.a).a();
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
      bqb $$2 = bqa.a();
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
         bqb $$2 = bqa.a();
         $$2.a("pollingChunks");
         if (this.d.u().i()) {
            List<eat> $$3 = this.q;

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

   private void a(bqb $$0) {
      $$0.a("broadcast");

      for (aqp $$1 : this.r) {
         eat $$2 = $$1.d();
         if ($$2 != null) {
            $$1.a($$2);
         }
      }

      this.r.clear();
      $$0.c();
   }

   private void a(List<eat> $$0) {
      this.a.a($$1 -> {
         eat $$2 = $$1.d();
         if ($$2 != null && this.d.b($$1.r())) {
            $$0.add($$2);
         }
      });
   }

   private void a(bqb $$0, long $$1, List<eat> $$2) {
      $$0.b("naturalSpawnCount");
      int $$3 = this.c.a();
      dia.d $$4 = dia.a($$3, this.d.C(), this::a, new dhz(this.a));
      this.s = $$4;
      $$0.b("spawnAndTick");
      boolean $$5 = this.d.O().c(dhl.e);
      int $$6 = this.d.O().d(dhl.o);
      List<bwu> $$8;
      if ($$5 && (this.k || this.l)) {
         boolean $$7 = this.d.y_().c() % 400L == 0L;
         $$8 = dia.a($$4, this.l, this.k, $$7);
      } else {
         $$8 = List.of();
      }

      for (eat $$10 : $$2) {
         dgw $$11 = $$10.f();
         $$10.b($$1);
         if (!$$8.isEmpty() && this.d.A_().a($$11)) {
            dia.a(this.d, $$10, $$4, $$8);
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

   private void a(long $$0, Consumer<eat> $$1) {
      aqp $$2 = this.b($$0);
      if ($$2 != null) {
         $$2.c().getNow(aqp.a).a($$1);
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

   public eak g() {
      return this.a.a();
   }

   public eal h() {
      return this.a.b();
   }

   public eez i() {
      return this.a.c();
   }

   @Override
   public int j() {
      return this.a.i();
   }

   public void a(jj $$0) {
      int $$1 = kl.a($$0.u());
      int $$2 = kl.a($$0.w());
      aqp $$3 = this.b(dgw.c($$1, $$2));
      if ($$3 != null && $$3.a($$0)) {
         this.r.add($$3);
      }
   }

   @Override
   public void a(dhy $$0, kl $$1) {
      this.g.execute(() -> {
         aqp $$2 = this.b($$1.r().a());
         if ($$2 != null && $$2.a($$0, $$1.b())) {
            this.r.add($$2);
         }
      });
   }

   public void a(art $$0, dgw $$1) {
      this.i.a($$0, $$1);
   }

   public void a(aru $$0, dgw $$1, int $$2) {
      this.i.a($$0, $$1, $$2);
   }

   public void b(aru $$0, dgw $$1, int $$2) {
      this.i.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgw $$0, boolean $$1) {
      return this.i.a($$0, $$1);
   }

   @Override
   public LongSet k() {
      return this.i.f();
   }

   public void a(aro $$0) {
      if (!$$0.dQ()) {
         this.a.a($$0);
      }
   }

   public void a(bvs $$0) {
      this.a.b($$0);
   }

   public void b(bvs $$0) {
      this.a.a($$0);
   }

   public void a(bvs $$0, zc<?> $$1) {
      this.a.b($$0, $$1);
   }

   public void b(bvs $$0, zc<?> $$1) {
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

   public String a(dgw $$0) {
      return this.a.a($$0);
   }

   public ewt l() {
      return this.h;
   }

   public cht m() {
      return this.a.m();
   }

   public ebs n() {
      return this.a.p();
   }

   @Nullable
   @bar
   public dia.d o() {
      return this.s;
   }

   public void p() {
      this.i.e();
   }

   public void a(aqp $$0) {
      if ($$0.i()) {
         this.r.add($$0);
      }
   }

   final class a extends bsf<Runnable> {
      a(final dhp $$0) {
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
         return ark.this.e;
      }

      @Override
      protected void d(Runnable $$0) {
         bqa.a().f("runTask");
         super.d($$0);
      }

      @Override
      protected boolean B() {
         if (ark.this.t()) {
            return true;
         } else {
            ark.this.f.b();
            return super.B();
         }
      }
   }
}
