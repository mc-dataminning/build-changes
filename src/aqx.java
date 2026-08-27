import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aqx {
   aqx a = new aqx() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aqk> a(String $$0) {
         return CompletableFuture.completedFuture(aqk.a($$0));
      }

      @Override
      public CompletableFuture<List<aqk>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aqk::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aqk> a(String var1);

   CompletableFuture<List<aqk>> a(List<String> var1);
}
