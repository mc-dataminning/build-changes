import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dsg extends dsd {
   protected final long c;
   protected final dzr.a d;
   protected final float e;
   protected final dzr f;

   protected static <P extends dsg> P3<Mu<P>, Long, dzr.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         dzr.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         arh.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dsg(long $$0, dzr.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = dzr.b(new dlt(new dkv($$0)), $$1);
   }

   protected double a(gw $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
