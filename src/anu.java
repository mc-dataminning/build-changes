import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anu extends ann {
   @Override
   default CompletableFuture<Void> a(ann.a $$0, ant $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      return $$0.a(asx.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(ant var1);
}
