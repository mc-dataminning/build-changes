import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atd extends asw {
   @Override
   default CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      return $$0.a(aym.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(atc var1);
}
