import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@FunctionalInterface
public interface avb {
   CompletableFuture<Void> reload(avb.a var1, avh var2, Executor var3, Executor var4);

   default String getName() {
      return this.getClass().getSimpleName();
   }

   @FunctionalInterface
   public interface a {
      <T> CompletableFuture<T> wait(T var1);
   }
}
