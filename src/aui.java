import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aui<T> implements atx {
   @Override
   public final CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aud var1, bmo var2);

   protected abstract void a(T var1, aud var2, bmo var3);
}
