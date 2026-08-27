import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqv implements dqc {
   public static final Codec<dqv> a = arh.b(duo.c).fieldOf("features").xmap(dqv::new, $$0 -> $$0.b).codec();
   public final hk<duo> b;

   public dqv(hk<duo> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dnl<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
