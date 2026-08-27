import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface alq {
   alq a = new alq() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<ald> a(String $$0) {
         return CompletableFuture.completedFuture(ald.a($$0));
      }

      @Override
      public CompletableFuture<List<ald>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ald::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<ald> a(String var1);

   CompletableFuture<List<ald>> a(List<String> var1);
}
