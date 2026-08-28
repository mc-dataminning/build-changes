import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface ebd<T> extends AutoCloseable {
   CompletableFuture<eay<T>> a(dfo var1);

   void a(eay<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
