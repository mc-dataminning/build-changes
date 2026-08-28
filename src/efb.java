import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efb implements eei {
   public static final Codec<efb> a = axw.b(eiv.c).fieldOf("features").xmap(efb::new, $$0 -> $$0.b).codec();
   public final jq<eiv> b;

   public efb(jq<eiv> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
