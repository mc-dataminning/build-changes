import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ekx extends eku {
   protected final long c;
   protected final est.a d;
   protected final float e;
   protected final est f;

   protected static <P extends ekx> P3<Mu<P>, Long, est.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         est.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         azd.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected ekx(long $$0, est.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = est.b(new eei(new edk($$0)), $$1);
   }

   protected double a(jh $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
