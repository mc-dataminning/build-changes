import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class ejh implements ejd {
   private static final ejh b = new ejh();
   public static final Codec<ejh> a = Codec.unit(b);

   private ejh() {
   }

   @Override
   public eje b() {
      return ejf.h;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.b);
   }

   public boolean a(ege $$0) {
      return $$0.a(eip.b);
   }

   public static ejd.a c() {
      return () -> b;
   }
}
