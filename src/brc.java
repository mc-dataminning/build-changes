import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class brc extends bqy<bre.c> {
   public brc(int $$0, Executor $$1, String $$2) {
      super(new bre.a($$0), $$1, $$2);
      bqe.a.a(this);
   }

   public bre.c b(Runnable $$0) {
      return new bre.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bre.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
