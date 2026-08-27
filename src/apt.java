import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apt extends apm {
   @Override
   default CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      return $$0.a(avc.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aps var1);
}
