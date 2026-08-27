import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface amu {
   amu a = new amu() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<amh> a(String $$0) {
         return CompletableFuture.completedFuture(amh.a($$0));
      }

      @Override
      public CompletableFuture<List<amh>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(amh::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<amh> a(String var1);

   CompletableFuture<List<amh>> a(List<String> var1);
}
