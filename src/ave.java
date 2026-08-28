import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ave extends auw {
   @Override
   default CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return $$0.a(bau.a).thenRunAsync(() -> {
         bqo $$1x = bqn.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avd var1);
}
