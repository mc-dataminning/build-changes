import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface atb {
   atb e = new atb() {
      @Override
      public CompletableFuture<asl> a(String $$0) {
         return CompletableFuture.completedFuture(asl.a($$0));
      }

      @Override
      public CompletableFuture<List<asl>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asl::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asl> a(String var1);

   CompletableFuture<List<asl>> a(List<String> var1);
}
