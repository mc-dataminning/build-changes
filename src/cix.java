import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cix {
   private static final Strategy<? super ciw> a = new Strategy<ciw>() {
      public int a(@Nullable ciw $$0) {
         return cix.a($$0);
      }

      public boolean a(@Nullable ciw $$0, @Nullable ciw $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && ciw.c($$0, $$1);
      }
   };

   static int a(@Nullable ciw $$0) {
      if ($$0 != null) {
         qs $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<ciw> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
