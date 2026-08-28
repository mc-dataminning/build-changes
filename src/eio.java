import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eio extends ein {
   public static final MapCodec<eio> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eio::new));
   protected final List<dvd> h;

   protected static <P extends eio> P4<Mu<P>, Long, eqh.a, Float, List<dvd>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dvd.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eio(long $$0, eqh.a $$1, float $$2, List<dvd> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eil<?> a() {
      return eil.d;
   }

   @Override
   public dvd a(azr $$0, jg $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dvd a(List<dvd> $$0, jg $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dvd a(List<dvd> $$0, double $$1) {
      double $$2 = azj.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
