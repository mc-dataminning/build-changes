import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class any<T> implements ann {
   @Override
   public final CompletableFuture<Void> a(ann.a $$0, ant $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(ant var1, bdp var2);

   protected abstract void a(T var1, ant var2, bdp var3);
}
