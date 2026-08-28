import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etv implements etz {
   private static final etv b = new etv();
   public static final MapCodec<etv> a = MapCodec.unit(b);

   private etv() {
   }

   @Override
   public eua b() {
      return eub.l;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.j);
   }

   public boolean a(eqo $$0) {
      Float $$1 = $$0.c(etk.j);
      if ($$1 != null) {
         aym $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static etz.a c() {
      return () -> b;
   }
}
