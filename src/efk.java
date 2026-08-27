import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efk implements efg {
   private static final efk b = new efk();
   public static final Codec<efk> a = Codec.unit(b);

   private efk() {
   }

   @Override
   public efh b() {
      return efi.h;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.b);
   }

   public boolean a(ech $$0) {
      return $$0.a(ees.b);
   }

   public static efg.a c() {
      return () -> b;
   }
}
