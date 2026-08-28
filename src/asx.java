import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asx {
   asx e = new asx() {
      @Override
      public CompletableFuture<ash> a(String $$0) {
         return CompletableFuture.completedFuture(ash.a($$0));
      }

      @Override
      public CompletableFuture<List<ash>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ash::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<ash> a(String var1);

   CompletableFuture<List<ash>> a(List<String> var1);
}
