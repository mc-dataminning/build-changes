import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aox {
   CompletableFuture<Void> a(aox.a var1, apd var2, bfh var3, bfh var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
