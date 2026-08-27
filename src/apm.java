import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface apm extends apf {
   @Override
   default CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      return $$0.a(aus.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(apl var1);
}
