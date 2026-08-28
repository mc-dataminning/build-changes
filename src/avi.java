import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avi<T> implements auw {
   @Override
   public final CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bql.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bql.a()), $$3);
   }

   protected abstract T b(avd var1, bqm var2);

   protected abstract void a(T var1, avd var2, bqm var3);
}
