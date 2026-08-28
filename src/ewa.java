import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ewa implements ewe {
   private static final ewa b = new ewa();
   public static final MapCodec<ewa> a = MapCodec.unit(b);

   private ewa() {
   }

   @Override
   public ewf b() {
      return ewg.l;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.j);
   }

   public boolean a(est $$0) {
      Float $$1 = $$0.c(evp.j);
      if ($$1 != null) {
         azk $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ewe.a c() {
      return () -> b;
   }
}
