import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class esj implements esn {
   private static final esj b = new esj();
   public static final MapCodec<esj> a = MapCodec.unit(b);

   private esj() {
   }

   @Override
   public eso b() {
      return esp.n;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.j);
   }

   public boolean a(eph $$0) {
      Float $$1 = $$0.c(erz.j);
      if ($$1 != null) {
         aym $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static esn.a c() {
      return () -> b;
   }
}
