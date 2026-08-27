import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dss implements drz {
   public static final Codec<dss> a = asu.b(dwl.c).fieldOf("features").xmap(dss::new, $$0 -> $$0.b).codec();
   public final ig<dwl> b;

   public dss(ig<dwl> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dpi<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
