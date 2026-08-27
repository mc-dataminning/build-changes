import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ebb implements eai {
   public static final Codec<ebb> a = awu.b(eeu.c).fieldOf("features").xmap(ebb::new, $$0 -> $$0.b).codec();
   public final ir<eeu> b;

   public ebb(ir<eeu> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dxr<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
