import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface atg {
   atg e = new atg() {
      @Override
      public CompletableFuture<asq> a(String $$0) {
         return CompletableFuture.completedFuture(asq.a($$0));
      }

      @Override
      public CompletableFuture<List<asq>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asq::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asq> a(String var1);

   CompletableFuture<List<asq>> a(List<String> var1);
}
