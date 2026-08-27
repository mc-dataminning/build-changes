import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface api extends apb {
   @Override
   default CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      return $$0.a(auo.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aph var1);
}
