import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dzd extends dzc {
   public static final Codec<dzd> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzd::new));
   protected final List<dme> h;

   protected static <P extends dzd> P4<Mu<P>, Long, egu.a, Float, List<dme>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dme.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dzd(long $$0, egu.a $$1, float $$2, List<dme> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dza<?> a() {
      return dza.d;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dme a(List<dme> $$0, ib $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dme a(List<dme> $$0, double $$1) {
      double $$2 = awm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
