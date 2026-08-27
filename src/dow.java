import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class dow extends dot {
   protected final long c;
   protected final dwh.a d;
   protected final float e;
   protected final dwh f;

   protected static <P extends dow> P3<Mu<P>, Long, dwh.a, Float> a(Instance<P> $$0) {
      return $$0.group(
         Codec.LONG.fieldOf("seed").forGetter($$0x -> $$0x.c),
         dwh.a.a.fieldOf("noise").forGetter($$0x -> $$0x.d),
         aoi.k.fieldOf("scale").forGetter($$0x -> $$0x.e)
      );
   }

   protected dow(long $$0, dwh.a $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = dwh.b(new dij(new dhl($$0)), $$1);
   }

   protected double a(gu $$0, double $$1) {
      return this.f.a((double)$$0.u() * $$1, (double)$$0.v() * $$1, (double)$$0.w() * $$1);
   }
}
