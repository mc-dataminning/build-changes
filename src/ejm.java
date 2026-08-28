import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ejm implements eit {
   public static final Codec<ejm> a = azd.b(enh.c).fieldOf("features").xmap(ejm::new, $$0 -> $$0.b).codec();
   public final ju<enh> b;

   public ejm(ju<enh> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<egb<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
