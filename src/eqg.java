import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eqg implements eqc {
   private static final eqg b = new eqg();
   public static final Codec<eqg> a = Codec.unit(b);

   private eqg() {
   }

   @Override
   public eqd b() {
      return eqe.h;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.b);
   }

   public boolean a(enb $$0) {
      return $$0.a(epo.b);
   }

   public static eqc.a c() {
      return () -> b;
   }
}
