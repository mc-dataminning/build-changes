import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class anu<T> implements anj {
   @Override
   public final CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(anp var1, bdk var2);

   protected abstract void a(T var1, anp var2, bdk var3);
}
