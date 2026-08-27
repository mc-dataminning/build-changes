import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dsw extends dst {
   protected final long c;
   protected final eah.a d;
   protected final float e;
   protected final eah f;

   protected static <P extends dsw> P3<Mu<P>, Long, eah.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eah.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         asg.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dsw(long $$0, eah.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eah.b(new dmj(new dll($$0)), $$1);
   }

   protected double a(ht $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
