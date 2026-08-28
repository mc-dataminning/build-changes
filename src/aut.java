import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aut<T> implements aui {
   @Override
   public final CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, boq.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, boq.a()), $$3);
   }

   protected abstract T b(auo var1, bor var2);

   protected abstract void a(T var1, auo var2, bor var3);
}
