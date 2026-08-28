import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@FunctionalInterface
public interface auz {
   CompletableFuture<Void> reload(auz.a var1, avf var2, Executor var3, Executor var4);

   default String getName() {
      return this.getClass().getSimpleName();
   }

   @FunctionalInterface
   public interface a {
      <T> CompletableFuture<T> wait(T var1);
   }
}
