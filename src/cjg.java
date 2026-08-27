import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cjg {
   private static final Strategy<? super cjf> a = new Strategy<cjf>() {
      public int a(@Nullable cjf $$0) {
         return cjg.a($$0);
      }

      public boolean a(@Nullable cjf $$0, @Nullable cjf $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cjf.c($$0, $$1);
      }
   };

   static int a(@Nullable cjf $$0) {
      if ($$0 != null) {
         qy $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cjf> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
