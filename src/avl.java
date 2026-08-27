import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

@FunctionalInterface
public interface avl {
   Logger a = LogUtils.getLogger();

   static avl immediate(final Executor $$0) {
      return new avl() {
         @Override
         public <T> void append(CompletableFuture<T> $$0x, Consumer<T> $$1) {
            $$0.thenAcceptAsync($$1, $$0).exceptionally($$0xx -> {
               a.error("Task failed", $$0xx);
               return null;
            });
         }
      };
   }

   default void append(Runnable $$0) {
      this.append(CompletableFuture.completedFuture(null), $$1 -> $$0.run());
   }

   <T> void append(CompletableFuture<T> var1, Consumer<T> var2);
}
