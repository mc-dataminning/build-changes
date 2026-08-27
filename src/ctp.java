import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ctp {
   private static final Strategy<? super cto> a = new Strategy<cto>() {
      public int a(@Nullable cto $$0) {
         return cto.a($$0);
      }

      public boolean a(@Nullable cto $$0, @Nullable cto $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cto.c($$0, $$1);
      }
   };

   public static Set<cto> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
