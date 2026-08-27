import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class drt extends drq {
   protected final long c;
   protected final dze.a d;
   protected final float e;
   protected final dze f;

   protected static <P extends drt> P3<Mu<P>, Long, dze.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         dze.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         aqw.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected drt(long $$0, dze.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = dze.b(new dlg(new dki($$0)), $$1);
   }

   protected double a(gv $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
