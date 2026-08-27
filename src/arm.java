import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface arm {
   arm a = new arm() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aqz> a(String $$0) {
         return CompletableFuture.completedFuture(aqz.a($$0));
      }

      @Override
      public CompletableFuture<List<aqz>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aqz::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aqz> a(String var1);

   CompletableFuture<List<aqz>> a(List<String> var1);
}
