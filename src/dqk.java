import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqk implements dpr {
   public static final Codec<dqk> a = aqy.b(dud.c).fieldOf("features").xmap(dqk::new, $$0 -> $$0.b).codec();
   public final hi<dud> b;

   public dqk(hi<dud> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dna<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
