import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

public class avj<S> implements auz {
   private static final int a = 2;
   private static final int b = 2;
   private static final int c = 1;
   final CompletableFuture<bau> d = new CompletableFuture<>();
   @Nullable
   private CompletableFuture<List<S>> e;
   final Set<auw> f;
   private final int g;
   private final AtomicInteger h = new AtomicInteger();
   private final AtomicInteger i = new AtomicInteger();
   private final AtomicInteger j = new AtomicInteger();
   private final AtomicInteger k = new AtomicInteger();

   public static auz b(avd $$0, List<auw> $$1, Executor $$2, Executor $$3, CompletableFuture<bau> $$4) {
      avj<Void> $$5 = new avj<>($$1);
      $$5.b($$2, $$3, $$0, $$1, avj.a.a, $$4);
      return $$5;
   }

   protected avj(List<auw> $$0) {
      this.g = $$0.size();
      this.f = new HashSet<>($$0);
   }

   protected void b(Executor $$0, Executor $$1, avd $$2, List<auw> $$3, avj.a<S> $$4, CompletableFuture<?> $$5) {
      this.e = this.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected CompletableFuture<List<S>> a(Executor $$0, Executor $$1, avd $$2, List<auw> $$3, avj.a<S> $$4, CompletableFuture<?> $$5) {
      Executor $$6 = $$1x -> {
         this.h.incrementAndGet();
         $$0.execute(() -> {
            $$1x.run();
            this.i.incrementAndGet();
         });
      };
      Executor $$7 = $$1x -> {
         this.j.incrementAndGet();
         $$1.execute(() -> {
            $$1x.run();
            this.k.incrementAndGet();
         });
      };
      this.h.incrementAndGet();
      $$5.thenRun(this.i::incrementAndGet);
      CompletableFuture<?> $$8 = $$5;
      List<CompletableFuture<S>> $$9 = new ArrayList<>();

      for (auw $$10 : $$3) {
         auw.a $$11 = this.a($$10, $$8, $$1);
         CompletableFuture<S> $$12 = $$4.create($$11, $$2, $$10, $$6, $$7);
         $$9.add($$12);
         $$8 = $$12;
      }

      return ag.e($$9);
   }

   private auw.a a(final auw $$0, final CompletableFuture<?> $$1, final Executor $$2) {
      return new auw.a() {
         @Override
         public <T> CompletableFuture<T> wait(T $$0x) {
            $$2.execute(() -> {
               avj.this.f.remove($$0);
               if (avj.this.f.isEmpty()) {
                  avj.this.d.complete(bau.a);
               }
            });
            return avj.this.d.thenCombine((CompletionStage<? extends T>)$$1, ($$1xx, $$2xx) -> $$0);
         }
      };
   }

   @Override
   public CompletableFuture<?> a() {
      return Objects.requireNonNull(this.e, "not started");
   }

   @Override
   public float b() {
      int $$0 = this.g - this.f.size();
      float $$1 = (float)a(this.i.get(), this.k.get(), $$0);
      float $$2 = (float)a(this.h.get(), this.j.get(), this.g);
      return $$1 / $$2;
   }

   private static int a(int $$0, int $$1, int $$2) {
      return $$0 * 2 + $$1 * 2 + $$2 * 1;
   }

   public static auz a(avd $$0, List<auw> $$1, Executor $$2, Executor $$3, CompletableFuture<bau> $$4, boolean $$5) {
      return $$5 ? auy.a($$0, $$1, $$2, $$3, $$4) : b($$0, $$1, $$2, $$3, $$4);
   }

   @FunctionalInterface
   protected interface a<S> {
      avj.a<Void> a = ($$0, $$1, $$2, $$3, $$4) -> $$2.reload($$0, $$1, $$3, $$4);

      CompletableFuture<S> create(auw.a var1, avd var2, auw var3, Executor var4, Executor var5);
   }
}
