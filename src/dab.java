import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class dab {
   private static final Strategy<? super daa> a = new Strategy<daa>() {
      public int a(@Nullable daa $$0) {
         return daa.b($$0);
      }

      public boolean a(@Nullable daa $$0, @Nullable daa $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && daa.c($$0, $$1);
      }
   };

   public static Set<daa> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
