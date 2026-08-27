import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ane {
   ane a = new ane() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<amr> a(String $$0) {
         return CompletableFuture.completedFuture(amr.a($$0));
      }

      @Override
      public CompletableFuture<List<amr>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(amr::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<amr> a(String var1);

   CompletableFuture<List<amr>> a(List<String> var1);
}
