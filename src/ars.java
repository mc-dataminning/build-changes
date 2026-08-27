import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ars {
   ars a = new ars() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<arf> a(String $$0) {
         return CompletableFuture.completedFuture(arf.a($$0));
      }

      @Override
      public CompletableFuture<List<arf>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arf::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<arf> a(String var1);

   CompletableFuture<List<arf>> a(List<String> var1);
}
