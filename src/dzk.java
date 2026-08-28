import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dzk<T> extends AutoCloseable {
   CompletableFuture<dzf<T>> a(deb var1);

   void a(dzf<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
