import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efj implements eff {
   private static final efj b = new efj();
   public static final Codec<efj> a = Codec.unit(b);

   private efj() {
   }

   @Override
   public efg b() {
      return efh.h;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.b);
   }

   public boolean a(ecg $$0) {
      return $$0.a(eer.b);
   }

   public static eff.a c() {
      return () -> b;
   }
}
