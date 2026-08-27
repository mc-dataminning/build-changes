import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asc extends arv {
   @Override
   default CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      return $$0.a(axk.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(asb var1);
}
