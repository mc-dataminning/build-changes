import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avj<T> implements auy {
   @Override
   public final CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, boq.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, boq.a()), $$3);
   }

   protected abstract T b(ave var1, bor var2);

   protected abstract void a(T var1, ave var2, bor var3);
}
