import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ask<T> implements arz {
   @Override
   public final CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(asf var1, bjc var2);

   protected abstract void a(T var1, asf var2, bjc var3);
}
