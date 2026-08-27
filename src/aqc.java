import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqc {
   CompletableFuture<Void> a(aqc.a var1, aqi var2, bgs var3, bgs var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
