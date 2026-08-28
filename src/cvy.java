import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cvy {
   private static final Strategy<? super cvx> a = new Strategy<cvx>() {
      public int a(@Nullable cvx $$0) {
         return cvx.a($$0);
      }

      public boolean a(@Nullable cvx $$0, @Nullable cvx $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cvx.c($$0, $$1);
      }
   };

   public static Set<cvx> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
