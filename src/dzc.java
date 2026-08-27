import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dzc extends dyz {
   protected final long c;
   protected final egu.a d;
   protected final float e;
   protected final egu f;

   protected static <P extends dzc> P3<Mu<P>, Long, egu.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         egu.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         avu.l.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dzc(long $$0, egu.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = egu.b(new dsp(new drr($$0)), $$1);
   }

   protected double a(ib $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
