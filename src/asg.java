import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asg {
   asg a = new asg() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<art> a(String $$0) {
         return CompletableFuture.completedFuture(art.a($$0));
      }

      @Override
      public CompletableFuture<List<art>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(art::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<art> a(String var1);

   CompletableFuture<List<art>> a(List<String> var1);
}
