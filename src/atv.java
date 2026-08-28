import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atv extends ato {
   @Override
   default CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      return $$0.a(azh.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(atu var1);
}
