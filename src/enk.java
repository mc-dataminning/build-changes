import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class enk implements emr {
   public static final Codec<enk> a = ayy.c(erh.c).fieldOf("features").xmap(enk::new, $$0 -> $$0.b).codec();
   public final jk<erh> b;

   public enk(jk<erh> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ejx<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
