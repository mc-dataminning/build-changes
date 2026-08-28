import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class auj<T> implements aty {
   @Override
   public final CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, $$2), $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> this.a((T)$$2x, $$1, $$3), $$5);
   }

   protected abstract T b(aue var1, bnf var2);

   protected abstract void a(T var1, aue var2, bnf var3);
}
