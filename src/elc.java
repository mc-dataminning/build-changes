import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class elc extends ekz {
   protected final long c;
   protected final esz.a d;
   protected final float e;
   protected final esz f;

   protected static <P extends elc> P3<Mu<P>, Long, esz.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         esz.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayi.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected elc(long $$0, esz.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = esz.b(new een(new edp($$0)), $$1);
   }

   protected double a(ji $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
