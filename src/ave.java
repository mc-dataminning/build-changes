import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ave extends auw {
   @Override
   default CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return $$0.wait(bau.a).thenRunAsync(() -> {
         bqq $$1x = bqp.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avd var1);
}
