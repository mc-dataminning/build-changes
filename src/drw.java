import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class drw extends drv {
   public static final Codec<drw> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, drw::new));
   protected final List<dfa> h;

   protected static <P extends drw> P4<Mu<P>, Long, dzg.a, Float, List<dfa>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dfa.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public drw(long $$0, dzg.a $$1, float $$2, List<dfa> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected drt<?> a() {
      return drt.d;
   }

   @Override
   public dfa a(aru $$0, gu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dfa a(List<dfa> $$0, gu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dfa a(List<dfa> $$0, double $$1) {
      double $$2 = arp.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
