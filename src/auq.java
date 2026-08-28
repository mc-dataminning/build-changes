import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface auq extends auj {
   @Override
   default CompletableFuture<Void> a(auj.a $$0, aup $$1, bnj $$2, bnj $$3, Executor $$4, Executor $$5) {
      return $$0.a(bac.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aup var1);
}
