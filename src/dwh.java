import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dwh<T> extends AutoCloseable {
   CompletableFuture<dwc<T>> a(dbh var1);

   void a(dwc<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
