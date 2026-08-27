import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asi {
   CompletableFuture<Void> a(asi.a var1, aso var2, bjq var3, bjq var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
