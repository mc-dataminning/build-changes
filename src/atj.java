import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class atj<T> implements asy {
   @Override
   public final CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(ate var1, bkt var2);

   protected abstract void a(T var1, ate var2, bkt var3);
}
