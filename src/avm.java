import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class avm<T> implements avb {
   @Override
   public final CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      return CompletableFuture.<T>supplyAsync(() -> this.b($$1, brc.a()), $$2)
         .thenCompose($$0::wait)
         .thenAcceptAsync($$1x -> this.a((T)$$1x, $$1, brc.a()), $$3);
   }

   protected abstract T b(avh var1, brd var2);

   protected abstract void a(T var1, avh var2, brd var3);
}
