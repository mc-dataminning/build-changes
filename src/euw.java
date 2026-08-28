import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class euw implements eva {
   private static final euw b = new euw();
   public static final MapCodec<euw> a = MapCodec.unit(b);

   private euw() {
   }

   @Override
   public evb b() {
      return evc.l;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.j);
   }

   public boolean a(erp $$0) {
      Float $$1 = $$0.c(eul.j);
      if ($$1 != null) {
         ayw $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eva.a c() {
      return () -> b;
   }
}
