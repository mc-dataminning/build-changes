import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dfv<T> extends AutoCloseable {
   CompletableFuture<dfq<T>> a(clt var1);

   void a(dfq<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
