import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eqp implements eql {
   private static final eqp b = new eqp();
   public static final Codec<eqp> a = Codec.unit(b);

   private eqp() {
   }

   @Override
   public eqm b() {
      return eqn.h;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.b);
   }

   public boolean a(enk $$0) {
      return $$0.a(epx.b);
   }

   public static eql.a c() {
      return () -> b;
   }
}
