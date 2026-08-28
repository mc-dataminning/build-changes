import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class ayc implements azm, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   private CompletableFuture<?> c = CompletableFuture.completedFuture(null);
   private final Executor d;
   private volatile boolean e;

   public ayc(Executor $$0) {
      this.d = $$0;
   }

   @Override
   public <T> void append(CompletableFuture<T> $$0, Consumer<T> $$1) {
      this.c = this.c.<T, Object>thenCombine($$0, ($$0x, $$1x) -> $$1x).thenAcceptAsync($$1x -> {
         if (!this.e) {
            $$1.accept((T)$$1x);
         }
      }, this.d).exceptionally($$0x -> {
         if ($$0x instanceof CompletionException $$1x) {
            $$0x = $$1x.getCause();
         }

         if ($$0x instanceof CancellationException $$2) {
            throw $$2;
         } else {
            b.error("Chain link failed, continuing to next one", $$0x);
            return null;
         }
      });
   }

   @Override
   public void close() {
      this.e = true;
   }
}
