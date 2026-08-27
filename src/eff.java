import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eff implements efj {
   private static final eff b = new eff();
   public static final Codec<eff> a = Codec.unit(b);

   private eff() {
   }

   @Override
   public efk b() {
      return efl.m;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.j);
   }

   public boolean a(eck $$0) {
      Float $$1 = $$0.c(eev.j);
      if ($$1 != null) {
         ash $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static efj.a c() {
      return () -> b;
   }
}
