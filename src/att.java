import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class att<T> implements ati {
   @Override
   public final CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(ato var1, ble var2);

   protected abstract void a(T var1, ato var2, ble var3);
}
