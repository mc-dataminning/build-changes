import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atl {
   CompletableFuture<Void> a(atl.a var1, atr var2, bma var3, bma var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
