import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ane {
   CompletableFuture<Void> a(ane.a var1, ank var2, bde var3, bde var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
