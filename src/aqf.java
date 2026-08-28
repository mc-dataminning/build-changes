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

public abstract class aqf {
   private static final List<dvh> a = dvh.a();
   private static final apu<dug> e = apu.a("Not done yet");
   public static final apu<dug> b = apu.a("Unloaded chunk");
   public static final CompletableFuture<apu<dug>> c = CompletableFuture.completedFuture(b);
   protected final dbm d;
   @Nullable
   private volatile dvh f;
   private final AtomicReference<dvh> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<apu<dug>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<apq> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();

   public aqf(dbm $$0) {
      this.d = $$0;
   }

   public CompletableFuture<apu<dug>> a(dvh $$0, apt $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<apu<dug>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            apq $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<apu<dug>> a(dvk $$0, aqe $$1, aza<aqf> $$2) {
      if (this.f($$0.a())) {
         return c;
      } else {
         return this.e($$0.a()) ? $$1.a(this, $$0, $$2).handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               o $$3 = o.a($$2x, "Exception chunk generation/loading");
               MinecraftServer.a(new y($$3));
            } else {
               this.a($$0.a(), $$1x);
            }

            return apu.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(apt $$0) {
      dvh $$1 = this.f;
      dvh $$2 = aps.a(this.i());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(dup $$0) {
      CompletableFuture<apu<dug>> $$1 = CompletableFuture.completedFuture(apu.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<apu<dug>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         dug $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof dva)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(apq $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(apt $$0, @Nullable dvh $$1) {
      apq $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.r());
      } else {
         $$2 = null;
      }

      apq $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<apu<dug>> c(dvh $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<apu<dug>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<apu<dug>> $$3 = new CompletableFuture<>();
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

   private void a(@Nullable dvh $$0, dvh $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<apu<dug>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<apu<dug>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(dvh $$0, dug $$1) {
      apu<dug> $$2 = apu.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<apu<dug>> $$4 = this.h.get($$3);
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
   private dvh d(@Nullable dvh $$0) {
      if ($$0 == null) {
         return null;
      } else {
         dvh $$1 = $$0;

         for (dvh $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == dvh.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(dvh $$0) {
      dvh $$1 = $$0 == dvh.c ? null : $$0.c();
      dvh $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(dvh $$0) {
      dvh $$1 = this.f;
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
   public dug a(dvh $$0) {
      CompletableFuture<apu<dug>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public dug b(dvh $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public dug p() {
      dvh $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         dug $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public dvh q() {
      CompletableFuture<apu<dug>> $$0 = this.h.get(dvh.c.b());
      dug $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.j();
   }

   public dbm r() {
      return this.d;
   }

   public aqd s() {
      return aps.c(this.i());
   }

   public abstract int i();

   public abstract int j();

   @azl
   public List<Pair<dvh, CompletableFuture<apu<dug>>>> t() {
      List<Pair<dvh, CompletableFuture<apu<dug>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @azl
   public dvh u() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         dvh $$1 = a.get($$0);
         dug $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
