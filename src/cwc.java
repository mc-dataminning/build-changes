import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cwc {
   private static final Strategy<? super cwb> a = new Strategy<cwb>() {
      public int a(@Nullable cwb $$0) {
         return cwb.a($$0);
      }

      public boolean a(@Nullable cwb $$0, @Nullable cwb $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cwb.c($$0, $$1);
      }
   };

   public static Set<cwb> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
