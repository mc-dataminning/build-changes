import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aky extends akr {
   @Override
   default CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      return $$0.a(apz.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(akx var1);
}
