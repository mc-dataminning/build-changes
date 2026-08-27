import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ape extends aox {
   @Override
   default CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      return $$0.a(auj.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(apd var1);
}
