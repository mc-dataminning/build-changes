import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ann {
   CompletableFuture<Void> a(ann.a var1, ant var2, bdp var3, bdp var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
