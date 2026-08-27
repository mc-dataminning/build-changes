import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dwb extends dvy {
   protected final long c;
   protected final edt.a d;
   protected final float e;
   protected final edt f;

   protected static <P extends dwb> P3<Mu<P>, Long, edt.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         edt.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         atv.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dwb(long $$0, edt.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = edt.b(new dpo(new doq($$0)), $$1);
   }

   protected double a(hx $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
