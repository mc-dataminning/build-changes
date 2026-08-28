import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class brq extends brm<brs.c> {
   public brq(int $$0, Executor $$1, String $$2) {
      super(new brs.a($$0), $$1, $$2);
      bqu.a.a(this);
   }

   public brs.c b(Runnable $$0) {
      return new brs.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new brs.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
