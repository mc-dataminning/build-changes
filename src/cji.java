import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cji {
   private static final Strategy<? super cjh> a = new Strategy<cjh>() {
      public int a(@Nullable cjh $$0) {
         return cji.a($$0);
      }

      public boolean a(@Nullable cjh $$0, @Nullable cjh $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cjh.c($$0, $$1);
      }
   };

   static int a(@Nullable cjh $$0) {
      if ($$0 != null) {
         qy $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cjh> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
