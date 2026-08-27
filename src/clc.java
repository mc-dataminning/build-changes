import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class clc {
   private static final Strategy<? super clb> a = new Strategy<clb>() {
      public int a(@Nullable clb $$0) {
         return clc.a($$0);
      }

      public boolean a(@Nullable clb $$0, @Nullable clb $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && clb.c($$0, $$1);
      }
   };

   static int a(@Nullable clb $$0) {
      if ($$0 != null) {
         rz $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<clb> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
