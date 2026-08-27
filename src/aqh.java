import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aqh<T> implements apw {
   @Override
   public final CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aqc var1, bgm var2);

   protected abstract void a(T var1, aqc var2, bgm var3);
}
