import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eov extends eos {
   protected final long c;
   protected final ewt.a d;
   protected final float e;
   protected final ewt f;

   protected static <P extends eov> P3<Mu<P>, Long, ewt.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         ewt.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayy.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eov(long $$0, ewt.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = ewt.b(new eie(new ehg($$0)), $$1);
   }

   protected double a(iw $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
