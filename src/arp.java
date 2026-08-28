import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface arp {
   arp a = new arp() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<arc> a(String $$0) {
         return CompletableFuture.completedFuture(arc.a($$0));
      }

      @Override
      public CompletableFuture<List<arc>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arc::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<arc> a(String var1);

   CompletableFuture<List<arc>> a(List<String> var1);
}
