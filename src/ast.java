import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ast<T> implements asi {
   @Override
   public final CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aso var1, bjq var2);

   protected abstract void a(T var1, aso var2, bjq var3);
}
