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

public abstract class aqu {
   private static final List<dzt> a = dzt.a();
   private static final aqj<dys> e = aqj.a("Not done yet");
   public static final aqj<dys> b = aqj.a("Unloaded chunk");
   public static final CompletableFuture<aqj<dys>> c = CompletableFuture.completedFuture(b);
   protected final dfo d;
   @Nullable
   private volatile dzt f;
   private final AtomicReference<dzt> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<aqj<dys>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<aqf> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();
   private volatile CompletableFuture<Void> k = CompletableFuture.completedFuture(null);

   public aqu(dfo $$0) {
      this.d = $$0;
      if ($$0.a(dfo.e) > dfo.d) {
         throw new IllegalStateException("Trying to create chunk out of reasonable bounds: " + $$0);
      }
   }

   public CompletableFuture<aqj<dys>> a(dzt $$0, aqi $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<aqj<dys>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            aqf $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<aqj<dys>> a(dzw $$0, aqt $$1, azt<aqu> $$2) {
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

            return aqj.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(aqi $$0) {
      dzt $$1 = this.f;
      dzt $$2 = aqh.a(this.j());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(dzb $$0) {
      CompletableFuture<aqj<dys>> $$1 = CompletableFuture.completedFuture(aqj.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<aqj<dys>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         dys $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof dzm)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(aqf $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(aqi $$0, @Nullable dzt $$1) {
      aqf $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.r());
      } else {
         $$2 = null;
      }

      aqf $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<aqj<dys>> c(dzt $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<aqj<dys>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<aqj<dys>> $$3 = new CompletableFuture<>();
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

   private void a(@Nullable dzt $$0, dzt $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<aqj<dys>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<aqj<dys>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(dzt $$0, dys $$1) {
      aqj<dys> $$2 = aqj.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<aqj<dys>> $$4 = this.h.get($$3);
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
   private dzt d(@Nullable dzt $$0) {
      if ($$0 == null) {
         return null;
      } else {
         dzt $$1 = $$0;

         for (dzt $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == dzt.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(dzt $$0) {
      dzt $$1 = $$0 == dzt.c ? null : $$0.c();
      dzt $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(dzt $$0) {
      dzt $$1 = this.f;
      return $$1 == null || $$0.b($$1);
   }

   protected abstract void b(CompletableFuture<?> var1);

   public void n() {
      if (this.j.getAndIncrement() == 0) {
         this.k = new CompletableFuture<>();
         this.b(this.k);
      }
   }

   public void o() {
      CompletableFuture<Void> $$0 = this.k;
      int $$1 = this.j.decrementAndGet();
      if ($$1 == 0) {
         $$0.complete(null);
      }

      if ($$1 < 0) {
         throw new IllegalStateException("More releases than claims. Count: " + $$1);
      }
   }

   @Nullable
   public dys a(dzt $$0) {
      CompletableFuture<aqj<dys>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public dys b(dzt $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public dys p() {
      dzt $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         dys $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public dzt q() {
      CompletableFuture<aqj<dys>> $$0 = this.h.get(dzt.c.b());
      dys $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.n();
   }

   public dfo r() {
      return this.d;
   }

   public aqs s() {
      return aqh.c(this.j());
   }

   public abstract int j();

   public abstract int k();

   @bag
   public List<Pair<dzt, CompletableFuture<aqj<dys>>>> t() {
      List<Pair<dzt, CompletableFuture<aqj<dys>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @bag
   public dzt u() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         dzt $$1 = a.get($$0);
         dys $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
