import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auu<T> implements auj {
   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, bnj $$2, bnj $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aup var1, bnj var2);

   protected abstract void a(T var1, aup var2, bnj var3);
}
