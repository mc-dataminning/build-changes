import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eyw implements eza {
   private static final eyw b = new eyw();
   public static final MapCodec<eyw> a = MapCodec.unit(b);

   private eyw() {
   }

   @Override
   public ezb b() {
      return ezc.l;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.j);
   }

   public boolean a(evr $$0) {
      Float $$1 = $$0.c(eyl.j);
      if ($$1 != null) {
         azh $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eza.a c() {
      return () -> b;
   }
}
