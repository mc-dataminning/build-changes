import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dsa extends drz {
   public static final Codec<dsa> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dsa::new));
   protected final List<dfe> h;

   protected static <P extends dsa> P4<Mu<P>, Long, dzk.a, Float, List<dfe>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dfe.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dsa(long $$0, dzk.a $$1, float $$2, List<dfe> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected drx<?> a() {
      return drx.d;
   }

   @Override
   public dfe a(arx $$0, gw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dfe a(List<dfe> $$0, gw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dfe a(List<dfe> $$0, double $$1) {
      double $$2 = ars.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
