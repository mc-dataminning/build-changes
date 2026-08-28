import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class eud implements etz {
   private static final eud b = new eud();
   public static final MapCodec<eud> a = MapCodec.unit(b);

   private eud() {
   }

   @Override
   public eua b() {
      return eub.g;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.b);
   }

   public boolean a(eqo $$0) {
      return $$0.a(etk.b);
   }

   public static etz.a c() {
      return () -> b;
   }
}
