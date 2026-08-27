import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class epy implements eqc {
   private static final epy b = new epy();
   public static final Codec<epy> a = Codec.unit(b);

   private epy() {
   }

   @Override
   public eqd b() {
      return eqe.m;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.j);
   }

   public boolean a(enb $$0) {
      Float $$1 = $$0.c(epo.j);
      if ($$1 != null) {
         axr $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eqc.a c() {
      return () -> b;
   }
}
