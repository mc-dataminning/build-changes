import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auq<T> implements auf {
   @Override
   public final CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aul var1, bnd var2);

   protected abstract void a(T var1, aul var2, bnd var3);
}
