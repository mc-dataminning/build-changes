import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class enx implements ent {
   private static final enx b = new enx();
   public static final Codec<enx> a = Codec.unit(b);

   private enx() {
   }

   @Override
   public enu b() {
      return env.h;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.b);
   }

   public boolean a(eku $$0) {
      return $$0.a(enf.b);
   }

   public static ent.a c() {
      return () -> b;
   }
}
