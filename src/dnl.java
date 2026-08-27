import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dnl implements dms {
   public static final Codec<dnl> a = aoi.b(dre.c).fieldOf("features").xmap(dnl::new, $$0 -> $$0.b).codec();
   public final hi<dre> b;

   public dnl(hi<dre> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dkb<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
