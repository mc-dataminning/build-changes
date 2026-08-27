import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class apq<T> implements apf {
   @Override
   public final CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(apl var1, bfs var2);

   protected abstract void a(T var1, apl var2, bfs var3);
}
