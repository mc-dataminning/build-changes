import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cui {
   private static final Strategy<? super cuh> a = new Strategy<cuh>() {
      public int a(@Nullable cuh $$0) {
         return cuh.a($$0);
      }

      public boolean a(@Nullable cuh $$0, @Nullable cuh $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.d() == $$1.d() && cuh.c($$0, $$1);
      }
   };

   public static Set<cuh> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
