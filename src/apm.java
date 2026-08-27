import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class apm<T> implements apb {
   @Override
   public final CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aph var1, bfo var2);

   protected abstract void a(T var1, aph var2, bfo var3);
}
