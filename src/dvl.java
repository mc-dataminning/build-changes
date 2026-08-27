import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dvl extends dvk {
   public static final Codec<dvl> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvl::new));
   protected final List<dip> h;

   protected static <P extends dvl> P4<Mu<P>, Long, edc.a, Float, List<dip>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dip.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dvl(long $$0, edc.a $$1, float $$2, List<dip> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dvi<?> a() {
      return dvi.d;
   }

   @Override
   public dip a(auf $$0, hv $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dip a(List<dip> $$0, hv $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dip a(List<dip> $$0, double $$1) {
      double $$2 = aty.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
