import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eiv implements eic {
   public static final Codec<eiv> a = ayi.c(emq.c).fieldOf("features").xmap(eiv::new, $$0 -> $$0.b).codec();
   public final jv<emq> b;

   public eiv(jv<emq> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<efk<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
