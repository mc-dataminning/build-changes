import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aup extends aui {
   @Override
   default CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      return $$0.a(bab.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(auo var1);
}
