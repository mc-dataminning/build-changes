import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cue {
   private static final Strategy<? super cud> a = new Strategy<cud>() {
      public int a(@Nullable cud $$0) {
         return cud.a($$0);
      }

      public boolean a(@Nullable cud $$0, @Nullable cud $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.e() == $$1.e() && cud.c($$0, $$1);
      }
   };

   public static Set<cud> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
