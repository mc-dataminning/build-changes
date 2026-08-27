import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ang {
   CompletableFuture<Void> a(ang.a var1, anm var2, bdh var3, bdh var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
