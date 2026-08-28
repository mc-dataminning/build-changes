import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avc extends auu {
   @Override
   default CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return $$0.a(bas.a).thenRunAsync(() -> {
         bqj $$1x = bqi.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avb var1);
}
