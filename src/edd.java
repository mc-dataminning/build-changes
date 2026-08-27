import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class edd extends edc {
   public static final Codec<edd> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, edd::new));
   protected final List<dpy> h;

   protected static <P extends edd> P4<Mu<P>, Long, eku.a, Float, List<dpy>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dpy.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public edd(long $$0, eku.a $$1, float $$2, List<dpy> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eda<?> a() {
      return eda.d;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dpy a(List<dpy> $$0, im $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dpy a(List<dpy> $$0, double $$1) {
      double $$2 = axw.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
