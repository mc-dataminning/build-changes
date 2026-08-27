import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aoy<T> implements aon {
   @Override
   public final CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aot var1, bes var2);

   protected abstract void a(T var1, aot var2, bes var3);
}
