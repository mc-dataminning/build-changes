import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cup {
   private static final Strategy<? super cuo> a = new Strategy<cuo>() {
      public int a(@Nullable cuo $$0) {
         return cuo.a($$0);
      }

      public boolean a(@Nullable cuo $$0, @Nullable cuo $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cuo.c($$0, $$1);
      }
   };

   public static Set<cuo> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
