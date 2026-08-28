import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ehz extends ehy {
   public static final MapCodec<ehz> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ehz::new));
   protected final List<duo> h;

   protected static <P extends ehz> P4<Mu<P>, Long, eps.a, Float, List<duo>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(duo.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ehz(long $$0, eps.a $$1, float $$2, List<duo> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ehw<?> a() {
      return ehw.d;
   }

   @Override
   public duo a(azl $$0, je $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected duo a(List<duo> $$0, je $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected duo a(List<duo> $$0, double $$1) {
      double $$2 = azd.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
