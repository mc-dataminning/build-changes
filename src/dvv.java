import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dvv extends dvs {
   protected final long c;
   protected final edn.a d;
   protected final float e;
   protected final edn f;

   protected static <P extends dvv> P3<Mu<P>, Long, edn.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         edn.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         atq.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dvv(long $$0, edn.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = edn.b(new dpi(new dok($$0)), $$1);
   }

   protected double a(hx $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
