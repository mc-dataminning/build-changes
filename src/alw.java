import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface alw {
   alw a = new alw() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<alj> a(String $$0) {
         return CompletableFuture.completedFuture(alj.a($$0));
      }

      @Override
      public CompletableFuture<List<alj>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(alj::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<alj> a(String var1);

   CompletableFuture<List<alj>> a(List<String> var1);
}
