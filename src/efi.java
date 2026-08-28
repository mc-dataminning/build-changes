import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class efi extends efh {
   public static final MapCodec<efi> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efi::new));
   protected final List<dsd> h;

   protected static <P extends efi> P4<Mu<P>, Long, emz.a, Float, List<dsd>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dsd.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public efi(long $$0, emz.a $$1, float $$2, List<dsd> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eff<?> a() {
      return eff.d;
   }

   @Override
   public dsd a(azh $$0, iz $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dsd a(List<dsd> $$0, iz $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dsd a(List<dsd> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
