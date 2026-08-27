import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class asg<T> implements arv {
   @Override
   public final CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(asb var1, bin var2);

   protected abstract void a(T var1, asb var2, bin var3);
}
