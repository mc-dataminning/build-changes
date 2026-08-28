import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eki extends ekh {
   public static final MapCodec<eki> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eki::new));
   protected final List<dwy> h;

   protected static <P extends eki> P4<Mu<P>, Long, esd.a, Float, List<dwy>> b(Instance<P> $$0) {
      return a($$0).and(ayi.b(dwy.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eki(long $$0, esd.a $$1, float $$2, List<dwy> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ekf<?> a() {
      return ekf.d;
   }

   @Override
   public dwy a(azh $$0, ji $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dwy a(List<dwy> $$0, ji $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dwy a(List<dwy> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
