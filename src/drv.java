import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class drv extends dru {
   public static final Codec<drv> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, drv::new));
   protected final List<dez> h;

   protected static <P extends drv> P4<Mu<P>, Long, dzf.a, Float, List<dez>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dez.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public drv(long $$0, dzf.a $$1, float $$2, List<dez> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected drs<?> a() {
      return drs.d;
   }

   @Override
   public dez a(aru $$0, gu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dez a(List<dez> $$0, gu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dez a(List<dez> $$0, double $$1) {
      double $$2 = arp.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
