import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface anm {
   anm a = new anm() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<amz> a(String $$0) {
         return CompletableFuture.completedFuture(amz.a($$0));
      }

      @Override
      public CompletableFuture<List<amz>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(amz::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<amz> a(String var1);

   CompletableFuture<List<amz>> a(List<String> var1);
}
