import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface apz {
   apz a = new apz() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<apm> a(String $$0) {
         return CompletableFuture.completedFuture(apm.a($$0));
      }

      @Override
      public CompletableFuture<List<apm>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(apm::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<apm> a(String var1);

   CompletableFuture<List<apm>> a(List<String> var1);
}
