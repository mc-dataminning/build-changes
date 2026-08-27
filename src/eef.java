import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class eef extends eec {
   protected final long c;
   protected final elx.a d;
   protected final float e;
   protected final elx f;

   protected static <P extends eef> P3<Mu<P>, Long, elx.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         elx.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         axm.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected eef(long $$0, elx.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = elx.b(new dxs(new dwu($$0)), $$1);
   }

   protected double a(io $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
