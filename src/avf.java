import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avf {
   CompletableFuture<Void> a(avf.a var1, avl var2, Executor var3, Executor var4);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
