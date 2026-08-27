import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anl extends ane {
   @Override
   default CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      return $$0.a(asn.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(ank var1);
}
