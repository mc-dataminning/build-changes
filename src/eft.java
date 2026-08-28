import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eft extends efs {
   public static final MapCodec<eft> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eft::new));
   protected final List<dsk> h;

   protected static <P extends eft> P4<Mu<P>, Long, enk.a, Float, List<dsk>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsk.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eft(long $$0, enk.a $$1, float $$2, List<dsk> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected efq<?> a() {
      return efq.d;
   }

   @Override
   public dsk a(ayo $$0, ja $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsk a(List<dsk> $$0, ja $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsk a(List<dsk> $$0, double $$1) {
      double $$2 = ayg.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
