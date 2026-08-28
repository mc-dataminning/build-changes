import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eei implements edp {
   public static final Codec<eei> a = axo.b(eib.c).fieldOf("features").xmap(eei::new, $$0 -> $$0.b).codec();
   public final jn<eib> b;

   public eei(jn<eib> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eay<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
