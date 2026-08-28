import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface auw extends aup {
   @Override
   default CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      return $$0.a(bak.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(auv var1);
}
