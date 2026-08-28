import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class emv implements emc {
   public static final Codec<emv> a = ayu.c(eqr.c).fieldOf("features").xmap(emv::new, $$0 -> $$0.b).codec();
   public final jj<eqr> b;

   public emv(jj<eqr> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ejk<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
