import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cjm {
   private static final Strategy<? super cjl> a = new Strategy<cjl>() {
      public int a(@Nullable cjl $$0) {
         return cjm.a($$0);
      }

      public boolean a(@Nullable cjl $$0, @Nullable cjl $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cjl.c($$0, $$1);
      }
   };

   static int a(@Nullable cjl $$0) {
      if ($$0 != null) {
         qw $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cjl> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
