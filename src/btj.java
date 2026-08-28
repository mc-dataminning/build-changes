import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class btj extends bte<btl.c> {
   public btj(int $$0, Executor $$1, String $$2) {
      super(new btl.a($$0), $$1, $$2);
      bsm.a.a(this);
   }

   public btl.c b(Runnable $$0) {
      return new btl.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new btl.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
