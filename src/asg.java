import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface asg extends arz {
   @Override
   default CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      return $$0.a(axo.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(asf var1);
}
