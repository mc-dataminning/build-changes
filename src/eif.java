import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eif implements eib {
   private static final eif b = new eif();
   public static final Codec<eif> a = Codec.unit(b);

   private eif() {
   }

   @Override
   public eic b() {
      return eid.h;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.b);
   }

   public boolean a(efc $$0) {
      return $$0.a(ehn.b);
   }

   public static eib.a c() {
      return () -> b;
   }
}
