import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aqo<T> implements aqd {
   @Override
   public final CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aqj var1, bgt var2);

   protected abstract void a(T var1, aqj var2, bgt var3);
}
