import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class brd extends bqz<brf.c> {
   public brd(int $$0, Executor $$1, String $$2) {
      super(new brf.a($$0), $$1, $$2);
      bqf.a.a(this);
   }

   public brf.c b(Runnable $$0) {
      return new brf.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new brf.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
