import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwq {
   private static final Strategy<? super cwp> a = new Strategy<cwp>() {
      public int a(@Nullable cwp $$0) {
         return cwp.a($$0);
      }

      public boolean a(@Nullable cwp $$0, @Nullable cwp $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwp.c($$0, $$1);
      }
   };

   public static Set<cwp> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
