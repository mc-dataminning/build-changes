import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxh {
   private static final Strategy<? super cxg> a = new Strategy<cxg>() {
      public int a(@Nullable cxg $$0) {
         return cxg.a($$0);
      }

      public boolean a(@Nullable cxg $$0, @Nullable cxg $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxg.c($$0, $$1);
      }
   };

   public static Set<cxg> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
