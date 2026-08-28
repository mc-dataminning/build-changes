import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avk<T> implements auz {
   @Override
   public final CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bra.a()), $$2)
         .thenCompose($$0::wait)
         .thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bra.a()), $$3);
   }

   protected abstract T b(avf var1, brb var2);

   protected abstract void a(T var1, avf var2, brb var3);
}
