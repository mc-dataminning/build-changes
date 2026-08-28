import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dwq<T> extends AutoCloseable {
   CompletableFuture<dwl<T>> a(dbm var1);

   void a(dwl<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
