import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eqh implements eql {
   private static final eqh b = new eqh();
   public static final Codec<eqh> a = Codec.unit(b);

   private eqh() {
   }

   @Override
   public eqm b() {
      return eqn.m;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.j);
   }

   public boolean a(enk $$0) {
      Float $$1 = $$0.c(epx.j);
      if ($$1 != null) {
         axt $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static eql.a c() {
      return () -> b;
   }
}
