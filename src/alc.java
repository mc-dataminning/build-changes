import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class alc<T> implements akr {
   @Override
   public final CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(akx var1, ban var2);

   protected abstract void a(T var1, akx var2, ban var3);
}
