import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avg<T> implements auu {
   @Override
   public final CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bom.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bom.a()), $$3);
   }

   protected abstract T b(avb var1, bon var2);

   protected abstract void a(T var1, avb var2, bon var3);
}
