import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class ciy {
   private static final Strategy<? super cix> a = new Strategy<cix>() {
      public int a(@Nullable cix $$0) {
         return ciy.a($$0);
      }

      public boolean a(@Nullable cix $$0, @Nullable cix $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.b() == $$1.b() && cix.c($$0, $$1);
      }
   };

   static int a(@Nullable cix $$0) {
      if ($$0 != null) {
         qr $$1 = $$0.v();
         int $$2 = 31 + $$0.d().hashCode();
         return 31 * $$2 + ($$1 == null ? 0 : $$1.hashCode());
      } else {
         return 0;
      }
   }

   public static Set<cix> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
