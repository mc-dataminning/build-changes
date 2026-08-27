import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class duz implements dug {
   public static final Codec<duz> a = atx.b(dys.c).fieldOf("features").xmap(duz::new, $$0 -> $$0.b).codec();
   public final il<dys> b;

   public duz(il<dys> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<drp<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
