import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avp extends avi {
   @Override
   default CompletableFuture<Void> reload(avi.a $$0, avo $$1, Executor $$2, Executor $$3) {
      return $$0.wait(bbh.a).thenRunAsync(() -> {
         brm $$1x = brl.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avo var1);
}
