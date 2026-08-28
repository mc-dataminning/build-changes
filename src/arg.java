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

public abstract class arg {
   private static final List<edr> a = edr.a();
   private static final aqv<ecq> e = aqv.a("Not done yet");
   public static final aqv<ecq> b = aqv.a("Unloaded chunk");
   public static final CompletableFuture<aqv<ecq>> c = CompletableFuture.completedFuture(b);
   protected final dir d;
   @Nullable
   private volatile edr f;
   private final AtomicReference<edr> g = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<aqv<ecq>>> h = new AtomicReferenceArray<>(a.size());
   private final AtomicReference<aqr> i = new AtomicReference<>();
   private final AtomicInteger j = new AtomicInteger();
   private volatile CompletableFuture<Void> k = CompletableFuture.completedFuture(null);

   public arg(dir $$0) {
      this.d = $$0;
      if ($$0.a(dir.e) > dir.d) {
         throw new IllegalStateException("Trying to create chunk out of reasonable bounds: " + $$0);
      }
   }

   public CompletableFuture<aqv<ecq>> a(edr $$0, aqu $$1) {
      if (this.f($$0)) {
         return c;
      } else {
         CompletableFuture<aqv<ecq>> $$2 = this.c($$0);
         if ($$2.isDone()) {
            return $$2;
         } else {
            aqr $$3 = this.i.get();
            if ($$3 == null || $$0.b($$3.a)) {
               this.a($$1, $$0);
            }

            return $$2;
         }
      }
   }

   CompletableFuture<aqv<ecq>> a(edu $$0, arf $$1, bai<arg> $$2) {
      if (this.f($$0.a())) {
         return c;
      } else {
         return this.e($$0.a()) ? $$1.a(this, $$0, $$2).handle(($$1x, $$2x) -> {
            if ($$2x != null) {
               p $$3 = p.a($$2x, "Exception chunk generation/loading");
               MinecraftServer.a(new aa($$3));
            } else {
               this.a($$0.a(), $$1x);
            }

            return aqv.a($$1x);
         }) : this.c($$0.a());
      }
   }

   protected void a(aqu $$0) {
      edr $$1 = this.f;
      edr $$2 = aqt.a(this.j());
      this.f = $$2;
      boolean $$3 = $$1 != null && ($$2 == null || $$2.d($$1));
      if ($$3) {
         this.a($$2, $$1);
         if (this.i.get() != null) {
            this.a($$0, this.d($$2));
         }
      }
   }

   public void a(ecz $$0) {
      CompletableFuture<aqv<ecq>> $$1 = CompletableFuture.completedFuture(aqv.a($$0));

      for (int $$2 = 0; $$2 < this.h.length() - 1; $$2++) {
         CompletableFuture<aqv<ecq>> $$3 = this.h.get($$2);
         Objects.requireNonNull($$3);
         ecq $$4 = $$3.getNow(e).b(null);
         if (!($$4 instanceof edk)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + $$4);
         }

         if (!this.h.compareAndSet($$2, $$3, $$1)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void a(aqr $$0) {
      this.i.compareAndSet($$0, null);
   }

   private void a(aqu $$0, @Nullable edr $$1) {
      aqr $$2;
      if ($$1 != null) {
         $$2 = $$0.a($$1, this.r());
      } else {
         $$2 = null;
      }

      aqr $$4 = this.i.getAndSet($$2);
      if ($$4 != null) {
         $$4.b();
      }
   }

   private CompletableFuture<aqv<ecq>> c(edr $$0) {
      if (this.f($$0)) {
         return c;
      } else {
         int $$1 = $$0.b();
         CompletableFuture<aqv<ecq>> $$2 = this.h.get($$1);

         while ($$2 == null) {
            CompletableFuture<aqv<ecq>> $$3 = new CompletableFuture<>();
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

   private void a(@Nullable edr $$0, edr $$1) {
      int $$2 = $$0 == null ? 0 : $$0.b() + 1;
      int $$3 = $$1.b();

      for (int $$4 = $$2; $$4 <= $$3; $$4++) {
         CompletableFuture<aqv<ecq>> $$5 = this.h.get($$4);
         if ($$5 != null) {
            this.a($$4, $$5);
         }
      }
   }

   private void a(int $$0, CompletableFuture<aqv<ecq>> $$1) {
      if ($$1.complete(b) && !this.h.compareAndSet($$0, $$1, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void a(edr $$0, ecq $$1) {
      aqv<ecq> $$2 = aqv.a($$1);
      int $$3 = $$0.b();

      while (true) {
         CompletableFuture<aqv<ecq>> $$4 = this.h.get($$3);
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
   private edr d(@Nullable edr $$0) {
      if ($$0 == null) {
         return null;
      } else {
         edr $$1 = $$0;

         for (edr $$2 = this.g.get(); $$2 == null || $$1.b($$2); $$1 = $$1.c()) {
            if (this.h.get($$1.b()) != null) {
               return $$1;
            }

            if ($$1 == edr.c) {
               break;
            }
         }

         return null;
      }
   }

   private boolean e(edr $$0) {
      edr $$1 = $$0 == edr.c ? null : $$0.c();
      edr $$2 = this.g.compareAndExchange($$1, $$0);
      if ($$2 == $$1) {
         return true;
      } else if ($$2 != null && !$$0.b($$2)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + $$2 + " while trying to start: " + $$0);
      }
   }

   private boolean f(edr $$0) {
      edr $$1 = this.f;
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
   public ecq a(edr $$0) {
      CompletableFuture<aqv<ecq>> $$1 = this.h.get($$0.b());
      return $$1 == null ? null : $$1.getNow(e).b(null);
   }

   @Nullable
   public ecq b(edr $$0) {
      return this.f($$0) ? null : this.a($$0);
   }

   @Nullable
   public ecq p() {
      edr $$0 = this.g.get();
      if ($$0 == null) {
         return null;
      } else {
         ecq $$1 = this.a($$0);
         return $$1 != null ? $$1 : this.a($$0.c());
      }
   }

   @Nullable
   public edr q() {
      CompletableFuture<aqv<ecq>> $$0 = this.h.get(edr.c.b());
      ecq $$1 = $$0 == null ? null : $$0.getNow(e).b(null);
      return $$1 == null ? null : $$1.n();
   }

   public dir r() {
      return this.d;
   }

   public are s() {
      return aqt.c(this.j());
   }

   public abstract int j();

   public abstract int k();

   @bav
   public List<Pair<edr, CompletableFuture<aqv<ecq>>>> t() {
      List<Pair<edr, CompletableFuture<aqv<ecq>>>> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < a.size(); $$1++) {
         $$0.add(Pair.of(a.get($$1), this.h.get($$1)));
      }

      return $$0;
   }

   @Nullable
   @bav
   public edr u() {
      for (int $$0 = a.size() - 1; $$0 >= 0; $$0--) {
         edr $$1 = a.get($$0);
         ecq $$2 = this.a($$1);
         if ($$2 != null) {
            return $$1;
         }
      }

      return null;
   }
}
