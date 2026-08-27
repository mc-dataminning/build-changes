import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anq {
   CompletableFuture<Void> a(anq.a var1, anw var2, bdv var3, bdv var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
