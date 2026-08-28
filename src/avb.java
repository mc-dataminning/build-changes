import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avb extends aut {
   @Override
   default CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      return $$0.a(baq.a).thenRunAsync(() -> {
         bqb $$1x = bqa.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(ava var1);
}
