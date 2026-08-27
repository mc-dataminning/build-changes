import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class eft implements efp {
   private static final eft b = new eft();
   public static final Codec<eft> a = Codec.unit(b);

   private eft() {
   }

   @Override
   public efq b() {
      return efr.h;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.b);
   }

   public boolean a(ecq $$0) {
      return $$0.a(efb.b);
   }

   public static efp.a c() {
      return () -> b;
   }
}
