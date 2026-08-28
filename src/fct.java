import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fct implements fcx {
   private static final fct b = new fct();
   public static final MapCodec<fct> a = MapCodec.unit(b);

   private fct() {
   }

   @Override
   public fcy b() {
      return fcz.l;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.j);
   }

   public boolean a(ezo $$0) {
      Float $$1 = $$0.c(fci.j);
      if ($$1 != null) {
         azv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fcx.a c() {
      return () -> b;
   }
}
