import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dyb extends dya {
   public static final Codec<dyb> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dyb::new));
   protected final List<dlf> h;

   protected static <P extends dyb> P4<Mu<P>, Long, efs.a, Float, List<dlf>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dlf.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dyb(long $$0, efs.a $$1, float $$2, List<dlf> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dxy<?> a() {
      return dxy.d;
   }

   @Override
   public dlf a(awo $$0, hz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dlf a(List<dlf> $$0, hz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dlf a(List<dlf> $$0, double $$1) {
      double $$2 = awh.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
