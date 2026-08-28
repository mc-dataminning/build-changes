import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fcy implements fdc {
   private static final fcy b = new fcy();
   public static final MapCodec<fcy> a = MapCodec.unit(b);

   private fcy() {
   }

   @Override
   public fdd b() {
      return fde.l;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.j);
   }

   public boolean a(ezt $$0) {
      Float $$1 = $$0.c(fcn.j);
      if ($$1 != null) {
         azv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fdc.a c() {
      return () -> b;
   }
}
