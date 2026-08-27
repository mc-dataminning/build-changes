import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asw {
   CompletableFuture<Void> a(asw.a var1, atc var2, bko var3, bko var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
