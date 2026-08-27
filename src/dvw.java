import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dvw extends dvv {
   public static final Codec<dvw> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dvw::new));
   protected final List<dja> h;

   protected static <P extends dvw> P4<Mu<P>, Long, edn.a, Float, List<dja>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dja.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dvw(long $$0, edn.a $$1, float $$2, List<dja> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dvt<?> a() {
      return dvt.d;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dja a(List<dja> $$0, hx $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dja a(List<dja> $$0, double $$1) {
      double $$2 = aui.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
