import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asv {
   asv e = new asv() {
      @Override
      public CompletableFuture<asf> a(String $$0) {
         return CompletableFuture.completedFuture(asf.a($$0));
      }

      @Override
      public CompletableFuture<List<asf>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asf::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asf> a(String var1);

   CompletableFuture<List<asf>> a(List<String> var1);
}
