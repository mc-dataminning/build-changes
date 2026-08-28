import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edu implements edb {
   public static final Codec<edu> a = ayg.b(ehn.c).fieldOf("features").xmap(edu::new, $$0 -> $$0.b).codec();
   public final jm<ehn> b;

   public edu(jm<ehn> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eak<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
