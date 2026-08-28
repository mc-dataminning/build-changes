import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class egj extends egi {
   public static final MapCodec<egj> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, egj::new));
   protected final List<dta> h;

   protected static <P extends egj> P4<Mu<P>, Long, eob.a, Float, List<dta>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dta.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public egj(long $$0, eob.a $$1, float $$2, List<dta> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected egg<?> a() {
      return egg.d;
   }

   @Override
   public dta a(ayv $$0, jd $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dta a(List<dta> $$0, jd $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dta a(List<dta> $$0, double $$1) {
      double $$2 = ayn.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
