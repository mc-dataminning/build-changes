import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cub {
   private static final Strategy<? super cua> a = new Strategy<cua>() {
      public int a(@Nullable cua $$0) {
         return cua.a($$0);
      }

      public boolean a(@Nullable cua $$0, @Nullable cua $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cua.c($$0, $$1);
      }
   };

   public static Set<cua> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
