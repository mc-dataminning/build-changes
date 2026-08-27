import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class apx<T> implements apm {
   @Override
   public final CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aps var1, bgc var2);

   protected abstract void a(T var1, aps var2, bgc var3);
}
