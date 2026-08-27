import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dsh extends dsg {
   public static final Codec<dsh> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dsh::new));
   protected final List<dfl> h;

   protected static <P extends dsh> P4<Mu<P>, Long, dzr.a, Float, List<dfl>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dfl.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dsh(long $$0, dzr.a $$1, float $$2, List<dfl> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dse<?> a() {
      return dse.d;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dfl a(List<dfl> $$0, gw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dfl a(List<dfl> $$0, double $$1) {
      double $$2 = ary.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
