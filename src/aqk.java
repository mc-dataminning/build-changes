import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface aqk extends aqd {
   @Override
   default CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      return $$0.a(avt.a).thenRunAsync(() -> {
         $$3.a();
         $$3.a("listener");
         this.a($$1);
         $$3.c();
         $$3.b();
      }, $$5);
   }

   void a(aqj var1);
}
