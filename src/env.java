import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class env extends enu {
   public static final MapCodec<env> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, env::new));
   protected final List<eah> h;

   protected static <P extends env> P4<Mu<P>, Long, evr.a, Float, List<eah>> b(Instance<P> $$0) {
      return a($$0).and(ayu.b(eah.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public env(long $$0, evr.a $$1, float $$2, List<eah> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ens<?> a() {
      return ens.d;
   }

   @Override
   public eah a(azv $$0, iu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected eah a(List<eah> $$0, iu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected eah a(List<eah> $$0, double $$1) {
      double $$2 = azm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
