import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public interface dvg<T> extends AutoCloseable {
   CompletableFuture<dvb<T>> a(dag var1);

   void a(dvb<T> var1);

   void a(boolean var1);

   @Override
   default void close() throws IOException {
   }
}
