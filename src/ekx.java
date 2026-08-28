import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ekx extends ekw {
   public static final MapCodec<ekx> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekx::new));
   protected final List<dxn> h;

   protected static <P extends ekx> P4<Mu<P>, Long, ess.a, Float, List<dxn>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dxn.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ekx(long $$0, ess.a $$1, float $$2, List<dxn> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eku<?> a() {
      return eku.d;
   }

   @Override
   public dxn a(bam $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dxn a(List<dxn> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dxn a(List<dxn> $$0, double $$1) {
      double $$2 = bae.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
