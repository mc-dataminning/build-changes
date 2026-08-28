import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface arz {
   arz a = new arz() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<arm> a(String $$0) {
         return CompletableFuture.completedFuture(arm.a($$0));
      }

      @Override
      public CompletableFuture<List<arm>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arm::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<arm> a(String var1);

   CompletableFuture<List<arm>> a(List<String> var1);
}
