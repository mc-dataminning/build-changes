import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eje extends ejb {
   protected final long c;
   protected final eqy.a d;
   protected final float e;
   protected final eqy f;

   protected static <P extends eje> P3<Mu<P>, Long, eqy.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eqy.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayv.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eje(long $$0, eqy.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eqy.b(new ecp(new ebr($$0)), $$1);
   }

   protected double a(jh $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
