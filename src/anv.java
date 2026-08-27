import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface anv extends ano {
   @Override
   default CompletableFuture<Void> a(ano.a $$0, anu $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      return $$0.a(asx.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(anu var1);
}
