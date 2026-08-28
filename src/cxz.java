import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxz {
   private static final Strategy<? super cxy> a = new Strategy<cxy>() {
      public int a(@Nullable cxy $$0) {
         return cxy.b($$0);
      }

      public boolean a(@Nullable cxy $$0, @Nullable cxy $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxy.c($$0, $$1);
      }
   };

   public static Set<cxy> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
