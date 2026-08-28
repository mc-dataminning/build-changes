import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ekf extends eke {
   public static final MapCodec<ekf> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekf::new));
   protected final List<dwv> h;

   protected static <P extends ekf> P4<Mu<P>, Long, esa.a, Float, List<dwv>> b(Instance<P> $$0) {
      return a($$0).and(ayh.b(dwv.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ekf(long $$0, esa.a $$1, float $$2, List<dwv> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ekc<?> a() {
      return ekc.d;
   }

   @Override
   public dwv a(azg $$0, ji $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dwv a(List<dwv> $$0, ji $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dwv a(List<dwv> $$0, double $$1) {
      double $$2 = ayy.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
