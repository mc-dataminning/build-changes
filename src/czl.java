import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class czl {
   private static final Strategy<? super czk> a = new Strategy<czk>() {
      public int a(@Nullable czk $$0) {
         return czk.b($$0);
      }

      public boolean a(@Nullable czk $$0, @Nullable czk $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && czk.c($$0, $$1);
      }
   };

   public static Set<czk> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
