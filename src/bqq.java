import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bqq extends bqm<bqs.c> {
   public bqq(int $$0, Executor $$1, String $$2) {
      super(new bqs.a($$0), $$1, $$2);
      bps.a.a(this);
   }

   public bqs.c b(Runnable $$0) {
      return new bqs.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bqs.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
