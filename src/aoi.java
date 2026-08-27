import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aoi {
   aoi a = new aoi() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<anv> a(String $$0) {
         return CompletableFuture.completedFuture(anv.a($$0));
      }

      @Override
      public CompletableFuture<List<anv>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(anv::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<anv> a(String var1);

   CompletableFuture<List<anv>> a(List<String> var1);
}
