import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apf {
   CompletableFuture<Void> a(apf.a var1, apl var2, bfs var3, bfs var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
