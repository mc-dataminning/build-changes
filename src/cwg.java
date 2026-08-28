import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwg {
   private static final Strategy<? super cwf> a = new Strategy<cwf>() {
      public int a(@Nullable cwf $$0) {
         return cwf.a($$0);
      }

      public boolean a(@Nullable cwf $$0, @Nullable cwf $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwf.c($$0, $$1);
      }
   };

   public static Set<cwf> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
