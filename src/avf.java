import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avf<T> implements aut {
   @Override
   public final CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bqa.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bqa.a()), $$3);
   }

   protected abstract T b(ava var1, bqb var2);

   protected abstract void a(T var1, ava var2, bqb var3);
}
