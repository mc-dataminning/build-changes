import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avf extends auy {
   @Override
   default CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      return $$0.a(bat.a).thenRunAsync(() -> {
         bor $$1x = boq.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(ave var1);
}
