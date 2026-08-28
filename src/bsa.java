import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bsa extends brw<bsc.c> {
   public bsa(int $$0, Executor $$1, String $$2) {
      super(new bsc.a($$0), $$1, $$2);
      brc.a.a(this);
   }

   public bsc.c b(Runnable $$0) {
      return new bsc.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bsc.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
