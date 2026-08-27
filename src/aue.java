import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aue extends atx {
   @Override
   default CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      return $$0.a(azo.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aud var1);
}
