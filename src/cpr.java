import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cpr {
   private static final Strategy<? super cpq> a = new Strategy<cpq>() {
      public int a(@Nullable cpq $$0) {
         return cpr.a($$0);
      }

      public boolean a(@Nullable cpq $$0, @Nullable cpq $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cpq.c($$0, $$1);
      }
   };

   static int a(@Nullable cpq $$0) {
      if ($$0 != null) {
         sy $$1 = $$0.w();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cpq> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
