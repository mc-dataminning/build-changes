import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dru extends drt {
   public static final Codec<dru> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dru::new));
   protected final List<dey> h;

   protected static <P extends dru> P4<Mu<P>, Long, dze.a, Float, List<dey>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dey.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dru(long $$0, dze.a $$1, float $$2, List<dey> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected drr<?> a() {
      return drr.d;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dey a(List<dey> $$0, gv $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dey a(List<dey> $$0, double $$1) {
      double $$2 = aro.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
