import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dyi extends dyh {
   public static final Codec<dyi> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dyi::new));
   protected final List<dlj> h;

   protected static <P extends dyi> P4<Mu<P>, Long, efz.a, Float, List<dlj>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dlj.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dyi(long $$0, efz.a $$1, float $$2, List<dlj> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dyf<?> a() {
      return dyf.d;
   }

   @Override
   public dlj a(awp $$0, hz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dlj a(List<dlj> $$0, hz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dlj a(List<dlj> $$0, double $$1) {
      double $$2 = awi.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
