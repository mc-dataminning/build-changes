import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class enc extends enb {
   public static final MapCodec<enc> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, enc::new));
   protected final List<dzo> h;

   protected static <P extends enc> P4<Mu<P>, Long, euy.a, Float, List<dzo>> b(Instance<P> $$0) {
      return a($$0).and(ays.b(dzo.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public enc(long $$0, euy.a $$1, float $$2, List<dzo> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected emz<?> a() {
      return emz.d;
   }

   @Override
   public dzo a(azt $$0, iu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dzo a(List<dzo> $$0, iu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dzo a(List<dzo> $$0, double $$1) {
      double $$2 = azk.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
