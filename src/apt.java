import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

@FunctionalInterface
public interface apt {
   Logger a = LogUtils.getLogger();

   static apt immediate(Executor $$0) {
      return $$1 -> $$1.submit($$0).exceptionally($$0xx -> {
            a.error("Task failed", $$0xx);
            return null;
         });
   }

   void append(apt.a var1);

   public interface a {
      CompletableFuture<?> submit(Executor var1);
   }
}
