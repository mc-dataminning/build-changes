import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class edc extends ecz {
   protected final long c;
   protected final eku.a d;
   protected final float e;
   protected final eku f;

   protected static <P extends edc> P3<Mu<P>, Long, eku.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eku.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         axe.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected edc(long $$0, eku.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eku.b(new dwp(new dvr($$0)), $$1);
   }

   protected double a(im $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
