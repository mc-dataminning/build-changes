import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class emq implements elx {
   public static final Codec<emq> a = ayu.c(eqm.c).fieldOf("features").xmap(emq::new, $$0 -> $$0.b).codec();
   public final jj<eqm> b;

   public emq(jj<eqm> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ejf<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
