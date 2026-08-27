import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cse {
   private static final Strategy<? super csd> a = new Strategy<csd>() {
      public int a(@Nullable csd $$0) {
         return csd.a($$0);
      }

      public boolean a(@Nullable csd $$0, @Nullable csd $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.d() == $$1.d() && csd.c($$0, $$1);
      }
   };

   public static Set<csd> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
