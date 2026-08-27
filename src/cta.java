import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cta {
   private static final Strategy<? super csz> a = new Strategy<csz>() {
      public int a(@Nullable csz $$0) {
         return csz.a($$0);
      }

      public boolean a(@Nullable csz $$0, @Nullable csz $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.d() == $$1.d() && csz.c($$0, $$1);
      }
   };

   public static Set<csz> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
