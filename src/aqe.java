import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aqe {
   aqe a = new aqe() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<apr> a(String $$0) {
         return CompletableFuture.completedFuture(apr.a($$0));
      }

      @Override
      public CompletableFuture<List<apr>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(apr::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<apr> a(String var1);

   CompletableFuture<List<apr>> a(List<String> var1);
}
