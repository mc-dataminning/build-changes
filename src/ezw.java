import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ezw implements ezs {
   private static final ezw b = new ezw();
   public static final MapCodec<ezw> a = MapCodec.unit(b);

   private ezw() {
   }

   @Override
   public ezt b() {
      return ezu.g;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.b);
   }

   public boolean a(ewh $$0) {
      return $$0.a(ezd.b);
   }

   public static ezs.a c() {
      return () -> b;
   }
}
