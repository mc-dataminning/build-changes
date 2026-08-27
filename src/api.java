import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class api<T> implements aox {
   @Override
   public final CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(apd var1, bfh var2);

   protected abstract void a(T var1, apd var2, bfh var3);
}
