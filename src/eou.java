import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eou extends eot {
   public static final MapCodec<eou> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eou::new));
   protected final List<ebe> h;

   protected static <P extends eou> P4<Mu<P>, Long, ewr.a, Float, List<ebe>> b(Instance<P> $$0) {
      return a($$0).and(ayw.b(ebe.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eou(long $$0, ewr.a $$1, float $$2, List<ebe> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eor<?> a() {
      return eor.d;
   }

   @Override
   public ebe a(azx $$0, iv $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected ebe a(List<ebe> $$0, iv $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected ebe a(List<ebe> $$0, double $$1) {
      double $$2 = azo.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
