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

public abstract class are {
   private static final List<dya> a = dya.a();
   private static final aqt<dwz> e = aqt.a("Not done yet");
   public static final aqt<dwz> b = aqt.a("Unloaded chunk");
   public static final CompletableFuture<aqt<dwz>> c = CompletableFuture.completedFuture(b);
   protected final deb d;
   @Nullable
   private volatile dya f;
   private final AtomicReference<dya> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<aqt<dwz>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<aqp> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();
   private volatile CompletableFuture<Void> k = CompletableFuture.completedFuture(null);

   public are(deb $$0) {
      this.d = $$0;
   }

   public CompletableFuture<aqt<dwz>> a(dya $$0, aqs $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<aqt<dwz>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            aqp $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<aqt<dwz>> a(dyd $$0, ard $$1, bad<are> $$2) {
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

            return aqt.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(aqs $$0) {
      dya $$1 = this.f;
      dya $$2 = aqr.a(this.i());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(dxi $$0) {
      CompletableFuture<aqt<dwz>> $$1 = CompletableFuture.completedFuture(aqt.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<aqt<dwz>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         dwz $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof dxt)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(aqp $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(aqs $$0, @Nullable dya $$1) {
      aqp $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.q());
      } else {
         $$2 = null;
      }

      aqp $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<aqt<dwz>> c(dya $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<aqt<dwz>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<aqt<dwz>> $$3 = new CompletableFuture<>();
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

   private void a(@Nullable dya $$0, dya $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<aqt<dwz>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<aqt<dwz>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(dya $$0, dwz $$1) {
      aqt<dwz> $$2 = aqt.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<aqt<dwz>> $$4 = this.h.get($$3);
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
   private dya d(@Nullable dya $$0) {
      if ($$0 == null) {
         return null;
      } else {
         dya $$1 = $$0;

         for (dya $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == dya.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(dya $$0) {
      dya $$1 = $$0 == dya.c ? null : $$0.c();
      dya $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(dya $$0) {
      dya $$1 = this.f;
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
   public dwz a(dya $$0) {
      CompletableFuture<aqt<dwz>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public dwz b(dya $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public dwz o() {
      dya $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         dwz $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public dya p() {
      CompletableFuture<aqt<dwz>> $$0 = this.h.get(dya.c.b());
      dwz $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.j();
   }

   public deb q() {
      return this.d;
   }

   public arc r() {
      return aqr.c(this.i());
   }

   public abstract int i();

   public abstract int j();

   @bap
   public List<Pair<dya, CompletableFuture<aqt<dwz>>>> s() {
      List<Pair<dya, CompletableFuture<aqt<dwz>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @bap
   public dya t() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         dya $$1 = a.get($$0);
         dwz $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
