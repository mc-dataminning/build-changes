import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cpa {
   private static final Strategy<? super coz> a = new Strategy<coz>() {
      public int a(@Nullable coz $$0) {
         return cpa.a($$0);
      }

      public boolean a(@Nullable coz $$0, @Nullable coz $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && coz.c($$0, $$1);
      }
   };

   static int a(@Nullable coz $$0) {
      if ($$0 != null) {
         sw $$1 = $$0.w();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<coz> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
