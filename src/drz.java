import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class drz extends dry {
   public static final Codec<drz> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, drz::new));
   protected final List<dfd> h;

   protected static <P extends drz> P4<Mu<P>, Long, dzj.a, Float, List<dfd>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dfd.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public drz(long $$0, dzj.a $$1, float $$2, List<dfd> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected drw<?> a() {
      return drw.d;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dfd a(List<dfd> $$0, gw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dfd a(List<dfd> $$0, double $$1) {
      double $$2 = asb.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
