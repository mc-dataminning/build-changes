import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class dal {
   private static final Strategy<? super dak> a = new Strategy<dak>() {
      public int a(@Nullable dak $$0) {
         return dak.b($$0);
      }

      public boolean a(@Nullable dak $$0, @Nullable dak $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && dak.c($$0, $$1);
      }
   };

   public static Set<dak> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
