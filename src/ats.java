import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ats extends atl {
   @Override
   default CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      return $$0.a(azb.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(atr var1);
}
