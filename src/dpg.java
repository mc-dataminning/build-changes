import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dpg<T> extends AutoCloseable {
   CompletableFuture<dpb<T>> a(cuy var1);

   void a(dpb<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
