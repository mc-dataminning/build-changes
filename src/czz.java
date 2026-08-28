import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class czz {
   private static final Strategy<? super czy> a = new Strategy<czy>() {
      public int a(@Nullable czy $$0) {
         return czy.b($$0);
      }

      public boolean a(@Nullable czy $$0, @Nullable czy $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && czy.c($$0, $$1);
      }
   };

   public static Set<czy> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
