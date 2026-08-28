import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class emj implements elq {
   public static final Codec<emj> a = ayu.c(eqf.c).fieldOf("features").xmap(emj::new, $$0 -> $$0.b).codec();
   public final ji<eqf> b;

   public emj(ji<eqf> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eiy<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
