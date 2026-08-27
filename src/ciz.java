import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ciz {
   private static final Strategy<? super ciy> a = new Strategy<ciy>() {
      public int a(@Nullable ciy $$0) {
         return ciz.a($$0);
      }

      public boolean a(@Nullable ciy $$0, @Nullable ciy $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && ciy.c($$0, $$1);
      }
   };

   static int a(@Nullable ciy $$0) {
      if ($$0 != null) {
         qr $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<ciy> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
