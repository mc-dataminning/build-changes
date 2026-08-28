import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aty {
   CompletableFuture<Void> a(aty.a var1, aue var2, bnf var3, bnf var4, Executor var5, Executor var6);

   default String c() {
      return this.getClass().getSimpleName();
   }

   public interface a {
      <T> CompletableFuture<T> a(T var1);
   }
}
