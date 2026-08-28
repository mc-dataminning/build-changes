import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aup extends aui {
   @Override
   default CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      return $$0.a(bae.a).thenRunAsync(() -> {
         bor $$1x = boq.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(auo var1);
}
