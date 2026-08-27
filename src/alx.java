import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface alx {
   alx a = new alx() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<alk> a(String $$0) {
         return CompletableFuture.completedFuture(alk.a($$0));
      }

      @Override
      public CompletableFuture<List<alk>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(alk::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<alk> a(String var1);

   CompletableFuture<List<alk>> a(List<String> var1);
}
