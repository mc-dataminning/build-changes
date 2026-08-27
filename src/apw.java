import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apw {
   CompletableFuture<Void> a(apw.a var1, aqc var2, bgm var3, bgm var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
