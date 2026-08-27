import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dox extends dow {
   public static final Codec<dox> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dox::new));
   protected final List<dcb> h;

   protected static <P extends dox> P4<Mu<P>, Long, dwh.a, Float, List<dcb>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dcb.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dox(long $$0, dwh.a $$1, float $$2, List<dcb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dou<?> a() {
      return dou.d;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dcb a(List<dcb> $$0, gu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dcb a(List<dcb> $$0, double $$1) {
      double $$2 = apa.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
