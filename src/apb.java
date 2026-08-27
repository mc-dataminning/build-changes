import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apb {
   CompletableFuture<Void> a(apb.a var1, aph var2, bfo var3, bfo var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
