import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxl {
   private static final Strategy<? super cxk> a = new Strategy<cxk>() {
      public int a(@Nullable cxk $$0) {
         return cxk.a($$0);
      }

      public boolean a(@Nullable cxk $$0, @Nullable cxk $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxk.c($$0, $$1);
      }
   };

   public static Set<cxk> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
