import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dxj<T> extends AutoCloseable {
   CompletableFuture<dxe<T>> a(dcd var1);

   void a(dxe<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
