import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class atz<T> implements ato {
   @Override
   public final CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(atu var1, bmr var2);

   protected abstract void a(T var1, atu var2, bmr var3);
}
