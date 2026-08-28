import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eoc extends eob {
   public static final MapCodec<eoc> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eoc::new));
   protected final List<eao> h;

   protected static <P extends eoc> P4<Mu<P>, Long, evy.a, Float, List<eao>> b(Instance<P> $$0) {
      return a($$0).and(ayu.b(eao.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eoc(long $$0, evy.a $$1, float $$2, List<eao> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected enz<?> a() {
      return enz.d;
   }

   @Override
   public eao a(azv $$0, iv $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected eao a(List<eao> $$0, iv $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected eao a(List<eao> $$0, double $$1) {
      double $$2 = azm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
