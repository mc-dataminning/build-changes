import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asm {
   asm e = new asm() {
      @Override
      public CompletableFuture<arw> a(String $$0) {
         return CompletableFuture.completedFuture(arw.a($$0));
      }

      @Override
      public CompletableFuture<List<arw>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arw::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<arw> a(String var1);

   CompletableFuture<List<arw>> a(List<String> var1);
}
