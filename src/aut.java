import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aut extends aum {
   @Override
   default CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      return $$0.a(bah.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aus var1);
}
