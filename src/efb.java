import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efb implements eff {
   private static final efb b = new efb();
   public static final Codec<efb> a = Codec.unit(b);

   private efb() {
   }

   @Override
   public efg b() {
      return efh.m;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.j);
   }

   public boolean a(ecg $$0) {
      Float $$1 = $$0.c(eer.j);
      if ($$1 != null) {
         aru $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eff.a c() {
      return () -> b;
   }
}
