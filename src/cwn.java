import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwn {
   private static final Strategy<? super cwm> a = new Strategy<cwm>() {
      public int a(@Nullable cwm $$0) {
         return cwm.a($$0);
      }

      public boolean a(@Nullable cwm $$0, @Nullable cwm $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwm.c($$0, $$1);
      }
   };

   public static Set<cwm> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
