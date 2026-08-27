import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class crk {
   private static final Strategy<? super crj> a = new Strategy<crj>() {
      public int a(@Nullable crj $$0) {
         return crj.a($$0);
      }

      public boolean a(@Nullable crj $$0, @Nullable crj $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.d() == $$1.d() && crj.c($$0, $$1);
      }
   };

   public static Set<crj> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
