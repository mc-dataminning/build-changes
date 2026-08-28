import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cur {
   private static final Strategy<? super cuq> a = new Strategy<cuq>() {
      public int a(@Nullable cuq $$0) {
         return cuq.a($$0);
      }

      public boolean a(@Nullable cuq $$0, @Nullable cuq $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cuq.c($$0, $$1);
      }
   };

   public static Set<cuq> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
