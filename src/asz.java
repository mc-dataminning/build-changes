import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asz {
   asz e = new asz() {
      @Override
      public CompletableFuture<asj> a(String $$0) {
         return CompletableFuture.completedFuture(asj.a($$0));
      }

      @Override
      public CompletableFuture<List<asj>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asj::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asj> a(String var1);

   CompletableFuture<List<asj>> a(List<String> var1);
}
