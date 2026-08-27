import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class crt {
   private static final Strategy<? super crs> a = new Strategy<crs>() {
      public int a(@Nullable crs $$0) {
         return crs.a($$0);
      }

      public boolean a(@Nullable crs $$0, @Nullable crs $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.d() == $$1.d() && crs.c($$0, $$1);
      }
   };

   public static Set<crs> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
