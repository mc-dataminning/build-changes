import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class atw<T> implements atl {
   @Override
   public final CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(atr var1, bma var2);

   protected abstract void a(T var1, atr var2, bma var3);
}
