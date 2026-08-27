import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dwd extends dwc {
   public static final Codec<dwd> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dwd::new));
   protected final List<djh> h;

   protected static <P extends dwd> P4<Mu<P>, Long, edu.a, Float, List<djh>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(djh.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dwd(long $$0, edu.a $$1, float $$2, List<djh> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dwa<?> a() {
      return dwa.d;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected djh a(List<djh> $$0, hx $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected djh a(List<djh> $$0, double $$1) {
      double $$2 = auo.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
