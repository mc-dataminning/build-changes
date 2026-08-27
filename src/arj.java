import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface arj {
   arj a = new arj() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aqw> a(String $$0) {
         return CompletableFuture.completedFuture(aqw.a($$0));
      }

      @Override
      public CompletableFuture<List<aqw>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aqw::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aqw> a(String var1);

   CompletableFuture<List<aqw>> a(List<String> var1);
}
