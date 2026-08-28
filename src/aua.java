import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class aua<S> implements atq {
   private static final int c = 2;
   private static final int d = 2;
   private static final int e = 1;
   protected final CompletableFuture<azh> a = new CompletableFuture<>();
   protected CompletableFuture<List<S>> b;
   final Set<ato> f;
   private final int g;
   private int h;
   private int i;
   private final AtomicInteger j = new AtomicInteger();
   private final AtomicInteger k = new AtomicInteger();

   public static aua<Void> a(atu $$0, List<ato> $$1, Executor $$2, Executor $$3, CompletableFuture<azh> $$4) {
      return new aua<>($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> $$3x.a($$1x, $$2x, bmo.a, bmo.a, $$2, $$5), $$4);
   }

   protected aua(Executor $$0, final Executor $$1, atu $$2, List<ato> $$3, aua.a<S> $$4, CompletableFuture<azh> $$5) {
      this.g = $$3.size();
      this.j.incrementAndGet();
      $$5.thenRun(this.k::incrementAndGet);
      List<CompletableFuture<S>> $$6 = Lists.newArrayList();
      CompletableFuture<?> $$7 = $$5;
      this.f = Sets.newHashSet($$3);

      for (final ato $$8 : $$3) {
         final CompletableFuture<?> $$9 = $$7;
         CompletableFuture<S> $$10 = $$4.create(new ato.a() {
            @Override
            public <T> CompletableFuture<T> a(T $$0) {
               $$1.execute(() -> {
                  aua.this.f.remove($$8);
                  if (aua.this.f.isEmpty()) {
                     aua.this.a.complete(azh.a);
                  }
               });
               return aua.this.a.thenCombine((CompletionStage<? extends T>)$$9, ($$1xx, $$2) -> $$0);
            }
         }, $$2, $$8, $$1x -> {
            this.j.incrementAndGet();
            $$0.execute(() -> {
               $$1x.run();
               this.k.incrementAndGet();
            });
         }, $$1x -> {
            this.h++;
            $$1.execute(() -> {
               $$1x.run();
               this.i++;
            });
         });
         $$6.add($$10);
         $$7 = $$10;
      }

      this.b = ac.e($$6);
   }

   @Override
   public CompletableFuture<?> a() {
      return this.b;
   }

   @Override
   public float b() {
      int $$0 = this.g - this.f.size();
      float $$1 = (float)(this.k.get() * 2 + this.i * 2 + $$0 * 1);
      float $$2 = (float)(this.j.get() * 2 + this.h * 2 + this.g * 1);
      return $$1 / $$2;
   }

   public static atq a(atu $$0, List<ato> $$1, Executor $$2, Executor $$3, CompletableFuture<azh> $$4, boolean $$5) {
      return (atq)($$5 ? new atp($$0, $$1, $$2, $$3, $$4) : a($$0, $$1, $$2, $$3, $$4));
   }

   protected interface a<S> {
      CompletableFuture<S> create(ato.a var1, atu var2, ato var3, Executor var4, Executor var5);
   }
}
