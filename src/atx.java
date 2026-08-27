import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atx extends atq {
   @Override
   default CompletableFuture<Void> a(atq.a $$0, atw $$1, bmi $$2, bmi $$3, Executor $$4, Executor $$5) {
      return $$0.a(azf.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(atw var1);
}
