import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface ebe<T> extends AutoCloseable {
   CompletableFuture<eaz<T>> a(dfp var1);

   void a(eaz<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
