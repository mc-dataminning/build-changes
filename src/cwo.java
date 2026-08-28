import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwo {
   private static final Strategy<? super cwn> a = new Strategy<cwn>() {
      public int a(@Nullable cwn $$0) {
         return cwn.a($$0);
      }

      public boolean a(@Nullable cwn $$0, @Nullable cwn $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwn.c($$0, $$1);
      }
   };

   public static Set<cwn> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
