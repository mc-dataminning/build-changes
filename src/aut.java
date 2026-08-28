import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aut {
   CompletableFuture<Void> a(aut.a var1, ava var2, Executor var3, Executor var4);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
