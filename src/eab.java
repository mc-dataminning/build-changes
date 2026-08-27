import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eab extends eaa {
   public static final Codec<eab> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, eab::new));
   protected final List<dnb> h;

   protected static <P extends eab> P4<Mu<P>, Long, ehs.a, Float, List<dnb>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dnb.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eab(long $$0, ehs.a $$1, float $$2, List<dnb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dzy<?> a() {
      return dzy.d;
   }

   @Override
   public dnb a(axd $$0, ib $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dnb a(List<dnb> $$0, ib $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dnb a(List<dnb> $$0, double $$1) {
      double $$2 = aww.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
