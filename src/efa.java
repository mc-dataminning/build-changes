import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efa implements eeh {
   public static final Codec<efa> a = axw.b(eit.c).fieldOf("features").xmap(efa::new, $$0 -> $$0.b).codec();
   public final jq<eit> b;

   public efa(jq<eit> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ebq<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
