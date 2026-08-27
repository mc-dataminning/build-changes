import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dsx extends dsw {
   public static final Codec<dsx> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dsx::new));
   protected final List<dgb> h;

   protected static <P extends dsx> P4<Mu<P>, Long, eah.a, Float, List<dgb>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dgb.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dsx(long $$0, eah.a $$1, float $$2, List<dgb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dsu<?> a() {
      return dsu.d;
   }

   @Override
   public dgb a(ate $$0, ht $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dgb a(List<dgb> $$0, ht $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dgb a(List<dgb> $$0, double $$1) {
      double $$2 = asy.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
