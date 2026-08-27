import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dwk extends dwh {
   protected final long c;
   protected final eec.a d;
   protected final float e;
   protected final eec f;

   protected static <P extends dwk> P3<Mu<P>, Long, eec.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eec.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         atx.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dwk(long $$0, eec.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eec.b(new dpx(new doz($$0)), $$1);
   }

   protected double a(hx $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
