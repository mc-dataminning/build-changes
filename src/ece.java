import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ece extends ecd {
   public static final Codec<ece> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ece::new));
   protected final List<doz> h;

   protected static <P extends ece> P4<Mu<P>, Long, ejv.a, Float, List<doz>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(doz.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ece(long $$0, ejv.a $$1, float $$2, List<doz> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ecb<?> a() {
      return ecb.d;
   }

   @Override
   public doz a(axr $$0, ib $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected doz a(List<doz> $$0, ib $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected doz a(List<doz> $$0, double $$1) {
      double $$2 = axk.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
