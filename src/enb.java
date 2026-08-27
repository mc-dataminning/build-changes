import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class enb implements emx {
   private static final enb b = new enb();
   public static final Codec<enb> a = Codec.unit(b);

   private enb() {
   }

   @Override
   public emy b() {
      return emz.h;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(emj.b);
   }

   public boolean a(ejy $$0) {
      return $$0.a(emj.b);
   }

   public static emx.a c() {
      return () -> b;
   }
}
