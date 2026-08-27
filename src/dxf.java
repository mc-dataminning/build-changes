import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dxf<T> extends AutoCloseable {
   CompletableFuture<dxa<T>> a(dbh var1);

   void a(dxa<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
