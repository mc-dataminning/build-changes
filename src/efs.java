import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class efs extends efp {
   protected final long c;
   protected final enk.a d;
   protected final float e;
   protected final enk f;

   protected static <P extends efs> P3<Mu<P>, Long, enk.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         enk.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         axo.m.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected efs(long $$0, enk.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = enk.b(new dze(new dyg($$0)), $$1);
   }

   protected double a(ja $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
