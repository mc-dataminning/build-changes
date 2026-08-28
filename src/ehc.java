import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ehc implements egj {
   public static final Codec<ehc> a = ays.b(ekv.c).fieldOf("features").xmap(ehc::new, $$0 -> $$0.b).codec();
   public final jt<ekv> b;

   public ehc(jt<ekv> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<edr<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
