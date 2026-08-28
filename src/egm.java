import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class egm extends egj {
   protected final long c;
   protected final eoh.a d;
   protected final float e;
   protected final eoh f;

   protected static <P extends egm> P3<Mu<P>, Long, eoh.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eoh.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         axw.m.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected egm(long $$0, eoh.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eoh.b(new dzx(new dyz($$0)), $$1);
   }

   protected double a(jd $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
