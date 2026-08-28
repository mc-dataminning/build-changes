import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class etq implements etu {
   private static final etq b = new etq();
   public static final MapCodec<etq> a = MapCodec.unit(b);

   private etq() {
   }

   @Override
   public etv b() {
      return etw.n;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.j);
   }

   public boolean a(eqk $$0) {
      Float $$1 = $$0.c(etg.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static etu.a c() {
      return () -> b;
   }
}
