import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eeh implements edo {
   public static final Codec<eeh> a = axo.b(eia.c).fieldOf("features").xmap(eeh::new, $$0 -> $$0.b).codec();
   public final jn<eia> b;

   public eeh(jn<eia> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eax<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
