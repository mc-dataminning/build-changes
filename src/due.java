import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class due extends dud {
   public static final Codec<due> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, due::new));
   protected final List<dhi> h;

   protected static <P extends due> P4<Mu<P>, Long, ebv.a, Float, List<dhi>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dhi.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public due(long $$0, ebv.a $$1, float $$2, List<dhi> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dub<?> a() {
      return dub.d;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dhi a(List<dhi> $$0, ht $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dhi a(List<dhi> $$0, double $$1) {
      double $$2 = atm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
