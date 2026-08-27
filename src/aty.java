import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aty extends atr {
   @Override
   default CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      return $$0.a(azh.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(atx var1);
}
