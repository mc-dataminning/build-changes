import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dwc extends dwb {
   public static final Codec<dwc> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dwc::new));
   protected final List<djg> h;

   protected static <P extends dwc> P4<Mu<P>, Long, edt.a, Float, List<djg>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(djg.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dwc(long $$0, edt.a $$1, float $$2, List<djg> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dvz<?> a() {
      return dvz.d;
   }

   @Override
   public djg a(auu $$0, hx $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected djg a(List<djg> $$0, hx $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected djg a(List<djg> $$0, double $$1) {
      double $$2 = aun.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
