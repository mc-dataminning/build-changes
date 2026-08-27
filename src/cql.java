import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cql {
   private static final Strategy<? super cqk> a = new Strategy<cqk>() {
      public int a(@Nullable cqk $$0) {
         return cql.a($$0);
      }

      public boolean a(@Nullable cqk $$0, @Nullable cqk $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cqk.c($$0, $$1);
      }
   };

   static int a(@Nullable cqk $$0) {
      if ($$0 != null) {
         ta $$1 = $$0.w();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cqk> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
