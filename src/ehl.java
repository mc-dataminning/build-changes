import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ehl extends ehk {
   public static final MapCodec<ehl> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehl::new));
   protected final List<dua> h;

   protected static <P extends ehl> P4<Mu<P>, Long, epe.a, Float, List<dua>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dua.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ehl(long $$0, epe.a $$1, float $$2, List<dua> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ehi<?> a() {
      return ehi.d;
   }

   @Override
   public dua a(azk $$0, je $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dua a(List<dua> $$0, je $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dua a(List<dua> $$0, double $$1) {
      double $$2 = azc.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
