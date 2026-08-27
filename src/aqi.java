import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqi extends aqb {
   @Override
   default CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      return $$0.a(avr.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aqh var1);
}
