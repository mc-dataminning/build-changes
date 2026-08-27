import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqd extends apw {
   @Override
   default CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      return $$0.a(avm.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aqc var1);
}
