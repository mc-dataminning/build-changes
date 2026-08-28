import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class arb {
   private static final List<dxp> a = dxp.a();
   private static final aqq<dwo> e = aqq.a("Not done yet");
   public static final aqq<dwo> b = aqq.a("Unloaded chunk");
   public static final CompletableFuture<aqq<dwo>> c = CompletableFuture.completedFuture(b);
   protected final ddp d;
   @Nullable
   private volatile dxp f;
   private final AtomicReference<dxp> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<aqq<dwo>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<aqm> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();

   public arb(ddp $$0) {
      this.d = $$0;
   }

   public CompletableFuture<aqq<dwo>> a(dxp $$0, aqp $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<aqq<dwo>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            aqm $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<aqq<dwo>> a(dxs $$0, ara $$1, azz<arb> $$2) {
      if (this.f($$0.a())) {
         return c;
      } else {
         return this.e($$0.a()) ? $$1.a(this, $$0, $$2).handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o $$3 = o.a($$2x, "Exception chunk generation/loading");
               MinecraftServer.a(new z($$3));
            } else {
               this.a($$0.a(), $$1x);
            }

            return aqq.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(aqp $$0) {
      dxp $$1 = this.f;
      dxp $$2 = aqo.a(this.i());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(dwx $$0) {
      CompletableFuture<aqq<dwo>> $$1 = CompletableFuture.completedFuture(aqq.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<aqq<dwo>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         dwo $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof dxi)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(aqm $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(aqp $$0, @Nullable dxp $$1) {
      aqm $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.r());
      } else {
         $$2 = null;
      }

      aqm $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<aqq<dwo>> c(dxp $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<aqq<dwo>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<aqq<dwo>> $$3 = new CompletableFuture<>();
            $$2 = this.h.compareAndExchange($$1, null, $$3);
            if ($$2 == null) {
               if (this.f($$0)) {
                  this.a($$1, $$3);
                  return c;
               }

               return $$3;
            }
         }

         return $$2;
      }
   }

   private void a(@Nullable dxp $$0, dxp $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<aqq<dwo>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<aqq<dwo>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(dxp $$0, dwo $$1) {
      aqq<dwo> $$2 = aqq.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<aqq<dwo>> $$4 = this.h.get($$3);
         if ($$4 == null) {
            if (this.h.compareAndSet($$3, null, CompletableFuture.completedFuture($$2))) {
               return;
            }
         } else {
            if ($$4.complete($$2)) {
               return;
            }

            if ($$4.getNow(e).a()) {
               throw new IllegalStateException("Trying to complete a future but found it to be completed successfully already");
            }

            Thread.yield();
         }
      }
   }

   @Nullable
   private dxp d(@Nullable dxp $$0) {
      if ($$0 == null) {
         return null;
      } else {
         dxp $$1 = $$0;

         for (dxp $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == dxp.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(dxp $$0) {
      dxp $$1 = $$0 == dxp.c ? null : $$0.c();
      dxp $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(dxp $$0) {
      dxp $$1 = this.f;
      return $$1 == null || $$0.b($$1);
   }

   public void m() {
      this.j.incrementAndGet();
   }

   public void n() {
      int $$0 = this.j.decrementAndGet();
      if ($$0 < 0) {
         throw new IllegalStateException("More releases than claims. Count: " + $$0);
      }
   }

   public int o() {
      return this.j.get();
   }

   @Nullable
   public dwo a(dxp $$0) {
      CompletableFuture<aqq<dwo>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public dwo b(dxp $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public dwo p() {
      dxp $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         dwo $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public dxp q() {
      CompletableFuture<aqq<dwo>> $$0 = this.h.get(dxp.c.b());
      dwo $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.j();
   }

   public ddp r() {
      return this.d;
   }

   public aqz s() {
      return aqo.c(this.i());
   }

   public abstract int i();

   public abstract int j();

   @bal
   public List<Pair<dxp, CompletableFuture<aqq<dwo>>>> t() {
      List<Pair<dxp, CompletableFuture<aqq<dwo>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @bal
   public dxp u() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         dxp $$1 = a.get($$0);
         dwo $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
