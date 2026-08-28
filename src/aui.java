import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aui {
   CompletableFuture<Void> a(aui.a var1, auo var2, Executor var3, Executor var4);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
