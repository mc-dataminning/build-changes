import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atx {
   CompletableFuture<Void> a(atx.a var1, aud var2, bmo var3, bmo var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
