import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eix extends eiu {
   protected final long c;
   protected final eqr.a d;
   protected final float e;
   protected final eqr f;

   protected static <P extends eix> P3<Mu<P>, Long, eqr.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eqr.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayw.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eix(long $$0, eqr.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eqr.b(new eci(new ebk($$0)), $$1);
   }

   protected double a(jh $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
