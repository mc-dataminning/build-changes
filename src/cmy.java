import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cmy {
   private static final Strategy<? super cmx> a = new Strategy<cmx>() {
      public int a(@Nullable cmx $$0) {
         return cmy.a($$0);
      }

      public boolean a(@Nullable cmx $$0, @Nullable cmx $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cmx.c($$0, $$1);
      }
   };

   static int a(@Nullable cmx $$0) {
      if ($$0 != null) {
         sn $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cmx> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
