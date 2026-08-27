import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cnh {
   private static final Strategy<? super cng> a = new Strategy<cng>() {
      public int a(@Nullable cng $$0) {
         return cnh.a($$0);
      }

      public boolean a(@Nullable cng $$0, @Nullable cng $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cng.c($$0, $$1);
      }
   };

   static int a(@Nullable cng $$0) {
      if ($$0 != null) {
         so $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cng> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
