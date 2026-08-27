import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cms {
   private static final Strategy<? super cmr> a = new Strategy<cmr>() {
      public int a(@Nullable cmr $$0) {
         return cms.a($$0);
      }

      public boolean a(@Nullable cmr $$0, @Nullable cmr $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cmr.c($$0, $$1);
      }
   };

   static int a(@Nullable cmr $$0) {
      if ($$0 != null) {
         sl $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cmr> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
