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

public abstract class ary {
   private static final List<eaq> a = eaq.a();
   private static final arn<dzp> e = arn.a("Not done yet");
   public static final arn<dzp> b = arn.a("Unloaded chunk");
   public static final CompletableFuture<arn<dzp>> c = CompletableFuture.completedFuture(b);
   protected final dgn d;
   @Nullable
   private volatile eaq f;
   private final AtomicReference<eaq> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<arn<dzp>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<arj> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();
   private volatile CompletableFuture<Void> k = CompletableFuture.completedFuture(null);

   public ary(dgn $$0) {
      this.d = $$0;
   }

   public CompletableFuture<arn<dzp>> a(eaq $$0, arm $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<arn<dzp>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            arj $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<arn<dzp>> a(eat $$0, arx $$1, bay<ary> $$2) {
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

            return arn.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(arm $$0) {
      eaq $$1 = this.f;
      eaq $$2 = arl.a(this.i());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(dzy $$0) {
      CompletableFuture<arn<dzp>> $$1 = CompletableFuture.completedFuture(arn.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<arn<dzp>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         dzp $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof eaj)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(arj $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(arm $$0, @Nullable eaq $$1) {
      arj $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.q());
      } else {
         $$2 = null;
      }

      arj $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<arn<dzp>> c(eaq $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<arn<dzp>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<arn<dzp>> $$3 = new CompletableFuture<>();
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

   private void a(@Nullable eaq $$0, eaq $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<arn<dzp>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<arn<dzp>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(eaq $$0, dzp $$1) {
      arn<dzp> $$2 = arn.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<arn<dzp>> $$4 = this.h.get($$3);
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
   private eaq d(@Nullable eaq $$0) {
      if ($$0 == null) {
         return null;
      } else {
         eaq $$1 = $$0;

         for (eaq $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == eaq.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(eaq $$0) {
      eaq $$1 = $$0 == eaq.c ? null : $$0.c();
      eaq $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(eaq $$0) {
      eaq $$1 = this.f;
      return $$1 == null || $$0.b($$1);
   }

   protected abstract void b(CompletableFuture<?> var1);

   public void m() {
      if (this.j.getAndIncrement() == 0) {
         this.k = new CompletableFuture<>();
         this.b(this.k);
      }
   }

   public void n() {
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
   public dzp a(eaq $$0) {
      CompletableFuture<arn<dzp>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public dzp b(eaq $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public dzp o() {
      eaq $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         dzp $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public eaq p() {
      CompletableFuture<arn<dzp>> $$0 = this.h.get(eaq.c.b());
      dzp $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.n();
   }

   public dgn q() {
      return this.d;
   }

   public arw r() {
      return arl.c(this.i());
   }

   public abstract int i();

   public abstract int j();

   @bbl
   public List<Pair<eaq, CompletableFuture<arn<dzp>>>> s() {
      List<Pair<eaq, CompletableFuture<arn<dzp>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @bbl
   public eaq t() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         eaq $$1 = a.get($$0);
         dzp $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
