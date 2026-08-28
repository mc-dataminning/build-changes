import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eni implements emp {
   public static final Codec<eni> a = ayw.c(erf.c).fieldOf("features").xmap(eni::new, $$0 -> $$0.b).codec();
   public final jj<erf> b;

   public eni(jj<erf> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ejv<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
