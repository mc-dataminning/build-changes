import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efc extends efb {
   public static final MapCodec<efc> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efc::new));
   protected final List<drx> h;

   protected static <P extends efc> P4<Mu<P>, Long, emt.a, Float, List<drx>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(drx.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efc(long $$0, emt.a $$1, float $$2, List<drx> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eez<?> a() {
      return eez.d;
   }

   @Override
   public drx a(azc $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected drx a(List<drx> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected drx a(List<drx> $$0, double $$1) {
      double $$2 = ayu.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
