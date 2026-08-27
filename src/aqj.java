import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqj extends aqc {
   @Override
   default CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      return $$0.a(avs.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aqi var1);
}
