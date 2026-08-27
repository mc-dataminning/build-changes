import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface ann extends ang {
   @Override
   default CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      return $$0.a(asp.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(anm var1);
}
