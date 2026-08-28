import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eko implements ejv {
   public static final Codec<eko> a = ays.c(eok.c).fieldOf("features").xmap(eko::new, $$0 -> $$0.b).codec();
   public final jw<eok> b;

   public eko(jw<eok> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ehd<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
