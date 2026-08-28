import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dwr<T> extends AutoCloseable {
   CompletableFuture<dwm<T>> a(dbn var1);

   void a(dwm<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
