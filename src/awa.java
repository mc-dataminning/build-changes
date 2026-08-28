import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class awa<T> implements avp {
   @Override
   public final CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bpr.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bpr.a()), $$3);
   }

   protected abstract T b(avv var1, bps var2);

   protected abstract void a(T var1, avv var2, bps var3);
}
