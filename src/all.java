import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface all {
   all a = new all() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aky> a(String $$0) {
         return CompletableFuture.completedFuture(aky.a($$0));
      }

      @Override
      public CompletableFuture<List<aky>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aky::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aky> a(String var1);

   CompletableFuture<List<aky>> a(List<String> var1);
}
