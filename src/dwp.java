import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dwp implements dvw {
   public static final Codec<dwp> a = avp.b(eai.c).fieldOf("features").xmap(dwp::new, $$0 -> $$0.b).codec();
   public final in<eai> b;

   public dwp(in<eai> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dtf<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
