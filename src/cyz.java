import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cyz {
   private static final Strategy<? super cyy> a = new Strategy<cyy>() {
      public int a(@Nullable cyy $$0) {
         return cyy.b($$0);
      }

      public boolean a(@Nullable cyy $$0, @Nullable cyy $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cyy.c($$0, $$1);
      }
   };

   public static Set<cyy> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
