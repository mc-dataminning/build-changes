import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdy implements fec {
   private static final fdy b = new fdy();
   public static final MapCodec<fdy> a = MapCodec.unit(b);

   private fdy() {
   }

   @Override
   public fed b() {
      return fee.l;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.j);
   }

   public boolean a(fat $$0) {
      Float $$1 = $$0.c(fdn.j);
      if ($$1 != null) {
         bai $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fec.a c() {
      return () -> b;
   }
}
