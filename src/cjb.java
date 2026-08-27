import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cjb {
   private static final Strategy<? super cja> a = new Strategy<cja>() {
      public int a(@Nullable cja $$0) {
         return cjb.a($$0);
      }

      public boolean a(@Nullable cja $$0, @Nullable cja $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cja.c($$0, $$1);
      }
   };

   static int a(@Nullable cja $$0) {
      if ($$0 != null) {
         qu $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cja> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
