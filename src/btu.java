import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public class btu extends btp<btw.c> {
   public btu(int $$0, Executor $$1, String $$2) {
      super(new btw.a($$0), $$1, $$2);
      bsx.a.a(this);
   }

   public btw.c b(Runnable $$0) {
      return new btw.c(0, $$0);
   }

   public <Source> CompletableFuture<Source> a(int $$0, Consumer<CompletableFuture<Source>> $$1) {
      CompletableFuture<Source> $$2 = new CompletableFuture<>();
      this.a_(new btw.c($$0, () -> $$1.accept($$2)));
      return $$2;
   }
}
