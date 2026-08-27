import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class ath<T> implements asw {
   @Override
   public final CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(atc var1, bko var2);

   protected abstract void a(T var1, atc var2, bko var3);
}
