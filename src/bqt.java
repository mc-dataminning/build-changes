import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface bqt<R extends Runnable> extends AutoCloseable {
   String x_();

   void a_(R var1);

   @Override
   default void close() {
   }

   R f(Runnable var1);

   default <Source> CompletableFuture<Source> a(Consumer<CompletableFuture<Source>> $$0) {
      CompletableFuture<Source> $$1 = new CompletableFuture<>();
      this.a_(this.f(() -> $$0.accept($$1)));
      return $$1;
   }

   static bqt<Runnable> a(final String $$0, final Executor $$1) {
      return new bqt<Runnable>() {
         @Override
         public String x_() {
            return $$0;
         }

         @Override
         public void a_(Runnable $$0x) {
            $$1.execute($$0);
         }

         @Override
         public Runnable f(Runnable $$0x) {
            return $$0;
         }

         @Override
         public String toString() {
            return $$0;
         }
      };
   }
}
