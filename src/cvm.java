import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cvm {
   private static final Strategy<? super cvl> a = new Strategy<cvl>() {
      public int a(@Nullable cvl $$0) {
         return cvl.a($$0);
      }

      public boolean a(@Nullable cvl $$0, @Nullable cvl $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cvl.c($$0, $$1);
      }
   };

   public static Set<cvl> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
