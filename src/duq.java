import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duq implements dtx {
   public static final Codec<duq> a = atv.b(dyj.c).fieldOf("features").xmap(duq::new, $$0 -> $$0.b).codec();
   public final il<dyj> b;

   public duq(il<dyj> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<drg<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
