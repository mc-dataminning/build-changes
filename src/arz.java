import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface arz {
   CompletableFuture<Void> a(arz.a var1, asf var2, bjc var3, bjc var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
