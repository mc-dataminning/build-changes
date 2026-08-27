import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aqm<T> implements aqb {
   @Override
   public final CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aqh var1, bgr var2);

   protected abstract void a(T var1, aqh var2, bgr var3);
}
