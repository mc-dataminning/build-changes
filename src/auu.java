import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auu<T> implements auj {
   @Override
   public final CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bos.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bos.a()), $$3);
   }

   protected abstract T b(aup var1, bot var2);

   protected abstract void a(T var1, aup var2, bot var3);
}
