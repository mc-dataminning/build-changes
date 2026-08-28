import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwp {
   private static final Strategy<? super cwo> a = new Strategy<cwo>() {
      public int a(@Nullable cwo $$0) {
         return cwo.a($$0);
      }

      public boolean a(@Nullable cwo $$0, @Nullable cwo $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwo.c($$0, $$1);
      }
   };

   public static Set<cwo> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
