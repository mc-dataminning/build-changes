import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asp {
   asp e = new asp() {
      @Override
      public CompletableFuture<arz> a(String $$0) {
         return CompletableFuture.completedFuture(arz.a($$0));
      }

      @Override
      public CompletableFuture<List<arz>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arz::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<arz> a(String var1);

   CompletableFuture<List<arz>> a(List<String> var1);
}
