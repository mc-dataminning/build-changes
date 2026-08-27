import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anw extends anp {
   @Override
   default CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      return $$0.a(asz.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(anv var1);
}
