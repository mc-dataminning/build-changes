import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class eeb implements edi {
   public static final Codec<eeb> a = axm.b(ehu.c).fieldOf("features").xmap(eeb::new, $$0 -> $$0.b).codec();
   public final jn<ehu> b;

   public eeb(jn<ehu> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ear<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
