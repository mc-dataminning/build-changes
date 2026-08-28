import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface auf extends aty {
   @Override
   default CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      return $$0.a(azs.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aue var1);
}
