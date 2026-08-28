import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eoh extends eog {
   public static final MapCodec<eoh> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eoh::new));
   protected final List<eat> h;

   protected static <P extends eoh> P4<Mu<P>, Long, ewd.a, Float, List<eat>> b(Instance<P> $$0) {
      return a($$0).and(ayu.b(eat.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eoh(long $$0, ewd.a $$1, float $$2, List<eat> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eoe<?> a() {
      return eoe.d;
   }

   @Override
   public eat a(azv $$0, iv $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected eat a(List<eat> $$0, iv $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected eat a(List<eat> $$0, double $$1) {
      double $$2 = azm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
