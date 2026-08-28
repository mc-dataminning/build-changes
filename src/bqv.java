import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bqv extends bqr<bqx.c> {
   public bqv(int $$0, Executor $$1, String $$2) {
      super(new bqx.a($$0), $$1, $$2);
      bpx.a.a(this);
   }

   public bqx.c b(Runnable $$0) {
      return new bqx.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bqx.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
