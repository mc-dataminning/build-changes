import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aqn<T> implements aqc {
   @Override
   public final CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aqi var1, bgs var2);

   protected abstract void a(T var1, aqi var2, bgs var3);
}
