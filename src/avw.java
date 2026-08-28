import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface avw extends avp {
   @Override
   default CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return $$0.a(bbk.a).thenRunAsync(() -> {
         bps $$1x = bpr.a();
         $$1x.a("listener");
         this.a($$1);
         $$1x.c();
      }, $$3);
   }

   void a(avv var1);
}
