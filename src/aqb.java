import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqb {
   CompletableFuture<Void> a(aqb.a var1, aqh var2, bgr var3, bgr var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
