import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class emb implements eli {
   public static final Codec<emb> a = ayu.c(epx.c).fieldOf("features").xmap(emb::new, $$0 -> $$0.b).codec();
   public final ji<epx> b;

   public emb(ji<epx> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eiq<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
