import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bqz extends bqv<brb.c> {
   public bqz(int $$0, Executor $$1, String $$2) {
      super(new brb.a($$0), $$1, $$2);
      bqb.a.a(this);
   }

   public brb.c b(Runnable $$0) {
      return new brb.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new brb.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
