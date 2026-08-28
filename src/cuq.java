import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cuq {
   private static final Strategy<? super cup> a = new Strategy<cup>() {
      public int a(@Nullable cup $$0) {
         return cup.a($$0);
      }

      public boolean a(@Nullable cup $$0, @Nullable cup $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cup.c($$0, $$1);
      }
   };

   public static Set<cup> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
