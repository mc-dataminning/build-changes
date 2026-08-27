import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ctr {
   private static final Strategy<? super ctq> a = new Strategy<ctq>() {
      public int a(@Nullable ctq $$0) {
         return ctq.a($$0);
      }

      public boolean a(@Nullable ctq $$0, @Nullable ctq $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && ctq.c($$0, $$1);
      }
   };

   public static Set<ctq> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
