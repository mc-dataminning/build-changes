import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eca implements ebh {
   public static final Codec<eca> a = axh.b(eft.c).fieldOf("features").xmap(eca::new, $$0 -> $$0.b).codec();
   public final ja<eft> b;

   public eca(ja<eft> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dyq<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
