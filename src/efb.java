import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface efb<T> extends AutoCloseable {
   CompletableFuture<eew<T>> a(dir var1);

   void a(eew<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
