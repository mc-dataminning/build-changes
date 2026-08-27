import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dwc extends dvz {
   protected final long c;
   protected final edu.a d;
   protected final float e;
   protected final edu f;

   protected static <P extends dwc> P3<Mu<P>, Long, edu.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         edu.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         atw.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dwc(long $$0, edu.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = edu.b(new dpp(new dor($$0)), $$1);
   }

   protected double a(hx $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
