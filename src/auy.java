import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auy<T> implements aum {
   @Override
   public final CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aus var1, bny var2);

   protected abstract void a(T var1, aus var2, bny var3);
}
