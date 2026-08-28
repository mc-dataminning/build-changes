import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efu extends eft {
   public static final MapCodec<efu> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efu::new));
   protected final List<dsl> h;

   protected static <P extends efu> P4<Mu<P>, Long, enm.a, Float, List<dsl>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsl.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efu(long $$0, enm.a $$1, float $$2, List<dsl> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efr<?> a() {
      return efr.d;
   }

   @Override
   public dsl a(ayo $$0, ja $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsl a(List<dsl> $$0, ja $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsl a(List<dsl> $$0, double $$1) {
      double $$2 = ayg.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
