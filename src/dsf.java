import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dsf extends dse {
   public static final Codec<dsf> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dsf::new));
   protected final List<dfj> h;

   protected static <P extends dsf> P4<Mu<P>, Long, dzp.a, Float, List<dfj>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dfj.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dsf(long $$0, dzp.a $$1, float $$2, List<dfj> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dsc<?> a() {
      return dsc.d;
   }

   @Override
   public dfj a(asc $$0, gw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dfj a(List<dfj> $$0, gw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dfj a(List<dfj> $$0, double $$1) {
      double $$2 = arw.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
