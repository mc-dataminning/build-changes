import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class egp extends ego {
   public static final Codec<egp> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, egp::new));
   protected final List<dtc> h;

   protected static <P extends egp> P4<Mu<P>, Long, eoh.a, Float, List<dtc>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dtc.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public egp(long $$0, eoh.a $$1, float $$2, List<dtc> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected egm<?> a() {
      return egm.d;
   }

   @Override
   public dtc a(ayt $$0, ir $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dtc a(List<dtc> $$0, ir $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dtc a(List<dtc> $$0, double $$1) {
      double $$2 = aym.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
