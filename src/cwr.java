import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwr {
   private static final Strategy<? super cwq> a = new Strategy<cwq>() {
      public int a(@Nullable cwq $$0) {
         return cwq.a($$0);
      }

      public boolean a(@Nullable cwq $$0, @Nullable cwq $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwq.c($$0, $$1);
      }
   };

   public static Set<cwq> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
