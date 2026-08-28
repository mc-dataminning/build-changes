import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface atk {
   atk e = new atk() {
      @Override
      public CompletableFuture<asu> a(String $$0) {
         return CompletableFuture.completedFuture(asu.a($$0));
      }

      @Override
      public CompletableFuture<List<asu>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asu::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asu> a(String var1);

   CompletableFuture<List<asu>> a(List<String> var1);
}
