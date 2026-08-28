import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class egn implements efu {
   public static final Codec<egn> a = aym.b(ekg.c).fieldOf("features").xmap(egn::new, $$0 -> $$0.b).codec();
   public final jr<ekg> b;

   public egn(jr<ekg> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<edc<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
