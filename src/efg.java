import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efg implements efk {
   private static final efg b = new efg();
   public static final Codec<efg> a = Codec.unit(b);

   private efg() {
   }

   @Override
   public efl b() {
      return efm.m;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.j);
   }

   public boolean a(ecl $$0) {
      Float $$1 = $$0.c(eew.j);
      if ($$1 != null) {
         arx $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efk.a c() {
      return () -> b;
   }
}
