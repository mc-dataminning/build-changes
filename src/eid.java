import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eid extends eic {
   public static final MapCodec<eid> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eid::new));
   protected final List<dus> h;

   protected static <P extends eid> P4<Mu<P>, Long, epw.a, Float, List<dus>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dus.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eid(long $$0, epw.a $$1, float $$2, List<dus> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eia<?> a() {
      return eia.d;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dus a(List<dus> $$0, jf $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dus a(List<dus> $$0, double $$1) {
      double $$2 = azf.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
