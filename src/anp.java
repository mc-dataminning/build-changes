import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class anp<T> implements ane {
   @Override
   public final CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(ank var1, bde var2);

   protected abstract void a(T var1, ank var2, bde var3);
}
