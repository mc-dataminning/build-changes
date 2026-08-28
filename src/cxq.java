import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxq {
   private static final Strategy<? super cxp> a = new Strategy<cxp>() {
      public int a(@Nullable cxp $$0) {
         return cxp.a($$0);
      }

      public boolean a(@Nullable cxp $$0, @Nullable cxp $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxp.c($$0, $$1);
      }
   };

   public static Set<cxp> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
