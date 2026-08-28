import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class brb extends bqx<brd.c> {
   public brb(int $$0, Executor $$1, String $$2) {
      super(new brd.a($$0), $$1, $$2);
      bqd.a.a(this);
   }

   public brd.c b(Runnable $$0) {
      return new brd.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new brd.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
