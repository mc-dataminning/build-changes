import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atr {
   CompletableFuture<Void> a(atr.a var1, atx var2, bmk var3, bmk var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
