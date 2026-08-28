import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class egn extends egm {
   public static final MapCodec<egn> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, egn::new));
   protected final List<dtc> h;

   protected static <P extends egn> P4<Mu<P>, Long, eoh.a, Float, List<dtc>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dtc.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public egn(long $$0, eoh.a $$1, float $$2, List<dtc> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected egk<?> a() {
      return egk.d;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dtc a(List<dtc> $$0, jd $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dtc a(List<dtc> $$0, double $$1) {
      double $$2 = ayo.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
