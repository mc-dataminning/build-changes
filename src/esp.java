import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import java.util.Set;

public class esp implements esl {
   private static final esp b = new esp();
   public static final MapCodec<esp> a = MapCodec.unit(b);

   private esp() {
   }

   @Override
   public esm b() {
      return esn.i;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.b);
   }

   public boolean a(epf $$0) {
      return $$0.a(erx.b);
   }

   public static esl.a c() {
      return () -> b;
   }
}
