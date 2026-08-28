import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edv implements edc {
   public static final Codec<edv> a = ayh.b(eho.c).fieldOf("features").xmap(edv::new, $$0 -> $$0.b).codec();
   public final jm<eho> b;

   public edv(jm<eho> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eal<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
