import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class enp implements ent {
   private static final enp b = new enp();
   public static final Codec<enp> a = Codec.unit(b);

   private enp() {
   }

   @Override
   public enu b() {
      return env.m;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.j);
   }

   public boolean a(eku $$0) {
      Float $$1 = $$0.c(enf.j);
      if ($$1 != null) {
         axd $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static ent.a c() {
      return () -> b;
   }
}
