import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface aoh {
   aoh a = new aoh() {
      @Override
      public void a() {
      }

      @Override
      public void b() {
      }

      @Override
      public CompletableFuture<anu> a(String $$0) {
         return CompletableFuture.completedFuture(anu.a($$0));
      }

      @Override
      public CompletableFuture<List<anu>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(anu::a).collect(ImmutableList.toImmutableList()));
      }
   };

   void a();

   void b();

   CompletableFuture<anu> a(String var1);

   CompletableFuture<List<anu>> a(List<String> var1);
}
