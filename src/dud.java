import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dud extends dua {
   protected final long c;
   protected final ebv.a d;
   protected final float e;
   protected final ebv f;

   protected static <P extends dud> P3<Mu<P>, Long, ebv.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         ebv.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         asu.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dud(long $$0, ebv.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = ebv.b(new dnq(new dms($$0)), $$1);
   }

   protected double a(ht $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
