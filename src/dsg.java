import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dsg implements drn {
   public static final Codec<dsg> a = asq.b(dvz.c).fieldOf("features").xmap(dsg::new, $$0 -> $$0.b).codec();
   public final ig<dvz> b;

   public dsg(ig<dvz> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dow<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
