import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avf<T> implements aut {
   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(ava var1, bok var2);

   protected abstract void a(T var1, ava var2, bok var3);
}
