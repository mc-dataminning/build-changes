import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ckk {
   private static final Strategy<? super ckj> a = new Strategy<ckj>() {
      public int a(@Nullable ckj $$0) {
         return ckk.a($$0);
      }

      public boolean a(@Nullable ckj $$0, @Nullable ckj $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && ckj.c($$0, $$1);
      }
   };

   static int a(@Nullable ckj $$0) {
      if ($$0 != null) {
         rt $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<ckj> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
