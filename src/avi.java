import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avi<T> implements auw {
   @Override
   public final CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bqp.a()), $$2)
         .thenCompose($$0::wait)
         .thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bqp.a()), $$3);
   }

   protected abstract T b(avd var1, bqq var2);

   protected abstract void a(T var1, avd var2, bqq var3);
}
