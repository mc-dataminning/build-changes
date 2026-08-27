import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqn implements dpu {
   public static final Codec<dqn> a = arj.b(dug.c).fieldOf("features").xmap(dqn::new, $$0 -> $$0.b).codec();
   public final hi<dug> b;

   public dqn(hi<dug> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dnd<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
