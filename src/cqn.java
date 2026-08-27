import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cqn {
   private static final Strategy<? super cqm> a = new Strategy<cqm>() {
      public int a(@Nullable cqm $$0) {
         return cqn.a($$0);
      }

      public boolean a(@Nullable cqm $$0, @Nullable cqm $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cqm.c($$0, $$1);
      }
   };

   static int a(@Nullable cqm $$0) {
      if ($$0 != null) {
         ta $$1 = $$0.w();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cqm> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
