import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auz<T> implements aun {
   @Override
   public final CompletableFuture<Void> a(aun.a $$0, aut $$1, bod $$2, bod $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aut var1, bod var2);

   protected abstract void a(T var1, aut var2, bod var3);
}
