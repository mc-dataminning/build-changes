import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asy {
   asy e = new asy() {
      @Override
      public CompletableFuture<asi> a(String $$0) {
         return CompletableFuture.completedFuture(asi.a($$0));
      }

      @Override
      public CompletableFuture<List<asi>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asi::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asi> a(String var1);

   CompletableFuture<List<asi>> a(List<String> var1);
}
