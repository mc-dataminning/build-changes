import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aoa<T> implements anp {
   @Override
   public final CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(anv var1, bdr var2);

   protected abstract void a(T var1, anv var2, bdr var3);
}
