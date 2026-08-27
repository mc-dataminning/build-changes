import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aru {
   CompletableFuture<Void> a(aru.a var1, asa var2, bil var3, bil var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
