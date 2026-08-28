import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cyt {
   private static final Strategy<? super cys> a = new Strategy<cys>() {
      public int a(@Nullable cys $$0) {
         return cys.b($$0);
      }

      public boolean a(@Nullable cys $$0, @Nullable cys $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cys.c($$0, $$1);
      }
   };

   public static Set<cys> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
