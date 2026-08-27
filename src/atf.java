import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atf extends asy {
   @Override
   default CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      return $$0.a(ayo.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(ate var1);
}
