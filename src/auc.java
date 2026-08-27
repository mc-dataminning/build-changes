import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auc<T> implements atr {
   @Override
   public final CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(atx var1, bmk var2);

   protected abstract void a(T var1, atx var2, bmk var3);
}
