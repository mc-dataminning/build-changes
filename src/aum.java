import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aum extends auf {
   @Override
   default CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      return $$0.a(azx.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aul var1);
}
