import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asp extends asi {
   @Override
   default CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      return $$0.a(axy.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aso var1);
}
