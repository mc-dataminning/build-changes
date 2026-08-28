import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class enb extends emy {
   protected final long c;
   protected final euy.a d;
   protected final float e;
   protected final euy f;

   protected static <P extends enb> P3<Mu<P>, Long, euy.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         euy.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ays.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected enb(long $$0, euy.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = euy.b(new egm(new efo($$0)), $$1);
   }

   protected double a(iu $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
