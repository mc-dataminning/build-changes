import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avg extends auz {
   @Override
   default CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      return $$0.wait(baw.a).thenRunAsync(() -> {
         brb $$1x = bra.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avf var1);
}
