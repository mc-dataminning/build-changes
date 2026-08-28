import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avi extends avb {
   @Override
   default CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      return $$0.wait(bay.a).thenRunAsync(() -> {
         brd $$1x = brc.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avh var1);
}
