import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dyh extends dye {
   protected final long c;
   protected final efz.a d;
   protected final float e;
   protected final efz f;

   protected static <P extends dyh> P3<Mu<P>, Long, efz.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         efz.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         avq.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dyh(long $$0, efz.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = efz.b(new dru(new dqw($$0)), $$1);
   }

   protected double a(hz $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
