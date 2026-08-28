import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class elq implements ekx {
   public static final Codec<elq> a = ays.c(epm.c).fieldOf("features").xmap(elq::new, $$0 -> $$0.b).codec();
   public final ji<epm> b;

   public elq(ji<epm> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eif<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
