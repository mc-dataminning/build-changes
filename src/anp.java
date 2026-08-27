import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anp {
   CompletableFuture<Void> a(anp.a var1, anv var2, bdr var3, bdr var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
