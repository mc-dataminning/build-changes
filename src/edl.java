import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class edl extends edi {
   protected final long c;
   protected final eld.a d;
   protected final float e;
   protected final eld f;

   protected static <P extends edl> P3<Mu<P>, Long, eld.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         eld.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         axh.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected edl(long $$0, eld.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = eld.b(new dwy(new dwa($$0)), $$1);
   }

   protected double a(in $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
