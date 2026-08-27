import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class elq implements elu {
   private static final elq b = new elq();
   public static final Codec<elq> a = Codec.unit(b);

   private elq() {
   }

   @Override
   public elv b() {
      return elw.m;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.j);
   }

   public boolean a(eiv $$0) {
      Float $$1 = $$0.c(elg.j);
      if ($$1 != null) {
         awo $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static elu.a c() {
      return () -> b;
   }
}
