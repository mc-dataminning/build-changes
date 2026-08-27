import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duk implements dtr {
   public static final Codec<duk> a = atq.b(dyd.c).fieldOf("features").xmap(duk::new, $$0 -> $$0.b).codec();
   public final il<dyd> b;

   public duk(il<dyd> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dra<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
