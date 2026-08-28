import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cvq {
   private static final Strategy<? super cvp> a = new Strategy<cvp>() {
      public int a(@Nullable cvp $$0) {
         return cvp.a($$0);
      }

      public boolean a(@Nullable cvp $$0, @Nullable cvp $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cvp.c($$0, $$1);
      }
   };

   public static Set<cvp> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
