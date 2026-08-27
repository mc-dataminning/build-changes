import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aou extends aon {
   @Override
   default CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      return $$0.a(atz.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aot var1);
}
