import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class efv implements efr {
   private static final efv b = new efv();
   public static final Codec<efv> a = Codec.unit(b);

   private efv() {
   }

   @Override
   public efs b() {
      return eft.h;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.b);
   }

   public boolean a(ecs $$0) {
      return $$0.a(efd.b);
   }

   public static efr.a c() {
      return () -> b;
   }
}
