import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edq implements ecx {
   public static final Codec<edq> a = ayc.b(ehj.c).fieldOf("features").xmap(edq::new, $$0 -> $$0.b).codec();
   public final jm<ehj> b;

   public edq(jm<ehj> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eag<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
