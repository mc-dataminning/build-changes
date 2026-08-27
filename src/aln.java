import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aln {
   aln a = new aln() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<ala> a(String $$0) {
         return CompletableFuture.completedFuture(ala.a($$0));
      }

      @Override
      public CompletableFuture<List<ala>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ala::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<ala> a(String var1);

   CompletableFuture<List<ala>> a(List<String> var1);
}
