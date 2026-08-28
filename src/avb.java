import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avb extends aut {
   @Override
   default CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      return $$0.a(bao.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(ava var1);
}
