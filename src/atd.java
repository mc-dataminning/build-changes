import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface atd {
   atd e = new atd() {
      @Override
      public CompletableFuture<asn> a(String $$0) {
         return CompletableFuture.completedFuture(asn.a($$0));
      }

      @Override
      public CompletableFuture<List<asn>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asn::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asn> a(String var1);

   CompletableFuture<List<asn>> a(List<String> var1);
}
