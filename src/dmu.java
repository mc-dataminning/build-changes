import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dmu<T> extends AutoCloseable {
   CompletableFuture<dmp<T>> a(csp var1);

   void a(dmp<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
