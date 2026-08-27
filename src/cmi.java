import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cmi {
   private static final Strategy<? super cmh> a = new Strategy<cmh>() {
      public int a(@Nullable cmh $$0) {
         return cmi.a($$0);
      }

      public boolean a(@Nullable cmh $$0, @Nullable cmh $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cmh.c($$0, $$1);
      }
   };

   static int a(@Nullable cmh $$0) {
      if ($$0 != null) {
         sj $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cmh> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
