import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dui extends duf {
   protected final long c;
   protected final eca.a d;
   protected final float e;
   protected final eca f;

   protected static <P extends dui> P3<Mu<P>, Long, eca.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eca.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         asy.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dui(long $$0, eca.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eca.b(new dnv(new dmx($$0)), $$1);
   }

   protected double a(hx $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
