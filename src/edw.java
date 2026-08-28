import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edw implements edd {
   public static final Codec<edw> a = ayh.b(ehp.c).fieldOf("features").xmap(edw::new, $$0 -> $$0.b).codec();
   public final jm<ehp> b;

   public edw(jm<ehp> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eam<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
