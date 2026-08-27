import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ecm extends ecj {
   protected final long c;
   protected final eke.a d;
   protected final float e;
   protected final eke f;

   protected static <P extends ecm> P3<Mu<P>, Long, eke.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eke.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         awu.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected ecm(long $$0, eke.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eke.b(new dvz(new dvb($$0)), $$1);
   }

   protected double a(id $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
