import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class ard implements ash, AutoCloseable {
   private static final Logger b = LogUtils.getLogger();
   private CompletableFuture<?> c = CompletableFuture.completedFuture(null);
   private final Executor d;
   private volatile boolean e;

   public ard(Executor $$0) {
      this.d = $$1 -> {
         if (!this.e) {
            $$0.execute($$1);
         }
      };
   }

   @Override
   public void append(ash.a $$0) {
      this.c = this.c.thenComposeAsync($$1 -> $$0.submit(this.d), this.d).exceptionally($$0x -> {
         if ($$0x instanceof CompletionException $$1) {
            $$0x = $$1.getCause();
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
