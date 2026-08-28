import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aup {
   CompletableFuture<Void> a(aup.a var1, auv var2, bog var3, bog var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
