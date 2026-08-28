import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class czo {
   private static final Strategy<? super czn> a = new Strategy<czn>() {
      public int a(@Nullable czn $$0) {
         return czn.b($$0);
      }

      public boolean a(@Nullable czn $$0, @Nullable czn $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && czn.c($$0, $$1);
      }
   };

   public static Set<czn> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
