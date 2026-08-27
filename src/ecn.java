import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ecn extends ecm {
   public static final Codec<ecn> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, ecn::new));
   protected final List<dpi> h;

   protected static <P extends ecn> P4<Mu<P>, Long, eke.a, Float, List<dpi>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dpi.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ecn(long $$0, eke.a $$1, float $$2, List<dpi> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eck<?> a() {
      return eck.d;
   }

   @Override
   public dpi a(axt $$0, id $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dpi a(List<dpi> $$0, id $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dpi a(List<dpi> $$0, double $$1) {
      double $$2 = axm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
