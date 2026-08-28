import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cze {
   private static final Strategy<? super czd> a = new Strategy<czd>() {
      public int a(@Nullable czd $$0) {
         return czd.b($$0);
      }

      public boolean a(@Nullable czd $$0, @Nullable czd $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && czd.c($$0, $$1);
      }
   };

   public static Set<czd> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
