import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dru extends drr {
   protected final long c;
   protected final dzf.a d;
   protected final float e;
   protected final dzf f;

   protected static <P extends dru> P3<Mu<P>, Long, dzf.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         dzf.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         aqy.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dru(long $$0, dzf.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = dzf.b(new dlh(new dkj($$0)), $$1);
   }

   protected double a(gu $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
