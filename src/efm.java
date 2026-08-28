import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface efm<T> extends AutoCloseable {
   CompletableFuture<efh<T>> a(djc var1);

   void a(efh<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
