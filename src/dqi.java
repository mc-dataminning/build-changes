import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqi implements dpp {
   public static final Codec<dqi> a = aqw.b(dub.c).fieldOf("features").xmap(dqi::new, $$0 -> $$0.b).codec();
   public final hj<dub> b;

   public dqi(hj<dub> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dmy<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
