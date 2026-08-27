import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anj {
   CompletableFuture<Void> a(anj.a var1, anp var2, bdk var3, bdk var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
