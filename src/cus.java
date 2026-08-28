import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cus {
   private static final Strategy<? super cur> a = new Strategy<cur>() {
      public int a(@Nullable cur $$0) {
         return cur.a($$0);
      }

      public boolean a(@Nullable cur $$0, @Nullable cur $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cur.c($$0, $$1);
      }
   };

   public static Set<cur> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
