import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eld extends elc {
   public static final MapCodec<eld> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eld::new));
   protected final List<dxq> h;

   protected static <P extends eld> P4<Mu<P>, Long, esz.a, Float, List<dxq>> b(Instance<P> $$0) {
      return a($$0).and(ayi.b(dxq.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eld(long $$0, esz.a $$1, float $$2, List<dxq> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ela<?> a() {
      return ela.d;
   }

   @Override
   public dxq a(azh $$0, ji $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dxq a(List<dxq> $$0, ji $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dxq a(List<dxq> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
