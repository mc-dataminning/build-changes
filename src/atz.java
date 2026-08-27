import java.util.concurrent.CompletableFuture;

public interface atz {
   CompletableFuture<?> a();

   float b();

   default boolean c() {
      return this.a().isDone();
   }

   default void d() {
      CompletableFuture<?> $$0 = this.a();
      if ($$0.isCompletedExceptionally()) {
         $$0.join();
      }
   }
}
