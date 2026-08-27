import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cmz {
   private static final Strategy<? super cmy> a = new Strategy<cmy>() {
      public int a(@Nullable cmy $$0) {
         return cmz.a($$0);
      }

      public boolean a(@Nullable cmy $$0, @Nullable cmy $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cmy.c($$0, $$1);
      }
   };

   static int a(@Nullable cmy $$0) {
      if ($$0 != null) {
         sn $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cmy> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
