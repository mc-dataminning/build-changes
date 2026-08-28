import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efg extends eff {
   public static final MapCodec<efg> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efg::new));
   protected final List<dsb> h;

   protected static <P extends efg> P4<Mu<P>, Long, emx.a, Float, List<dsb>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsb.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efg(long $$0, emx.a $$1, float $$2, List<dsb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efd<?> a() {
      return efd.d;
   }

   @Override
   public dsb a(azg $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsb a(List<dsb> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsb a(List<dsb> $$0, double $$1) {
      double $$2 = ayy.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
