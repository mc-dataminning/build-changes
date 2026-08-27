import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class aob<T> implements anq {
   @Override
   public final CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(anw var1, bdv var2);

   protected abstract void a(T var1, anw var2, bdv var3);
}
