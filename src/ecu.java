import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface ecu<T> extends AutoCloseable {
   CompletableFuture<ecp<T>> a(dgw var1);

   void a(ecp<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
