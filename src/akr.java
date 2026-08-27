import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface akr {
   CompletableFuture<Void> a(akr.a var1, akx var2, ban var3, ban var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
