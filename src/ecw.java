import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ecw implements ecd {
   public static final Codec<ecw> a = axn.b(egp.c).fieldOf("features").xmap(ecw::new, $$0 -> $$0.b).codec();
   public final jb<egp> b;

   public ecw(jb<egp> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dzm<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
