import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ekh extends ekg {
   public static final MapCodec<ekh> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekh::new));
   protected final List<dwx> h;

   protected static <P extends ekh> P4<Mu<P>, Long, esc.a, Float, List<dwx>> b(Instance<P> $$0) {
      return a($$0).and(ayi.b(dwx.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ekh(long $$0, esc.a $$1, float $$2, List<dwx> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eke<?> a() {
      return eke.d;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dwx a(List<dwx> $$0, ji $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dwx a(List<dwx> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
