import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class egl implements egh {
   private static final egl b = new egl();
   public static final Codec<egl> a = Codec.unit(b);

   private egl() {
   }

   @Override
   public egi b() {
      return egj.h;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.b);
   }

   public boolean a(edi $$0) {
      return $$0.a(eft.b);
   }

   public static egh.a c() {
      return () -> b;
   }
}
