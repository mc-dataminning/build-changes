import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apm {
   CompletableFuture<Void> a(apm.a var1, aps var2, bgc var3, bgc var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
