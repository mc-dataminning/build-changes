import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class cvt {
   private static final Strategy<? super cvs> a = new Strategy<cvs>() {
      public int a(@Nullable cvs $$0) {
         return cvs.a($$0);
      }

      public boolean a(@Nullable cvs $$0, @Nullable cvs $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && cvs.c($$0, $$1);
      }
   };

   public static Set<cvs> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
