import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class emt implements emx {
   private static final emt b = new emt();
   public static final Codec<emt> a = Codec.unit(b);

   private emt() {
   }

   @Override
   public emy b() {
      return emz.m;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.j);
   }

   public boolean a(ejy $$0) {
      Float $$1 = $$0.c(emj.j);
      if ($$1 != null) {
         awt $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static emx.a c() {
      return () -> b;
   }
}
