import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asb extends aru {
   @Override
   default CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      return $$0.a(axk.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(asa var1);
}
