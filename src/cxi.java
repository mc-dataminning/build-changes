import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxi {
   private static final Strategy<? super cxh> a = new Strategy<cxh>() {
      public int a(@Nullable cxh $$0) {
         return cxh.b($$0);
      }

      public boolean a(@Nullable cxh $$0, @Nullable cxh $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxh.c($$0, $$1);
      }
   };

   public static Set<cxh> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
