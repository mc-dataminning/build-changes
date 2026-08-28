import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cxp {
   private static final Strategy<? super cxo> a = new Strategy<cxo>() {
      public int a(@Nullable cxo $$0) {
         return cxo.a($$0);
      }

      public boolean a(@Nullable cxo $$0, @Nullable cxo $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cxo.c($$0, $$1);
      }
   };

   public static Set<cxo> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
