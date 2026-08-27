import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efn implements efr {
   private static final efn b = new efn();
   public static final Codec<efn> a = Codec.unit(b);

   private efn() {
   }

   @Override
   public efs b() {
      return eft.m;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.j);
   }

   public boolean a(ecs $$0) {
      Float $$1 = $$0.c(efd.j);
      if ($$1 != null) {
         ase $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efr.a c() {
      return () -> b;
   }
}
