import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ebr implements eay {
   public static final Codec<ebr> a = axe.b(efk.c).fieldOf("features").xmap(ebr::new, $$0 -> $$0.b).codec();
   public final iz<efk> b;

   public ebr(iz<efk> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dyh<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
