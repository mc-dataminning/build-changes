import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ejf extends eje {
   public static final MapCodec<ejf> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejf::new));
   protected final List<dvv> h;

   protected static <P extends ejf> P4<Mu<P>, Long, eqy.a, Float, List<dvv>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dvv.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ejf(long $$0, eqy.a $$1, float $$2, List<dvv> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ejc<?> a() {
      return ejc.d;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dvv a(List<dvv> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dvv a(List<dvv> $$0, double $$1) {
      double $$2 = azm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
