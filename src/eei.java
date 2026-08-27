import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eei extends eeh {
   public static final MapCodec<eei> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eei::new));
   protected final List<drd> h;

   protected static <P extends eei> P4<Mu<P>, Long, elz.a, Float, List<drd>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(drd.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eei(long $$0, elz.a $$1, float $$2, List<drd> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eef<?> a() {
      return eef.d;
   }

   @Override
   public drd a(aym $$0, io $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected drd a(List<drd> $$0, io $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected drd a(List<drd> $$0, double $$1) {
      double $$2 = ayf.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
