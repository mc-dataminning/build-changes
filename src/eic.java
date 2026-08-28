import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eic extends ehz {
   protected final long c;
   protected final epw.a d;
   protected final float e;
   protected final epw f;

   protected static <P extends eic> P3<Mu<P>, Long, epw.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         epw.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayo.n.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eic(long $$0, epw.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = epw.b(new ebn(new eap($$0)), $$1);
   }

   protected double a(jf $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
