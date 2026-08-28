import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asr {
   asr e = new asr() {
      @Override
      public CompletableFuture<asb> a(String $$0) {
         return CompletableFuture.completedFuture(asb.a($$0));
      }

      @Override
      public CompletableFuture<List<asb>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asb::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asb> a(String var1);

   CompletableFuture<List<asb>> a(List<String> var1);
}
