import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aqz {
   aqz a = new aqz() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aqm> a(String $$0) {
         return CompletableFuture.completedFuture(aqm.a($$0));
      }

      @Override
      public CompletableFuture<List<aqm>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aqm::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aqm> a(String var1);

   CompletableFuture<List<aqm>> a(List<String> var1);
}
