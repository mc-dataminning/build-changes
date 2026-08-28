import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cul {
   private static final Strategy<? super cuk> a = new Strategy<cuk>() {
      public int a(@Nullable cuk $$0) {
         return cuk.a($$0);
      }

      public boolean a(@Nullable cuk $$0, @Nullable cuk $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cuk.c($$0, $$1);
      }
   };

   public static Set<cuk> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
