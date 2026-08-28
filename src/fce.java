import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fce implements fci {
   private static final fce b = new fce();
   public static final MapCodec<fce> a = MapCodec.unit(b);

   private fce() {
   }

   @Override
   public fcj b() {
      return fck.l;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.j);
   }

   public boolean a(eyz $$0) {
      Float $$1 = $$0.c(fbt.j);
      if ($$1 != null) {
         azv $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fci.a c() {
      return () -> b;
   }
}
