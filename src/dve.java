import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dve<T> extends AutoCloseable {
   CompletableFuture<duz<T>> a(dae var1);

   void a(duz<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
