import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dur implements dty {
   public static final Codec<dur> a = atw.b(dyk.c).fieldOf("features").xmap(dur::new, $$0 -> $$0.b).codec();
   public final il<dyk> b;

   public dur(il<dyk> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<drh<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
