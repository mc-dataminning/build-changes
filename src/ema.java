import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ema extends elz {
   public static final MapCodec<ema> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ema::new));
   protected final List<dym> h;

   protected static <P extends ema> P4<Mu<P>, Long, etw.a, Float, List<dym>> b(Instance<P> $$0) {
      return a($$0).and(ays.b(dym.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ema(long $$0, etw.a $$1, float $$2, List<dym> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected elx<?> a() {
      return elx.d;
   }

   @Override
   public dym a(azs $$0, jj $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dym a(List<dym> $$0, jj $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dym a(List<dym> $$0, double $$1) {
      double $$2 = azk.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
