import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aon {
   CompletableFuture<Void> a(aon.a var1, aot var2, bes var3, bes var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
