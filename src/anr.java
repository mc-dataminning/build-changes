import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class anr<T> implements ang {
   @Override
   public final CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(anm var1, bdh var2);

   protected abstract void a(T var1, anm var2, bdh var3);
}
