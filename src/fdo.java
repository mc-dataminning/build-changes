import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fdo implements fds {
   private static final fdo b = new fdo();
   public static final MapCodec<fdo> a = MapCodec.unit(b);

   private fdo() {
   }

   @Override
   public fdt b() {
      return fdu.l;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.j);
   }

   public boolean a(faj $$0) {
      Float $$1 = $$0.c(fdd.j);
      if ($$1 != null) {
         azz $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fds.a c() {
      return () -> b;
   }
}
