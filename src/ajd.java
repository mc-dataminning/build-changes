import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ajd {
   ajd a = new ajd() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<aiu> a(String $$0) {
         return CompletableFuture.completedFuture(aiu.a($$0));
      }

      @Override
      public CompletableFuture<List<aiu>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(aiu::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<aiu> a(String var1);

   CompletableFuture<List<aiu>> a(List<String> var1);
}
