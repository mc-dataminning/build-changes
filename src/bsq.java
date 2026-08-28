import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class bsq extends bsm<bss.c> {
   public bsq(int $$0, Executor $$1, String $$2) {
      super(new bss.a($$0), $$1, $$2);
      bru.a.a(this);
   }

   public bss.c b(Runnable $$0) {
      return new bss.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new bss.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
