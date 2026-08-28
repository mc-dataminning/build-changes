import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class edx implements ede {
   public static final Codec<edx> a = ayh.b(ehq.c).fieldOf("features").xmap(edx::new, $$0 -> $$0.b).codec();
   public final jm<ehq> b;

   public edx(jm<ehq> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<ean<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
