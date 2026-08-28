import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class brw extends brs<bry.c> {
   public brw(int $$0, Executor $$1, String $$2) {
      super(new bry.a($$0), $$1, $$2);
      bqy.a.a(this);
   }

   public bry.c b(Runnable $$0) {
      return new bry.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bry.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
