import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efb extends eey {
   protected final long c;
   protected final emt.a d;
   protected final float e;
   protected final emt f;

   protected static <P extends efb> P3<Mu<P>, Long, emt.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         emt.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayc.m.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected efb(long $$0, emt.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = emt.b(new dyo(new dxq($$0)), $$1);
   }

   protected double a(iz $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
