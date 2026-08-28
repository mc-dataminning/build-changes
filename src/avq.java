import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avq<T> implements avf {
   @Override
   public final CompletableFuture<Void> a(avf.a $$0, avl $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, bpi.a()), $$2).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, bpi.a()), $$3);
   }

   protected abstract T b(avl var1, bpj var2);

   protected abstract void a(T var1, avl var2, bpj var3);
}
