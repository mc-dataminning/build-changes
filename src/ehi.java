import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class ehi implements egp {
   public static final Codec<ehi> a = ayt.b(elb.c).fieldOf("features").xmap(ehi::new, $$0 -> $$0.b).codec();
   public final ju<elb> b;

   public ehi(ju<elb> $$0) {
      this.b = $$0;
   }

   @Override
   public Stream<edx<?, ?>> e() {
      return this.b.a().flatMap($$0 -> $$0.a().a());
   }
}
