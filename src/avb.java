import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avb<T> implements aup {
   @Override
   public final CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(auv var1, bog var2);

   protected abstract void a(T var1, auv var2, bog var3);
}
