import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dtz implements dtg {
   public static final Codec<dtz> a = atg.b(dxs.c).fieldOf("features").xmap(dtz::new, $$0 -> $$0.b).codec();
   public final ij<dxs> b;

   public dtz(ij<dxs> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dqp<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
