import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class asf<T> implements aru {
   @Override
   public final CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(asa var1, bil var2);

   protected abstract void a(T var1, asa var2, bil var3);
}
