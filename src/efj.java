import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efj extends efi {
   public static final MapCodec<efj> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efj::new));
   protected final List<dse> h;

   protected static <P extends efj> P4<Mu<P>, Long, ena.a, Float, List<dse>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dse.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efj(long $$0, ena.a $$1, float $$2, List<dse> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efg<?> a() {
      return efg.d;
   }

   @Override
   public dse a(azh $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dse a(List<dse> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dse a(List<dse> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
