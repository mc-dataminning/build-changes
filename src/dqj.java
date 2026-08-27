import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class dqj implements dpq {
   public static final Codec<dqj> a = aqy.b(duc.c).fieldOf("features").xmap(dqj::new, $$0 -> $$0.b).codec();
   public final hi<duc> b;

   public dqj(hi<duc> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<dmz<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
