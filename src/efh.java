import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efh extends efg {
   public static final MapCodec<efh> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efh::new));
   protected final List<dsc> h;

   protected static <P extends efh> P4<Mu<P>, Long, emy.a, Float, List<dsc>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsc.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efh(long $$0, emy.a $$1, float $$2, List<dsc> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efe<?> a() {
      return efe.d;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsc a(List<dsc> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsc a(List<dsc> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
