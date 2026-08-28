import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class ekg extends ekd {
   protected final long c;
   protected final esc.a d;
   protected final float e;
   protected final esc f;

   protected static <P extends ekg> P3<Mu<P>, Long, esc.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         esc.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         ayi.o.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected ekg(long $$0, esc.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = esc.b(new edr(new ect($$0)), $$1);
   }

   protected double a(ji $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
