import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atq {
   CompletableFuture<Void> a(atq.a var1, atw var2, bmu var3, bmu var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
