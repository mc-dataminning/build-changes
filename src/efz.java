import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class efz implements efg {
   public static final Codec<efz> a = ayl.b(ejs.c).fieldOf("features").xmap(efz::new, $$0 -> $$0.b).codec();
   public final jr<ejs> b;

   public efz(jr<ejs> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<eco<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
