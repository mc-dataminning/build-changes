import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aub<T> implements atq {
   @Override
   public final CompletableFuture<Void> a(atq.a $$0, atw $$1, bmu $$2, bmu $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(atw var1, bmu var2);

   protected abstract void a(T var1, atw var2, bmu var3);
}
