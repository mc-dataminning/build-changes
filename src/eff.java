import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eff extends efe {
   public static final MapCodec<eff> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eff::new));
   protected final List<dsa> h;

   protected static <P extends eff> P4<Mu<P>, Long, emw.a, Float, List<dsa>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsa.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eff(long $$0, emw.a $$1, float $$2, List<dsa> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efc<?> a() {
      return efc.d;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsa a(List<dsa> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsa a(List<dsa> $$0, double $$1) {
      double $$2 = ayx.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
