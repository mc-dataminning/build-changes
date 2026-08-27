import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqd {
   CompletableFuture<Void> a(aqd.a var1, aqj var2, bgt var3, bgt var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
