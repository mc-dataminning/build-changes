import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface alu {
   alu a = new alu() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<alh> a(String $$0) {
         return CompletableFuture.completedFuture(alh.a($$0));
      }

      @Override
      public CompletableFuture<List<alh>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(alh::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<alh> a(String var1);

   CompletableFuture<List<alh>> a(List<String> var1);
}
