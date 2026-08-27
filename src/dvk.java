import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dvk extends dvh {
   protected final long c;
   protected final edc.a d;
   protected final float e;
   protected final edc f;

   protected static <P extends dvk> P3<Mu<P>, Long, edc.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         edc.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         atg.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dvk(long $$0, edc.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = edc.b(new dox(new dnz($$0)), $$1);
   }

   protected double a(hv $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
