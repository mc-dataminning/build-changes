import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aso {
   aso e = new aso() {
      @Override
      public CompletableFuture<ary> a(String $$0) {
         return CompletableFuture.completedFuture(ary.a($$0));
      }

      @Override
      public CompletableFuture<List<ary>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ary::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<ary> a(String var1);

   CompletableFuture<List<ary>> a(List<String> var1);
}
