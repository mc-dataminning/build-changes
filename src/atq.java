import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface atq {
   atq e = new atq() {
      @Override
      public CompletableFuture<ata> a(String $$0) {
         return CompletableFuture.completedFuture(ata.a($$0));
      }

      @Override
      public CompletableFuture<List<ata>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ata::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<ata> a(String var1);

   CompletableFuture<List<ata>> a(List<String> var1);
}
