import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bst extends bsp<bsv.c> {
   public bst(int $$0, Executor $$1, String $$2) {
      super(new bsv.a($$0), $$1, $$2);
      brx.a.a(this);
   }

   public bsv.c b(Runnable $$0) {
      return new bsv.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bsv.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
