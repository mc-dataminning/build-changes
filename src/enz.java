import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.Set;

public class enz implements env {
   private static final enz b = new enz();
   public static final Codec<enz> a = Codec.unit(b);

   private enz() {
   }

   @Override
   public enw b() {
      return enx.h;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.b);
   }

   public boolean a(ekw $$0) {
      return $$0.a(enh.b);
   }

   public static env.a c() {
      return () -> b;
   }
}
