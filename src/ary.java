import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ary {
   ary a = new ary() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<arl> a(String $$0) {
         return CompletableFuture.completedFuture(arl.a($$0));
      }

      @Override
      public CompletableFuture<List<arl>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(arl::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<arl> a(String var1);

   CompletableFuture<List<arl>> a(List<String> var1);
}
