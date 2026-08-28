import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bsb extends brx<bsd.c> {
   public bsb(int $$0, Executor $$1, String $$2) {
      super(new bsd.a($$0), $$1, $$2);
      brd.a.a(this);
   }

   public bsd.c b(Runnable $$0) {
      return new bsd.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bsd.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
