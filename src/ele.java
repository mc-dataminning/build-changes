import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ele extends eld {
   public static final MapCodec<ele> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ele::new));
   protected final List<dxu> h;

   protected static <P extends ele> P4<Mu<P>, Long, esz.a, Float, List<dxu>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dxu.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ele(long $$0, esz.a $$1, float $$2, List<dxu> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected elb<?> a() {
      return elb.d;
   }

   @Override
   public dxu a(bam $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dxu a(List<dxu> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dxu a(List<dxu> $$0, double $$1) {
      double $$2 = bae.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
