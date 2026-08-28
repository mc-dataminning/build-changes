import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface auq extends auj {
   @Override
   default CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return $$0.a(baf.a).thenRunAsync(() -> {
         bou $$1x = bot.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(aup var1);
}
