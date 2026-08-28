import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bra extends bqw<brc.c> {
   public bra(int $$0, Executor $$1, String $$2) {
      super(new brc.a($$0), $$1, $$2);
      bqc.a.a(this);
   }

   public brc.c b(Runnable $$0) {
      return new brc.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new brc.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
