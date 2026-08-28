import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aut<T> implements aui {
   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, bng $$2, bng $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(auo var1, bng var2);

   protected abstract void a(T var1, auo var2, bng var3);
}
