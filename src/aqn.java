import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class aqn<S> implements aqd {
   private static final int c = 2;
   private static final int d = 2;
   private static final int e = 1;
   protected final CompletableFuture<avr> a = new CompletableFuture<>();
   protected CompletableFuture<List<S>> b;
   final Set<aqb> f;
   private final int g;
   private int h;
   private int i;
   private final AtomicInteger j = new AtomicInteger();
   private final AtomicInteger k = new AtomicInteger();

   public static aqn<Void> a(aqh $$0, List<aqb> $$1, Executor $$2, Executor $$3, CompletableFuture<avr> $$4) {
      return new aqn<>($$2, $$3, $$0, $$1, ($$1x, $$2x, $$3x, $$4x, $$5) -> $$3x.a($$1x, $$2x, bgo.a, bgo.a, $$2, $$5), $$4);
   }

   protected aqn(Executor $$0, final Executor $$1, aqh $$2, List<aqb> $$3, aqn.a<S> $$4, CompletableFuture<avr> $$5) {
      this.g = $$3.size();
      this.j.incrementAndGet();
      $$5.thenRun(this.k::incrementAndGet);
      List<CompletableFuture<S>> $$6 = Lists.newArrayList();
      CompletableFuture<?> $$7 = $$5;
      this.f = Sets.newHashSet($$3);

      for (final aqb $$8 : $$3) {
         final CompletableFuture<?> $$9 = $$7;
         CompletableFuture<S> $$10 = $$4.create(new aqb.a() {
            @Override
            public <T> CompletableFuture<T> a(T $$0) {
               $$1.execute(() -> {
                  aqn.this.f.remove($$8);
                  if (aqn.this.f.isEmpty()) {
                     aqn.this.a.complete(avr.a);
                  }
               });
               return aqn.this.a.thenCombine((CompletionStage<? extends T>)$$9, ($$1xx, $$2) -> $$0);
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

      this.b = ac.c($$6);
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

   public static aqd a(aqh $$0, List<aqb> $$1, Executor $$2, Executor $$3, CompletableFuture<avr> $$4, boolean $$5) {
      return (aqd)($$5 ? new aqc($$0, $$1, $$2, $$3, $$4) : a($$0, $$1, $$2, $$3, $$4));
   }

   protected interface a<S> {
      CompletableFuture<S> create(aqb.a var1, aqh var2, aqb var3, Executor var4, Executor var5);
   }
}
