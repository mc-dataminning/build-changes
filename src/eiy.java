import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eiy extends eix {
   public static final MapCodec<eiy> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eiy::new));
   protected final List<dvo> h;

   protected static <P extends eiy> P4<Mu<P>, Long, eqr.a, Float, List<dvo>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dvo.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eiy(long $$0, eqr.a $$1, float $$2, List<dvo> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eiv<?> a() {
      return eiv.d;
   }

   @Override
   public dvo a(azv $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dvo a(List<dvo> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dvo a(List<dvo> $$0, double $$1) {
      double $$2 = azn.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
