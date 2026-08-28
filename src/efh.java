import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efh extends efe {
   protected final long c;
   protected final emz.a d;
   protected final float e;
   protected final emz f;

   protected static <P extends efh> P3<Mu<P>, Long, emz.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         emz.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayh.m.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected efh(long $$0, emz.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = emz.b(new dyu(new dxw($$0)), $$1);
   }

   protected double a(iz $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
