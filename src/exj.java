import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class exj implements exn {
   private static final exj b = new exj();
   public static final MapCodec<exj> a = MapCodec.unit(b);

   private exj() {
   }

   @Override
   public exo b() {
      return exp.l;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.j);
   }

   public boolean a(euc $$0) {
      Float $$1 = $$0.c(ewy.j);
      if ($$1 != null) {
         azs $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static exn.a c() {
      return () -> b;
   }
}
