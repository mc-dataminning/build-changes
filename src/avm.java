import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avm extends avf {
   @Override
   default CompletableFuture<Void> a(avf.a $$0, avl $$1, Executor $$2, Executor $$3) {
      return $$0.a(bba.a).thenRunAsync(() -> {
         bpj $$1x = bpi.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avl var1);
}
