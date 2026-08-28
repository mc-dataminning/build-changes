import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avt<T> implements avi {
   @Override
   public final CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, brl.a()), $$2)
         .thenCompose($$0::wait)
         .thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, brl.a()), $$3);
   }

   protected abstract T b(avo var1, brm var2);

   protected abstract void a(T var1, avo var2, brm var3);
}
