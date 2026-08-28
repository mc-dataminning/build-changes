import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eky extends ekx {
   public static final MapCodec<eky> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eky::new));
   protected final List<dxo> h;

   protected static <P extends eky> P4<Mu<P>, Long, est.a, Float, List<dxo>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dxo.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eky(long $$0, est.a $$1, float $$2, List<dxo> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ekv<?> a() {
      return ekv.d;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dxo a(List<dxo> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dxo a(List<dxo> $$0, double $$1) {
      double $$2 = azu.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
