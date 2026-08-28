import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ask {
   ask a = new ask() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<arx> a(String $$0) {
         return CompletableFuture.completedFuture(arx.a($$0));
      }

      @Override
      public CompletableFuture<List<arx>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arx::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<arx> a(String var1);

   CompletableFuture<List<arx>> a(List<String> var1);
}
