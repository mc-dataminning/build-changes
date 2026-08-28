import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cud {
   private static final Strategy<? super cuc> a = new Strategy<cuc>() {
      public int a(@Nullable cuc $$0) {
         return cuc.a($$0);
      }

      public boolean a(@Nullable cuc $$0, @Nullable cuc $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cuc.c($$0, $$1);
      }
   };

   public static Set<cuc> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
