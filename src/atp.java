import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface atp extends ati {
   @Override
   default CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      return $$0.a(ayy.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(ato var1);
}
