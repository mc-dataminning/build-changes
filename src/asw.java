import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface asw {
   asw e = new asw() {
      @Override
      public CompletableFuture<asg> a(String $$0) {
         return CompletableFuture.completedFuture(asg.a($$0));
      }

      @Override
      public CompletableFuture<List<asg>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(asg::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<asg> a(String var1);

   CompletableFuture<List<asg>> a(List<String> var1);
}
