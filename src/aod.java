import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aod {
   aod a = new aod() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<anq> a(String $$0) {
         return CompletableFuture.completedFuture(anq.a($$0));
      }

      @Override
      public CompletableFuture<List<anq>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(anq::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<anq> a(String var1);

   CompletableFuture<List<anq>> a(List<String> var1);
}
