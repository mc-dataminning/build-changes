import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class clp {
   private static final Strategy<? super clo> a = new Strategy<clo>() {
      public int a(@Nullable clo $$0) {
         return clp.a($$0);
      }

      public boolean a(@Nullable clo $$0, @Nullable clo $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && clo.c($$0, $$1);
      }
   };

   static int a(@Nullable clo $$0) {
      if ($$0 != null) {
         sd $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<clo> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
