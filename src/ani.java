import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ani {
   ani a = new ani() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<amv> a(String $$0) {
         return CompletableFuture.completedFuture(amv.a($$0));
      }

      @Override
      public CompletableFuture<List<amv>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(amv::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<amv> a(String var1);

   CompletableFuture<List<amv>> a(List<String> var1);
}
