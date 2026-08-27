import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ant {
   ant a = new ant() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<ang> a(String $$0) {
         return CompletableFuture.completedFuture(ang.a($$0));
      }

      @Override
      public CompletableFuture<List<ang>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ang::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<ang> a(String var1);

   CompletableFuture<List<ang>> a(List<String> var1);
}
