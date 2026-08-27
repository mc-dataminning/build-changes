import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class edm extends edl {
   public static final Codec<edm> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, edm::new));
   protected final List<dqh> h;

   protected static <P extends edm> P4<Mu<P>, Long, eld.a, Float, List<dqh>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dqh.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public edm(long $$0, eld.a $$1, float $$2, List<dqh> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected edj<?> a() {
      return edj.d;
   }

   @Override
   public dqh a(ayg $$0, in $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dqh a(List<dqh> $$0, in $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dqh a(List<dqh> $$0, double $$1) {
      double $$2 = axz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
