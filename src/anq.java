import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anq extends anj {
   @Override
   default CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      return $$0.a(ass.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(anp var1);
}
