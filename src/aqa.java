import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aqa {
   aqa a = new aqa() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<apn> a(String $$0) {
         return CompletableFuture.completedFuture(apn.a($$0));
      }

      @Override
      public CompletableFuture<List<apn>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(apn::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<apn> a(String var1);

   CompletableFuture<List<apn>> a(List<String> var1);
}
