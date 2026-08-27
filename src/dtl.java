import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dtl<T> extends AutoCloseable {
   CompletableFuture<dtg<T>> a(cyn var1);

   void a(dtg<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
