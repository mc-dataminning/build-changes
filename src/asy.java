import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asy {
   CompletableFuture<Void> a(asy.a var1, ate var2, bkt var3, bkt var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
