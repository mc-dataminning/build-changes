import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asl {
   asl e = new asl() {
      @Override
      public CompletableFuture<arv> a(String $$0) {
         return CompletableFuture.completedFuture(arv.a($$0));
      }

      @Override
      public CompletableFuture<List<arv>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arv::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<arv> a(String var1);

   CompletableFuture<List<arv>> a(List<String> var1);
}
