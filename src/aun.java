import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aun {
   CompletableFuture<Void> a(aun.a var1, aut var2, bod var3, bod var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
