import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqo implements dpv {
   public static final Codec<dqo> a = arb.b(duh.c).fieldOf("features").xmap(dqo::new, $$0 -> $$0.b).codec();
   public final hk<duh> b;

   public dqo(hk<duh> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dne<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
