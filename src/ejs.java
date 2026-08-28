import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ejs implements eiz {
   public static final Codec<ejs> a = azn.b(enn.c).fieldOf("features").xmap(ejs::new, $$0 -> $$0.b).codec();
   public final ju<enn> b;

   public ejs(ju<enn> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<egh<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
