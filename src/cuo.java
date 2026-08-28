import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cuo {
   private static final Strategy<? super cun> a = new Strategy<cun>() {
      public int a(@Nullable cun $$0) {
         return cun.a($$0);
      }

      public boolean a(@Nullable cun $$0, @Nullable cun $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cun.c($$0, $$1);
      }
   };

   public static Set<cun> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
