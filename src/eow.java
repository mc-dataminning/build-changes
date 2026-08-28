import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eow extends eov {
   public static final MapCodec<eow> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eow::new));
   protected final List<ebg> h;

   protected static <P extends eow> P4<Mu<P>, Long, ewt.a, Float, List<ebg>> b(Instance<P> $$0) {
      return a($$0).and(ayy.b(ebg.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eow(long $$0, ewt.a $$1, float $$2, List<ebg> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eot<?> a() {
      return eot.d;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected ebg a(List<ebg> $$0, iw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected ebg a(List<ebg> $$0, double $$1) {
      double $$2 = azq.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
