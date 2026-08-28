import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dxg<T> extends AutoCloseable {
   CompletableFuture<dxb<T>> a(dcb var1);

   void a(dxb<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
