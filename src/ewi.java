import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class ewi implements ewe {
   private static final ewi b = new ewi();
   public static final MapCodec<ewi> a = MapCodec.unit(b);

   private ewi() {
   }

   @Override
   public ewf b() {
      return ewg.g;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.b);
   }

   public boolean a(est $$0) {
      return $$0.a(evp.b);
   }

   public static ewe.a c() {
      return () -> b;
   }
}
