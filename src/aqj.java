import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aqj {
   aqj a = new aqj() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<apw> a(String $$0) {
         return CompletableFuture.completedFuture(apw.a($$0));
      }

      @Override
      public CompletableFuture<List<apw>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(apw::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<apw> a(String var1);

   CompletableFuture<List<apw>> a(List<String> var1);
}
