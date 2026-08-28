import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eiu extends eit {
   public static final MapCodec<eiu> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eiu::new));
   protected final List<dvj> h;

   protected static <P extends eiu> P4<Mu<P>, Long, eqn.a, Float, List<dvj>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dvj.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eiu(long $$0, eqn.a $$1, float $$2, List<dvj> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eir<?> a() {
      return eir.d;
   }

   @Override
   public dvj a(azs $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dvj a(List<dvj> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dvj a(List<dvj> $$0, double $$1) {
      double $$2 = azk.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
