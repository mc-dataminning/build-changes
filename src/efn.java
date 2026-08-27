import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efn implements efj {
   private static final efn b = new efn();
   public static final Codec<efn> a = Codec.unit(b);

   private efn() {
   }

   @Override
   public efk b() {
      return efl.h;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.b);
   }

   public boolean a(eck $$0) {
      return $$0.a(eev.b);
   }

   public static efj.a c() {
      return () -> b;
   }
}
