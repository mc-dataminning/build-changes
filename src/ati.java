import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ati {
   CompletableFuture<Void> a(ati.a var1, ato var2, ble var3, ble var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
