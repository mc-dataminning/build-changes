import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class anz<T> implements ano {
   @Override
   public final CompletableFuture<Void> a(ano.a $$0, anu $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(anu var1, bdp var2);

   protected abstract void a(T var1, anu var2, bdp var3);
}
