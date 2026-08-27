import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface alv {
   alv a = new alv() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<ali> a(String $$0) {
         return CompletableFuture.completedFuture(ali.a($$0));
      }

      @Override
      public CompletableFuture<List<ali>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(ali::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<ali> a(String var1);

   CompletableFuture<List<ali>> a(List<String> var1);
}
